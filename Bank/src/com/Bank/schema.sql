CREATE TABLE accounts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    balance DOUBLE
);

CREATE TABLE transactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    account_id INT,
    type VARCHAR(20),
    amount DOUBLE,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);