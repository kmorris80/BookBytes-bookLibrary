DROP TABLE IF EXISTS parents CASCADE;
DROP TABLE IF EXISTS kids CASCADE;
BEGIN TRANSACTION;

CREATE TABLE parents (
	parent_id serial NOT NULL,
	user_id int NOT NULL,
	CONSTRAINT PK_parents PRIMARY KEY (parent_id),
	CONSTRAINT FK_parents_users FOREIGN KEY (user_id) REFERENCES users (user_id)
);	

CREATE TABLE kids (
	kid_id serial NOT NULL,
	user_id int NOT NULL,
	parent_id int NOT NULL,
	steps numeric NOT NULL,
	activity_time numeric NOT NULL,
	CONSTRAINT PK_kids PRIMARY KEY (kid_id),
	constraint FK_kids_users  foreign key (user_id) references users (user_id),
	constraint FK_kids_parents  foreign key (parent_id) references parents (parent_id)
);

COMMIT;
ROLLBACK;