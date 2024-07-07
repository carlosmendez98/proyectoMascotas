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

/**
 *
 * @author Carlos Valencia
 */

@Service
public class UsuarioServiceImpl  implements UsuarioService  {

    
    @Autowired(required = true)
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuarios> Usuarios() {
     return usuarioRepository.findAll();

    }
    
}
