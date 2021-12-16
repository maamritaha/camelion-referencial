CREATE TABLE IF NOT EXISTS references_values (
  id INTEGER NOT NULL CONSTRAINT reference_values_pkey PRIMARY KEY ,
  reference_code VARCHAR(255) NOT NULL,
  value_code VARCHAR(255) NOT NULL,
  description VARCHAR(255),
  created_by VARCHAR(255) NOT NULL,
  created_date TIMESTAMP NOT NULL DEFAULT NOW(),
  last_modified_date TIMESTAMP NOT NULL DEFAULT NOW(),
  last_modified_by VARCHAR(255) NOT NULL,

  CONSTRAINT reference_code_unique UNIQUE (reference_code)
);
