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

/**
 *
 * @author Carlos Valencia
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired(required = true)
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
       return  usuarioRepository.save(usuario);
    }

}
