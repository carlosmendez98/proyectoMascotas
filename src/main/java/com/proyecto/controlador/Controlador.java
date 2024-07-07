
package com.proyecto.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.MascotasEntity.Usuarios;
import com.proyecto.MascotasServicio.UsuarioService;
import java.util.List;


@RestController
public class Controlador {

    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/usuarios")
    public List<Usuarios> listadoUsuarios() {
        return usuarioService.Usuarios();
    }
}