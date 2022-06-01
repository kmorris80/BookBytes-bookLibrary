DROP TABLE IF EXISTS family CASCADE;
DROP TABLE IF EXISTS parents CASCADE;
BEGIN TRANSACTION;
CREATE TABLE family (
	family_id serial NOT NULL,
	user_id int NOT NULL,
	is_parent boolean NOT NULL,
	CONSTRAINT PK_family PRIMARY KEY (family_id),
	CONSTRAINT FK_family_users FOREIGN KEY (user_id) REFERENCES users (user_id)
);	
COMMIT;