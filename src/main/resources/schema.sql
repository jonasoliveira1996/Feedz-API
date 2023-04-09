CREATE TABLE IF NOT EXISTS public.employees
(
    id bigint NOT NULL,
    admission_at date NOT NULL,
    automatic_celebration integer NOT NULL,
    birth_at date NOT NULL,
    cpf character varying(255) COLLATE pg_catalog."default" NOT NULL,
    department character varying(255) COLLATE pg_catalog."default" NOT NULL,
    description character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    gender character varying(255) COLLATE pg_catalog."default" NOT NULL,
    manager character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    race character varying(255) COLLATE pg_catalog."default" NOT NULL,
    role character varying(255) COLLATE pg_catalog."default" NOT NULL,
    situation character varying(255) COLLATE pg_catalog."default" NOT NULL,
    status integer NOT NULL,
    welcome_email integer NOT NULL,
    id_job bigint,
    CONSTRAINT employees_pkey PRIMARY KEY (id),
    CONSTRAINT fk47ap0id9mfgq3vruxoyajowk7 FOREIGN KEY (id_job)
        REFERENCES public.job (id_job) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

CREATE TABLE IF NOT EXISTS public.job
(
    id_job bigint NOT NULL,
    description character varying(255) COLLATE pg_catalog."default" NOT NULL,
    title character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT job_pkey PRIMARY KEY (id_job)
)