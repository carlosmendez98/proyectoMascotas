
package com.proyecto.MascotasEntity;


import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name = "perfilrefugio")
public class PerfilRefugio implements Serializable {

    private static final long serialVersionUID  = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRefugio")
    private int idRefugio;
    

    @Column(name = "Nombre_Refugio")
    private String Nombre_Refugio;
    
    @Column(name = "Direccion")
    private String Direccion;
    
    @Column(name = "Telefono")
    private String Telefono;
    
       @Column(name = "emailContacto")
    private String emailContacto;
    
      @OneToMany(mappedBy = "idRefugio")
    private List<Mascotas> mascotas;
    
     @ManyToOne
    @JoinColumn(name = "idUsuarios")
    private Usuarios idUsuarios;
    
     
}