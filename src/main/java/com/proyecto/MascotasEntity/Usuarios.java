package com.proyecto.MascotasEntity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @Column(name = "idusuarios")
    private int idusuarios;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Email")
    private String email;

    @Column(name = "Contrasena")
    private String contrasena;

    @Column(name = "Rol")
    private String rol;

    @Column(name = "fecha_de_creacion")
    @Temporal(TemporalType.DATE)
    private Date fecha_de_creacion;

   @OneToMany(mappedBy = "usuarios")
    private List<PerfilAdoptante> perfilAdoptantes;

  @OneToMany(mappedBy = "idusuario")
    private List<PerfilRefugio> perfilRefugios;

}
