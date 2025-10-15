drop table if exists students;
-- Esquema de la taula students
CREATE TABLE students(
    id BIGINT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    cognom VARCHAR(100) DEFAULT NULL,
    age INT DEFAULT NULL,
    cicle VARCHAR(100) NOT NULL,
    anyo INT DEFAULT 0
);
