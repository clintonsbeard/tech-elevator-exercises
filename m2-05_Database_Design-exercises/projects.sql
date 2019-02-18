DROP TABLE IF EXISTS employee_job;
DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS employee_department;
DROP TABLE IF EXISTS job;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
        employee_id serial primary key,
        job_title varchar(100) not null,
        last_name varchar(100) not null,
        first_name varchar(100) not null,
        gender varchar(25),
        date_of_birth varchar(10) not null,
        date_of_hire varchar(10) not null
);

CREATE TABLE department
(
        department_id serial primary key,
        name varchar(100) not null,
        employee_count integer not null check (employee_count >= 0)
);

CREATE TABLE project
(
        project_id serial primary key,
        name varchar(100) not null,
        start_date varchar(10) not null,
        employee_count integer not null check (employee_count >= 0)
);

CREATE TABLE employee_department
(
        employee_id int not null,
        department_id int not null,
        
        constraint fk_employee_department_employee_id foreign key (employee_id) references employee (employee_id),
        constraint fk_employee_department_department_id foreign key (department_id) references department (department_id)
);

CREATE TABLE employee_project
(
        employee_id int not null,
        project_id int not null,
        
        constraint fk_employee_project_employee_id foreign key (employee_id) references employee (employee_id),
        constraint fk_employee_project_project_id foreign key (project_id) references project (project_id)
);

INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Developer', 'Beardsley', 'Clinton', 'Male', '06/24/1990', '02/15/2019');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Baby', 'Babyman', 'Mister', 'Baby', '02/15/1990', '02/15/2019');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Musician', 'Jon Bovi', 'Bon', 'Male', '03/02/1962', '03/02/1982');
INSERT INTO employee (job_title, last_name, first_name, date_of_birth, date_of_hire)
VALUES ('Superhero', 'Spiderman', 'Clarence', '05/05/1980', '04/23/1996');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('History', 'Jeff', 'Beef', 'Female', '01/01/0001', '01/08/0001');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Tank Engine', 'Thomas', 'Thomas', 'Male', '06/24/1990', '02/15/2019');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Debris Retrieval', 'Garbanzo', 'Ambien', 'Female', '09/12/2001', '11/11/2011');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Accounts Receivable', 'Jane', 'Beef', 'Male', '01/02/0001', '01/01/0001');

INSERT INTO department (name, employee_count)
VALUES ('Research & Development', 2);
INSERT INTO department (name, employee_count)
VALUES ('Human Resources', 2);
INSERT INTO department (name, employee_count)
VALUES ('Production', 4);

INSERT INTO project (name, start_date, employee_count)
VALUES ('Project Matrix', '7/25/1997', 2);
INSERT INTO project (name, start_date, employee_count)
VALUES ('Classified R&D', '1/01/0001', 3);
INSERT INTO project (name, start_date, employee_count)
VALUES ('Botany', '2/15/2019', 1);
INSERT INTO project (name, start_date, employee_count)
VALUES ('Calisthenics', '9/09/1990', 2);

INSERT INTO employee_department (employee_id, department_id) VALUES (1, 3);
INSERT INTO employee_department (employee_id, department_id) VALUES (2, 1);
INSERT INTO employee_department (employee_id, department_id) VALUES (3, 3);
INSERT INTO employee_department (employee_id, department_id) VALUES (4, 2);
INSERT INTO employee_department (employee_id, department_id) VALUES (5, 1);
INSERT INTO employee_department (employee_id, department_id) VALUES (6, 3);
INSERT INTO employee_department (employee_id, department_id) VALUES (7, 2);
INSERT INTO employee_department (employee_id, department_id) VALUES (8, 3);

INSERT INTO employee_project (employee_id, project_id) VALUES (1, 4);
INSERT INTO employee_project (employee_id, project_id) VALUES (2, 2);
INSERT INTO employee_project (employee_id, project_id) VALUES (3, 1);
INSERT INTO employee_project (employee_id, project_id) VALUES (4, 1);
INSERT INTO employee_project (employee_id, project_id) VALUES (5, 2);
INSERT INTO employee_project (employee_id, project_id) VALUES (6, 3);
INSERT INTO employee_project (employee_id, project_id) VALUES (7, 4);
INSERT INTO employee_project (employee_id, project_id) VALUES (8, 2);

--SELECT * FROM employee;
--SELECT * FROM department;
--SELECT * FROM project;
--SELECT * FROM employee_department;
--SELECT * FROM employee_project;