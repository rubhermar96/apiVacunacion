create database vacunacion_covid19;
USE vacunacion_covid19;
create table comunidades (
id int  NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (50) NOT NULL,
dosis_Pfizer int,
dosis_Moderna int,
dosis_AstraZeneca int,
administradas_totales int,
pauta_completa int
)ENGINE=InnoDB  CHARACTER SET utf8MB4   AUTO_INCREMENT=1;
INSERT INTO comunidades VALUES
(1,"Andalucía",400230,16600,0,329258,104529),
(2,"Aragón",68175,2900,0,61036,15157),
(3,"Asturias",69935,2900,0,61483,22227);
