CREATE TABLE TOPIC_TYPE (
	topic_type_id serial PRIMARY KEY,
	TOPIC_TYPE_NAME VARCHAR ( 50 ) UNIQUE NOT NULL,
	TOPIC_TYPE_DESC VARCHAR ( 50 ) NOT NULL
);