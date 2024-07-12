package com.proyecto.MascotasServicio;

import java.util.List;
import com.proyecto.MascotasEntity.Usuarios;
import java.util.Optional;

/**
 *
 * @author Carlos Valencia
 */
public interface UsuarioService {
   
    public List<Usuarios> Usuarios();
    
    public Optional<Usuarios> usuarioPorID(int id);
    
    public Usuarios crearUsuario(Usuarios usuario);
    
    public void eliminarUsuario(int id);
    
    public Usuarios modificarUsuario(Usuarios usuario);
    
    
}
