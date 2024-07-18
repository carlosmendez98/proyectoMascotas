/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MascotasServicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.MascotasDAO.UsuarioRepository;
import com.proyecto.MascotasEntity.Usuarios;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Bean;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Carlos Valencia
 */
@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {

    @Autowired()
    private UsuarioRepository usuarioRepository;

    // LISTADO USUARIOS 
    @Override
    public List<Usuarios> Usuarios() {
        return usuarioRepository.findAll();

    }
    // BUSCAR USUARIOS POR ID 

    @Override
    public Optional<Usuarios> usuarioPorID(int id) {
        return usuarioRepository.findById(id);
    }
    // CREAR USUARIOS 

    @Override
    public Usuarios crearUsuario(Usuarios usuario) {
        usuario.setContrasena(new BCryptPasswordEncoder().encode(usuario.getContrasena()));  // encriptar contraseña
        return usuarioRepository.save(usuario);
    }

    // ELIMINAR USUARIOS POR ID 
    @Override
    public void eliminarUsuario(int id) {
        usuarioRepository.deleteById(id);

    }
    // MODIFICAR USUARIOS 

    @Override
    public Usuarios modificarUsuario(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println("Buscando usuario con email: " + email);
        Usuarios usuario = usuarioRepository.findByEmail(email);
        if (usuario == null) {
            System.out.println("NO ENCUENTRA USUARIO para email: " + email);
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        System.out.println("USUARIO ENCONTRADO: " + usuario);
        
        return usuario;
    }
}
