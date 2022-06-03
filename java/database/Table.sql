

BEGIN TRANSACTION;
 DROP TABLE IF EXISTS reading_list CASCADE;
 DROP TABLE IF EXISTS book_reading_list CASCADE;
 DROP TABLE IF EXISTS book CASCADE;
 DROP TABLE IF EXISTS user_comments CASCADE;
 DROP TABLE IF EXISTS comments CASCADE;
 DROP SEQUENCE IF EXISTS seq_reading_id CASCADE;
 DROP SEQUENCE IF EXISTS seq_book_id CASCADE;
 DROP SEQUENCE IF EXISTS seq_comment_id CASCADE;

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
 	new_release boolean NOT NULL,
 	CONSTRAINT PK_book_id PRIMARY KEY (book_id)

 );
 COMMIT;
CREATE SEQUENCE seq_reading_id
 START WITH 1
   INCREMENT BY 1
   NO MAXVALUE
   NO MINVALUE
   CACHE 1;

 CREATE TABLE reading_list (
 	reading_id int DEFAULT nextval('seq_reading_id'::regclass) NOT NULL,
 	user_id serial NOT NULL,
	isRead boolean NOT NULL,
 	CONSTRAINT PK_reading_id PRIMARY KEY (reading_id),
 	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)

 );
 COMMIT;
 
  CREATE TABLE book_reading_list (
 	reading_id int NOT NULL,
 	user_id serial NOT NULL,
 	CONSTRAINT PK_reading_user_id PRIMARY KEY (reading_id, user_id),
	CONSTRAINT FK_reading_id FOREIGN KEY (reading_id) REFERENCES reading_list (reading_id),
 	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
 );
 COMMIT;
 
 CREATE SEQUENCE seq_comment_id
 START WITH 1001
   INCREMENT BY 1
   NO MAXVALUE
   NO MINVALUE
   CACHE 1;

 CREATE TABLE comments (
 	comment_id int DEFAULT nextval('seq_comment_id'::regclass) NOT NULL,
 	comment_by int NOT NULL,
 	comments varChar(200) NOT NULL,
	comment_date date NOT NULL, 
 	CONSTRAINT PK_comment_id PRIMARY KEY (comment_id),
 	CONSTRAINT FK_comment_by FOREIGN KEY (comment_by) REFERENCES users (user_id)
 );
 COMMIT;
 
   CREATE TABLE user_comments (
 	comment_id int NOT NULL,
 	user_id serial NOT NULL,
 	CONSTRAINT PK_user_comment_id PRIMARY KEY (comment_id, user_id),
	CONSTRAINT FK_comment_id FOREIGN KEY (comment_id) REFERENCES comments (comment_id),
 	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
 );
 COMMIT;
 

 

