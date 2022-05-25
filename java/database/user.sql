-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER kids_wellness_owner
WITH PASSWORD 'finalcapstone';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO kids_wellness_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO kids_wellness_owner;

CREATE USER kids_wellness_appuser
WITH PASSWORD 'finalcapstone';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO kids_wellness_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO kids_wellness_appuser;
