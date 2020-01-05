CREATE TABLE crm_account
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    salt CHAR(10) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password CHAR(64) NOT NULL,
    role_cd CHAR(3) NOT NULL,
    active BOOLEAN NOT NULL,
    account_details_id INT
);

CREATE TABLE crm_account_details
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(45) NOT NULL,
    last_name VARCHAR(45) NOT NULL,
    gender CHAR(1) NOT NULL,
    dob DATE NOT NULL,
    member_since TIMESTAMP NOT NULL
);

CREATE TABLE crm_lookup_account_roles
(
    role_cd CHAR(3) PRIMARY KEY,
    role_desc VARCHAR(45) NOT NULL
);

ALTER TABLE crm_account ADD FOREIGN KEY(account_details_id) REFERENCES crm_account_details(id);