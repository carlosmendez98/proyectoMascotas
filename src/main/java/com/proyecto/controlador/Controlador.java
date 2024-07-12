
package com.proyecto.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.MascotasEntity.Usuarios;
import com.proyecto.MascotasServicio.UsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/usuarios")
public class Controlador {

    @Autowired
    private UsuarioService usuarioService;
    
    
    // ver el listado de usuarios 
    @GetMapping("")
    public List<Usuarios> listadoUsuarios() {
        return usuarioService.Usuarios();
    }
    
    // obtener usuario por id
        @GetMapping("/{id}")
    public ResponseEntity<Usuarios> usuarioPorID(@PathVariable int id) {
       Optional<Usuarios> usuarioID = this.usuarioService.usuarioPorID(id);
       if(usuarioID.isPresent()){
          return ResponseEntity.ok(usuarioID.get());
       }else{
          return ResponseEntity.notFound().build();
       }
      
    }
    //Insertar Usuario 
    @PostMapping
    public Usuarios crearUsuario(@RequestBody Usuarios usuario){
        return this.usuarioService.crearUsuario(usuario);
    }
    
    // Eliminar Usuario
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id){
     Optional<Usuarios> usuarioID = this.usuarioService.usuarioPorID(id);
     if(usuarioID.isPresent()){
         this.usuarioService.eliminarUsuario(id);
         System.out.println("Usuario Eliminado" + usuarioID.get()); // mensajes en consola 
     }else{
         System.out.println("Usuario NO Encontrado"); // mensajes en consola 
     
     }
    }
    @PutMapping("/{id}")
    public void actualizarUsuario(@RequestBody Usuarios usuario){
         Optional<Usuarios> usuarioID = this.usuarioService.usuarioPorID(usuario.getIdusuarios()   );
       
         if(usuarioID.isPresent()){
            Usuarios usuarioModificar = usuarioID.get();
            usuarioModificar.setNombre(usuario.getNombre());
            usuarioModificar.setEmail(usuario.getEmail());
            usuarioModificar.setContrasena(usuario.getContrasena());
            usuarioModificar.setFecha_de_creacion(usuario.getFecha_de_creacion());
            usuarioModificar.setRol(usuario.getRol());
           this.usuarioService.modificarUsuario(usuarioModificar);
             System.out.println("Usuario Actualizado ID= "  + usuario.getIdusuarios() + "Usuario: " + usuarioModificar);
            
         }else{
             System.out.println("Usuario NO Encontrado NO se modifico USUARIO ");
         }
    }
    
   
        
}