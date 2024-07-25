SELECT Email FROM usuariosCREATE TABLE `mascotas` (
  `idmascotas` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Especie` varchar(45) DEFAULT NULL,
  `Raza` varchar(65) DEFAULT NULL,
  `Edad` int DEFAULT NULL,
  `Tamano` double DEFAULT NULL,
  `Descripcion` varchar(1000) DEFAULT NULL,
  `Fotos` varchar(1000) DEFAULT NULL,
  `Estado` varchar(600) DEFAULT NULL,
  `fechadeingreso` date DEFAULT NULL,
  `id_refugio` int DEFAULT NULL,
  PRIMARY KEY (`idmascotas`),
  KEY `FK7y67v2dyxymprr271o09ic4g6` (`id_refugio`),
  CONSTRAINT `FK7y67v2dyxymprr271o09ic4g6` FOREIGN KEY (`id_refugio`) REFERENCES `perfilrefugio` (`idrefugio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Mascotas tiene relacion entre el refugio  ya que muchas mascotas pueden pertenecer a 1 refugio  Fecha de ingreso la dejo DATE pero puede cambiar Timestamp';
;