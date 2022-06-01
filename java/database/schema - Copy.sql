DROP TABLE IF EXISTS family_users CASCADE;
BEGIN TRANSACTION;
CREATE TABLE family_users (
	family_id int NOT NULL,
	user_id int NOT NULL,
	CONSTRAINT pk_family_users PRIMARY KEY (family_id, user_id),
	constraint fk_family_users_users  foreign key (user_id) references users (user_id),
	constraint fk_family_users_family  foreign key (family_id) references family(family_id)
);

COMMIT;