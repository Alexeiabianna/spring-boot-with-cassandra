CREATE KEYSPACE cassandra WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

CREATE TABLE cassandra.user_data (name text, id uuid, PRIMARY KEY (id));