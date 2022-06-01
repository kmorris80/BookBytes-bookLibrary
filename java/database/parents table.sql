DROP TABLE IF EXISTS parents CASCADE;
BEGIN TRANSACTION;

CREATE TABLE parents (
	parent_id serial NOT NULL,
	user_id int NOT NULL,
	CONSTRAINT PK_parents PRIMARY KEY (parent_id),
	CONSTRAINT FK_parents_users FOREIGN KEY (user_id) REFERENCES users (user_id)
);	


COMMIT;
ROLLBACK;