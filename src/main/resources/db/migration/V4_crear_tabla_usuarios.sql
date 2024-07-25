CREATE TABLE `usuarios` (
  `idusuarios` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(125) DEFAULT NULL,
  `email` varchar(1000) DEFAULT NULL,
  `contrasena` varchar(1000) DEFAULT NULL,
  `rol` varchar(45) DEFAULT NULL,
  `fecha_de_creacion` date DEFAULT NULL,
  PRIMARY KEY (`idusuarios`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='usuario es el encargado de registrar adoptante, refugio, administrador es el encargado de modificar usuarios full crud';
