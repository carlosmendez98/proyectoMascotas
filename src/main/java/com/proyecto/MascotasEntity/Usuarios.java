
package com.proyecto.MascotasEntity;


import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarios")
    private int idUsuarios;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Contrasena")
   private String Contrasena;

    @Column(name = "Rol")
    private String Rol;

    @Column(name = "Fecha_de_Creacion")
    @Temporal(TemporalType.DATE)
    private Date Fecha_de_Creacion;

    @OneToMany(mappedBy = "idUsuarios")
    private List<PerfilAdoptante> perfilAdoptantes;

    @OneToMany(mappedBy = "idUsuarios")
    private List<PerfilRefugio> perfilRefugios;

}