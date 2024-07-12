
package com.proyecto.MascotasEntity;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @Column(name = "idrefugio")
    private int idrefugio;
    

    @Column(name = "nombre_refugio")
    private String nombre_refugio;
    
    @Column(name = "Direccion")
    private String Direccion;
    
    @Column(name = "Telefono")
    private String Telefono;
    
       @Column(name = "emailcontacto")
    private String emailcontacto;
    
       @OneToMany(mappedBy = "perfilRefugio")
    private List<Mascotas> mascotas;
    
   @ManyToOne
    @JoinColumn(name = "idusuarios", referencedColumnName = "idusuarios")
    private Usuarios idusuario;
     
}