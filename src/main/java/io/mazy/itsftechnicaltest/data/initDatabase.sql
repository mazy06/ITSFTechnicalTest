CREATE TABLE Employee
(
    id            SERIAL PRIMARY KEY,
    first_name    VARCHAR(100) NOT NULL,
    last_name     VARCHAR(100) NOT NULL,
    date_of_birth DATE         NOT NULL
);

CREATE TABLE Contract
(
    id                SERIAL PRIMARY KEY,
    employee_id       INT            NOT NULL,
    date_of_signature DATE           NOT NULL,
    duration          INT            NOT NULL, -- Durée du contrat en mois
    salary            DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employee (id)
);

CREATE TABLE Service
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE Employee_Service
(
    employee_id INT NOT NULL,
    service_id  INT NOT NULL,
    PRIMARY KEY (employee_id, service_id),
    FOREIGN KEY (employee_id) REFERENCES Employee (id),
    FOREIGN KEY (service_id) REFERENCES Service (id)
);

CREATE TABLE FamilyMember
(
    id            SERIAL PRIMARY KEY,
    employee_id   INT          NOT NULL,
    first_name    VARCHAR(100) NOT NULL,
    last_name     VARCHAR(100) NOT NULL,
    date_of_birth DATE         NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employee (id)
);

