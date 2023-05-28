CREATE KEYSPACE cassandra-local
WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};

USE cassandra-local;

CREATE TABLE users (
    id UUID PRIMARY KEY,
    name text,
);
