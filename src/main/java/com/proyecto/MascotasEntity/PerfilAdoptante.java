package com.proyecto.MascotasEntity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "perfiladoptante")
public class PerfilAdoptante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idperfiladoptante")
    private int idperfiladoptante;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Apellido")
    private String Apellido;

    @Column(name = "Direccion")
    private String Direccion;

    @Column(name = "Telefono")
    private String Telefono;

    @Column(name = "historial_de_adopciones")
    private String historial_de_Adopcion;

 @ManyToOne
    @JoinColumn(name = "idusuarios")
    private Usuarios usuarios;
}