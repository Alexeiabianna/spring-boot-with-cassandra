aws --endpoint-url=http://localhost:4566 keyspaces create-cluster --cluster-name cassandra --region us-east-1 --keyspace-name cassandra-local --replication-factor 1
aws --endpoint-url=http://localhost:4566 keyspaces create-table --cli-input-json file://table.json

