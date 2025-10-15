drop table if exists students;
CREATE TABLE students(
    id BIGSERIAL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    cognom VARCHAR(100) DEFAULT NULL,
    age INT DEFAULT NULL,
    cicle VARCHAR(100) NOT NULL,
    anyo INT DEFAULT 0
);
