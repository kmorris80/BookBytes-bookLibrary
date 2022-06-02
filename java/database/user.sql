-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER library_capstone_owner
WITH PASSWORD 'finalcapstone';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO library_capstone_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO library_capstone_owner;

CREATE USER library_capstones_appuser
WITH PASSWORD 'finalcapstone';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO library_capstone_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO library_capstone_appuser;
