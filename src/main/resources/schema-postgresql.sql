DROP TABLE IF EXISTS agendas;

CREATE TABLE agenda (
  agenda_ID INT NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  agenda varchar(300) NOT NULL,
  complete BOOL NOT NULL DEFAULT '0',
)