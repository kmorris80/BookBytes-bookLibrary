BEGIN TRANSACTION;
DROP TABLE IF EXISTS kids, parents;

CREATE TABLE parents (
	user_id serial NOT NULL,
	parent_id serial NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(500) NOT NULL,
	CONSTRAINT PK_parent_id PRIMARY KEY (parent_id),
	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id),
	CONSTRAINT UQ_username UNIQUE (username)
);

CREATE TABLE kids (
	user_id serial NOT NULL,
	account_id serial NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	steps numeric NOT NULL,
	points numeric NOT NULL,
	activity_time numeric NOT NULL,
	CONSTRAINT PK_account_id PRIMARY KEY (account_id),
	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id),
	CONSTRAINT FK_parent_id FOREIGN KEY (parent_id) REFERENCES parents (parent_id),
	CONSTRAINT UQ_username UNIQUE (username)
	
	
);


COMMIT;

  
