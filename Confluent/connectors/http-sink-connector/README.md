# HTTP Sink Connector
HTTP Sink Connector reads data from kafka topic and calls specified endpoint and post data on endpoint. It integrates Kafka with an API via HTTP or HTTPS.
The connector consumes records from Kafka topic(s) and converts each record value to a String before sending it in the request body to the configured http.api.url, which optionally can reference the record key and/or topic name. The targeted API must support either a POST or PUT request.

The connector batches records up to the set batch.max.size before sending the batched request to the API. Each record is converted to its String representation and then separated with the batch.separator.

The HTTP Sink Connector supports connecting to APIs using SSL along with Basic Authentication, OAuth2, or a Proxy Authentication Server.

# Reference Link
https://docs.confluent.io/current/connect/kafka-connect-http/index.html
