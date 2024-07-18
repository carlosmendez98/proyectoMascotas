package com.proyecto.MascotasEntity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable, UserDetails {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuarios")
    private int idusuarios;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "rol")
    private String rol;

    @Column(name = "fecha_de_creacion")
    @Temporal(TemporalType.DATE)
    private Date fecha_de_creacion;

   @OneToMany(mappedBy = "usuarios" , fetch = FetchType.EAGER)
    private Set<PerfilAdoptante> perfilAdoptantes;

  @OneToMany(mappedBy = "idusuario" , fetch = FetchType.EAGER )
    private Set<PerfilRefugio> perfilRefugios;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

       return Stream.of(rol.split(","))
                    .map(String::trim) // Eliminar espacios si los hay
                     .map(SimpleGrantedAuthority::new)
                     .collect(Collectors.toList());

    }

    @Override
    public String getPassword() {
    return this.getContrasena();

    }

    @Override
    public String getUsername() {
    return this.getEmail();

    }

    @Override
    public boolean isAccountNonExpired() {

   return true;
    }

    @Override
    public boolean isAccountNonLocked() {

  return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
 return true;

    }

    @Override
    public boolean isEnabled() {
 return true;

    }

}
