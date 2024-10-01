

INSERT INTO monumento (id,codigo_pais, nombre_pais, nombre_ciudad, nombre, ubicacion, descripcion, fecha_construccion) VALUES ('1','FR', 'Francia', 'París', 'Torre Eiffel', 'Champ de Mars, 5 Avenue Anatole France', 'Una torre de hierro pudelado de 330 metros de altura.', '1889-03-31'), ('US', 'Estados Unidos', 'Nueva York', 'Estatua de la Libertad', 'Liberty Island', 'Una colosal escultura neoclásica en Liberty Island.', '1886-10-28'), ('CN', 'China', 'Beijing', 'Gran Muralla China', 'China', 'Una antigua fortificación china construida y reconstruida entre el siglo V a.C. y el siglo XVI.', NULL);


ALTER SEQUENCE monumento_id_seq RESTART WITH 1000;