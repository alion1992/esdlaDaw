INSERT INTO public.personajes (nombre, raza, fecha_nacimiento, nivel_corrupcion) VALUES
('Frodo Bolsón', 'HUMANO', '2968-09-22', 15),
('Samwise Gamyi', 'HUMANO', '2980-04-06', 5),
('Aragorn', 'HUMANO', '2931-03-01', 10),
('Boromir', 'HUMANO', '2978-02-20', 25),
('Gandalf', 'MAIAR', '1000-01-01', 0),
('Legolas', 'ELFO', '0870-05-10', 0),
('Gimli', 'ENANO', '2879-06-12', 0),
('Galadriel', 'ELFO', '1362-08-01', 5),
('Elrond', 'ELFO', '0580-03-15', 0),
('Saruman', 'MAIAR', '1000-01-01', 80),

('Gollum', 'OSCURO', '2430-01-01', 95),
('Isildur', 'HUMANO', '3209-01-01', 60),
('Théoden', 'HUMANO', '2948-01-01', 30),
('Éowyn', 'HUMANO', '2995-01-01', 10),
('Faramir', 'HUMANO', '2983-01-01', 5),
('Celeborn', 'ELFO', '1300-01-01', 0),
('Thranduil', 'ELFO', '1000-01-01', 0),
('Balrog de Moria', 'OSCURO', '0001-01-01', 100),
('Rey Brujo de Angmar', 'OSCURO', '1300-01-01', 90),
('Radagast', 'MAIAR', '1000-01-01', 5);



INSERT INTO public.anillos (nombre, raza, poder, corrupcion) VALUES
('Anillo Único', 'OSCURO', 'Dominar a todos los demás anillos', 100),

('Narya', 'MAIAR', 'Inspirar esperanza y resistir el desgaste del tiempo', 10),
('Nenya', 'ELFO', 'Preservación y ocultación de reinos élficos', 5),
('Vilya', 'ELFO', 'Sanación y control de los elementos', 5),

('Anillo de Durin', 'ENANO', 'Incrementar la riqueza y la ambición', 40),
('Anillo de Thrór', 'ENANO', 'Aumentar el poder sobre la montaña', 45),
('Anillo de los Enanos del Este', 'ENANO', 'Codicia y resistencia física', 50),

('Anillo de Isildur', 'HUMANO', 'Longevidad y poder militar', 70),
('Anillo de Gondor', 'HUMANO', 'Autoridad y liderazgo', 60),
('Anillo de Arnor', 'HUMANO', 'Influencia sobre los hombres', 65),

('Anillo del Rey Brujo', 'OSCURO', 'Dominio absoluto y terror', 95),
('Anillo de Khamûl', 'OSCURO', 'Percepción de la presencia del Anillo Único', 90),

('Anillo de Celebrimbor', 'ELFO', 'Maestría en la forja y creación', 15),
('Anillo de los Bosques Verdes', 'ELFO', 'Protección de los bosques', 10),
('Anillo de Lórien', 'ELFO', 'Ocultación y pureza', 5);



INSERT INTO public.portadores_anillos
(personaje_id, anillo_id, fecha_inicio, fecha_fin, activo)
VALUES
-- Anillo Único
(1, 1, '3018-09-23', '3019-03-25', false), 
(11, 1, '3019-03-25', NULL, true),          

-- Narya
(5, 2, '2000-01-01', NULL, true),           

-- Nenya
(8, 3, '1000-01-01', NULL, true),           

-- Vilya
(9, 4, '1700-01-01', NULL, true),           

-- Anillos Enanos
(6, 5, '2800-01-01', '2900-01-01', false),  
(7, 6, '2700-01-01', '2950-01-01', false),  

-- Anillos Humanos
(12, 8, '3200-01-01', '3441-03-25', false), 
(3, 9, '3019-01-01', NULL, true),           

-- Nazgûl
(19, 11, '1300-01-01', NULL, true),         
(12, 12, '2250-01-01', NULL, true);         
