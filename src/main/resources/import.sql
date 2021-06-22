INSERT INTO colegio (id_cole, cole_nombre) VALUES ('1', 'El colegio del Olimpo');
 
INSERT INTO CURSO  (id_cur, grado, salon, id_cole) VALUES ('1', '10', 'A', '1');
INSERT INTO CURSO  (id_cur, grado, salon, id_cole) VALUES ('2', '10', 'B', '1');
INSERT INTO CURSO  (id_cur, grado, salon, id_cole) VALUES ('3', '11', 'A', '1');
INSERT INTO CURSO  (id_cur, grado, salon, id_cole) VALUES ('4', '11', 'B', '1');

INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1011','Afrodita');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1012', 'Apolo');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1013', 'Ares');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1021', 'Artemisa');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1022', 'Atenea');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1023', 'Dionisio');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1111', 'Hefesto');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1112', 'Hera');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1121', 'Hermes');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1122', 'Hades');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1123', 'Poseidón');
INSERT INTO estudiante (id_estu, estu_nombre) VALUES ('1124', 'Zeus');

INSERT INTO profesor (id_pro, pro_nombre) VALUES ('1', 'Nemesis');
INSERT INTO profesor (id_pro, pro_nombre) VALUES ('2', 'Priapo');
INSERT INTO profesor (id_pro, pro_nombre) VALUES ('3', 'Iris'); 

INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('1', 'Matemáticas', '1', '1');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('2', 'Español', '2', '1');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('3', 'Ingles básico', '3', '1');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('4', 'Matemáticas', '1', '2');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('5', 'Español', '2', '2');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('6', 'Ingles avanzado', '3', '2');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('7', 'Matemáticas', '1', '3');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('8', 'Pre Icfes', '1', '3');
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('9', 'Matemáticas', '1', '4')
INSERT INTO asignatura (id_asig, asig_nombre, Profesor_id_pro, Curso_id_cur) VALUES ('10', 'Pre Icfes', '1', '4');

INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('1', '1', '1011');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('2', '2', '1011');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('3', '3', '1011');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('4', '1', '1012');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('5', '2', '1012');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('6', '3', '1012');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('7', '1', '1013');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('8', '2', '1013');  
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('9', '3', '1013');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('10', '4', '1021'); 
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('11', '5', '1021');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('12', '6', '1021');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('13', '4', '1022');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('14', '5', '1022');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('15', '6', '1022');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('16', '4', '1023');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('17', '5', '1023');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('18', '6', '1023');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('19', '7', '1111');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('20', '8', '1111');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('21', '7', '1112');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('22', '8', '1112');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('23', '9', '1121')
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('24', '10', '1121');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('25', '9', '1122')
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('26', '10', '1122');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('27', '9', '1123');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('28', '10', '1123');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('29', '9', '1124');
INSERT INTO asignatura_estudiante (id_asigna_estu, Asignatura_id_asig, Estudiante_id_estu) VALUES ('30', '10', '1124');


 