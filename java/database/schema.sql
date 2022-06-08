BEGIN TRANSACTION;
 DROP TABLE IF EXISTS users CASCADE; 
 DROP TABLE IF EXISTS book CASCADE;
 DROP TABLE IF EXISTS user_comments CASCADE;
 DROP TABLE IF EXISTS comments CASCADE;
 DROP TABLE IF EXISTS user_book CASCADE;
 DROP TABLE IF EXISTS forum CASCADE;
 DROP SEQUENCE IF EXISTS seq_user_id CASCADE;
 DROP SEQUENCE IF EXISTS seq_book_id CASCADE;
 DROP SEQUENCE IF EXISTS seq_comment_id CASCADE;
 DROP SEQUENCE IF EXISTS seq_forum_id CASCADE;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	is_system_admin boolean,
	CONSTRAINT PK_user PRIMARY KEY (user_id)

);

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');


  CREATE SEQUENCE seq_book_id
 START WITH 101
   INCREMENT BY 1
   NO MAXVALUE
   NO MINVALUE
   CACHE 1;


 	 CREATE TABLE book (
 	book_id int DEFAULT nextval('seq_book_id'::regclass) NOT NULL,
 	title varChar(100) NOT NULL,
 	author varChar(50) NOT NULL,
 	isbn varChar(50) NOT NULL,
	character varChar(50),
	genre varChar(25),
	keyword varChar(50),
 	new_release boolean,
 	is_read boolean,
 	is_added boolean,
 	CONSTRAINT PK_book_id PRIMARY KEY (book_id)

 );

	 
  CREATE SEQUENCE seq_forum_id
 START WITH 10001
   INCREMENT BY 1
   NO MAXVALUE
   NO MINVALUE
   CACHE 1;

 CREATE TABLE forum (
 	forum_id int DEFAULT nextval('seq_forum_id'::regclass) NOT NULL,
 	user_id int NOT NULL,
 	forum_topic varChar(200) NOT NULL,
	forum_date date NOT NULL, 
 	CONSTRAINT PK_forum_id PRIMARY KEY (forum_id),
 	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
 );
	

 CREATE SEQUENCE seq_comment_id
 START WITH 1001
   INCREMENT BY 1
   NO MAXVALUE
   NO MINVALUE
   CACHE 1;

 CREATE TABLE comments (
 	comment_id int DEFAULT nextval('seq_comment_id'::regclass) NOT NULL,
 	comment_by int NOT NULL,
	forum_id int NOT NULL,
	comment_title varChar(100) NOT NULL, 
 	comments varChar(250) NOT NULL,
	comment_date date, 
 	CONSTRAINT PK_comment_id PRIMARY KEY (comment_id),
 	CONSTRAINT FK_comment_by FOREIGN KEY (comment_by) REFERENCES users (user_id),
	CONSTRAINT FK_forum_id FOREIGN KEY (forum_id) REFERENCES forum (forum_id)
 );

   CREATE TABLE user_comments (
 	comment_id int NOT NULL,
 	user_id serial NOT NULL,
 	CONSTRAINT PK_user_comment_id PRIMARY KEY (comment_id, user_id),
	CONSTRAINT FK_comment_id FOREIGN KEY (comment_id) REFERENCES comments (comment_id),
 	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
 );

 
   CREATE TABLE user_book (
 	book_id int NOT NULL,
 	user_id serial NOT NULL,
 	CONSTRAINT PK_user_book_id PRIMARY KEY (book_id, user_id),
	CONSTRAINT FK_book_id FOREIGN KEY (book_id) REFERENCES book (book_id),
 	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
 );
 
 COMMIT TRANSACTION;
