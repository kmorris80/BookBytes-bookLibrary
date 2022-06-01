

DROP TABLE IF EXISTS activity CASCADE;
DROP SEQUENCE IF EXISTS seq_activity_id CASCADE;

BEGIN TRANSACTION;

CREATE SEQUENCE seq_activity_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;
CREATE TABLE activity (
	activity_id int DEFAULT nextval('seq_activity_id'::regclass) NOT NULL,
	user_id serial NOT NULL,
	steps numeric NOT NULL,
	activity_time_min numeric NOT NULL,
	CONSTRAINT PK_activity_id PRIMARY KEY (activity_id),
	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
);	



COMMIT;