DROP TABLE IF EXISTS kids CASCADE;
BEGIN TRANSACTION;

CREATE TABLE kids (
	kid_id serial NOT NULL,
	user_id int NOT NULL,
	parent_id int NOT NULL,
	steps numeric NOT NULL,
	activity_time numeric NOT NULL,
	CONSTRAINT PK_kids PRIMARY KEY (kid_id),
	constraint FK_kids_parents  foreign key (parent_id) references parents (parent_id),
	constraint FK_kids_users  foreign key (user_id) references users (user_id)

);

COMMIT;