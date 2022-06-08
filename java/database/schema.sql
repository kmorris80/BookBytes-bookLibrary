BEGIN TRANSACTION;
 DROP TABLE IF EXISTS users CASCADE; 
 DROP TABLE IF EXISTS book CASCADE;
 DROP TABLE IF EXISTS comments CASCADE;
 DROP TABLE IF EXISTS user_book CASCADE;
 DROP TABLE IF EXISTS user_comments;
 DROP TABLE IF EXISTS forum CASCADE;
 DROP SEQUENCE IF EXISTS seq_user_id CASCADE;

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



 	CREATE TABLE book (
 	book_id Serial PRIMARY KEY,
 	title varChar(100) NOT NULL,
 	author varChar(50) NOT NULL,
 	isbn varChar(50) NOT NULL,
	character varChar(50),
	genre varChar(25),
	keyword varChar(50),
 	new_release boolean,
 	is_read boolean,
 	is_added boolean
 );


 CREATE TABLE forum (
 	forum_id Serial PRIMARY KEY,
 	user_id int NOT NULL,
 	forum_topic varChar(200) NOT NULL,
 	FOREIGN KEY (user_id) REFERENCES users (user_id)
 );

 CREATE TABLE comments (
 	comment_id serial PRIMARY KEY,
	forum_id int NOT NULL,
	comment_title varChar(100) NOT NULL, 
 	comments varChar(250) NOT NULL,
	FOREIGN KEY (forum_id) REFERENCES forum (forum_id)
 );

   CREATE TABLE user_book (
 	book_id int NOT NULL,
 	user_id int NOT NULL,
 	PRIMARY KEY (book_id, user_id),
	FOREIGN KEY (book_id) REFERENCES book (book_id),
 	FOREIGN KEY (user_id) REFERENCES users (user_id)
 );
 
 COMMIT TRANSACTION;
