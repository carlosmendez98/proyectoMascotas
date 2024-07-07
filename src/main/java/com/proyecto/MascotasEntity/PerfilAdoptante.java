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
    @Column(name = "idPerfilAdoptante")
    private int idPerfilAdoptante;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Apellido")
    private String Apellido;

    @Column(name = "Direccion")
    private String Direccion;

    @Column(name = "Telefono")
    private String Telefono;

    @Column(name = "Historial_De_Adopciones")
    private String historialDeAdopcion;

     @ManyToOne
    @JoinColumn(name = "idUsuarios")
    private Usuarios idUsuarios; // relación con el usuario, muchos adoptantes pueden tener 1 usuario

}