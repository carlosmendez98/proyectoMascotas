CREATE TABLE `perfilrefugio` (
  `idrefugio` int NOT NULL AUTO_INCREMENT,
  `nombre_refugio` varchar(200) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `emailcontacto` varchar(1000) DEFAULT NULL,
  `idusuarios` int DEFAULT NULL,
  PRIMARY KEY (`idrefugio`),
  KEY `idUsuarioRefugio_idx` (`idusuarios`),
  CONSTRAINT `idUsuariosRefugio` FOREIGN KEY (`idusuarios`) REFERENCES `usuarios` (`idusuarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Refugio es registrado por el Usuario y tiene una relación entre usuario y refugio ya que cada usuario tiene muchos refugios y tiene una relación entre mascotas ya que cada refugio puede tener muchas mascotas';
