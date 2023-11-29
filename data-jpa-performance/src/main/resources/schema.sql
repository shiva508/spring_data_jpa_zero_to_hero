-- Table: public.customers

DROP TABLE IF EXISTS customers;

CREATE TABLE IF NOT EXISTS customers
(
    id SERIAL primary key,
    email character varying(255) COLLATE pg_catalog."default",
    first_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.customers
    OWNER to dear;

CREATE SEQUENCE IF NOT EXISTS shiva_seq
AS bigint
INCREMENT BY 1
MINVALUE 1  MAXVALUE 99999999999999999
START  WITH  1
OWNED BY  customers.id;

CREATE SEQUENCE sequence_customer
start with 1000
increment by 1
minvalue 1000
maxvalue 99999999999999999
cycle;

CREATE SEQUENCE sequence_comrade
start with 1000
increment by 1
minvalue 1000
maxvalue 99999999999999999
cycle;

select * from dba_sequence;

DROP SEQUENCE sequence_comrade;