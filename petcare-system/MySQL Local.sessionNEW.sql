CREATE TABLE IF NOT EXISTS owners (
     id INT AUTO_INCREMENT PRIMARY KEY,
     owner_name VARCHAR(50) NOT NULL,
      owner_email VARCHAR(50) NOT NULL,
          owner_phone VARCHAR(12) NOT NULL,
          owner_address VARCHAR(50) NOT NULL,
          owner_city CHAR(50) NOT NULL

);

INSERT INTO owners (owner_name, owner_email,owner_phone,owner_address,owner_city) VALUES 
     ('markeez_ehab', 'aha2aha2@riles.com','01221724011','nasr city','cairo'),
     ('batool_wesam', 'batoola@foola.com','01221741565','shorba','cairo'),
     ('riles_kacimi','survival@mode.com','01112154585','leon','cairo');

SELECT * FROM owners;

-- ........................................................................


CREATE TABLE IF NOT EXISTS pets (
     id INT AUTO_INCREMENT PRIMARY KEY,
     pet_name VARCHAR(50) NOT NULL,
     pet_gender VARCHAR(20) NOT NULL,
     pet_breed VARCHAR(50) NOT NULL,
     pet_birthdate DATE NOT NULL,
     pet_weight DECIMAL(5,2) NOT NULL,
     pet_color VARCHAR(20) NOT NULL,
     owner_id INT,
     FOREIGN KEY (owner_id) REFERENCES owners(id) ON DELETE CASCADE

);


INSERT INTO pets (pet_name, pet_gender, pet_breed, pet_birthdate, pet_weight, pet_color) VALUES 
     ('maylo', 'male', 'griffon', '2015-12-05', 10.0, 'white'),
     ('falco', 'female', 'cowcat', '2021-12-04', 4.5, 'black'),
     ('nino', 'female', 'golden fish', '2022-12-03', 0.5, 'golden');

SELECT * FROM pets;

-- L GDDEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEDDDDDDDDDDD

-- L ID BYZEED LWA7DO SUBHANALLAH WOOOWWWWWWW
CREATE TABLE IF NOT EXISTS owners (
     id INT AUTO_INCREMENT PRIMARY KEY,
     owner_name VARCHAR(50) NOT NULL,
     owner_email VARCHAR(50) NOT NULL,
     owner_phone VARCHAR(12) NOT NULL,
     owner_address VARCHAR(50) NOT NULL,
     owner_city CHAR(50) NOT NULL
);

INSERT INTO owners (owner_name, owner_email, owner_phone, owner_address, owner_city) VALUES 
     ('markeez_ehab', 'aha2aha2@riles.com', '01221724011', 'nasr city', 'cairo'),
     ('batool_wesam', 'batoola@foola.com', '01221741565', 'shorba', 'cairo'),
     ('riles_kacimi', 'survival@mode.com', '01112154585', 'leon', 'cairo');

SELECT * FROM owners;

-- .........................................................................................................

--  7ateet l fk bta3 l owner
CREATE TABLE IF NOT EXISTS pets (
     id INT AUTO_INCREMENT PRIMARY KEY,
     pet_name VARCHAR(50) NOT NULL,
     pet_gender VARCHAR(20) NOT NULL,
     pet_breed VARCHAR(50) NOT NULL,
     pet_birthdate DATE NOT NULL,
     pet_weight DECIMAL(5,2) NOT NULL,
     pet_color VARCHAR(20) NOT NULL,
     owner_id INT,
     FOREIGN KEY (owner_id) REFERENCES owners(id) ON DELETE CASCADE
);

-- kol pet l owner bta3o maktob l id bta3o gambo
INSERT INTO pets (pet_name, pet_gender, pet_breed, pet_birthdate, pet_weight, pet_color, owner_id) VALUES 
     ('maylo', 'male', 'griffon', '2015-12-05', 10.0, 'white', 1),
     ('falco', 'female', 'cowcat', '2021-12-04', 4.5, 'black', 2),
     ('nino', 'female', 'golden fish', '2022-12-03', 0.5, 'golden', 3);

SELECT * FROM pets;