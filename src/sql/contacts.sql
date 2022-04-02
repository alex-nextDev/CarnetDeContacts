CREATE TABLE contacts(id_cont int(6) NOT NULL AUTO_INCREMENT,
                      nom_cont varchar(250) NOT NULL,
                      prenom_cont varchar(250) NOT NULL,
                      mail_cont varchar(250) NOT NULL,
                      tel_cont varchar(250) NOT NULL,
                      CONSTRAINT pk_contact PRIMARY KEY (id_cont)
                     );
