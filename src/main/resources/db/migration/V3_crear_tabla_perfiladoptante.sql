CREATE TABLE `perfiladoptante` (
  `idperfiladoptante` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Direccion` varchar(1000) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `historial_de_adopciones` varchar(1000) DEFAULT NULL,
  `idusuarios` int DEFAULT NULL,
  PRIMARY KEY (`idperfiladoptante`),
  KEY `idUsuario_idx` (`idusuarios`),
  CONSTRAINT `idUsuario` FOREIGN KEY (`idusuarios`) REFERENCES `usuarios` (`idusuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='el adoptante pero esto es un regitro que realiza el usuario  tiene una relacion con Usuario';
