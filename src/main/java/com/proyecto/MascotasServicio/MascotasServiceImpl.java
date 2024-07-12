package com.proyecto.MascotasServicio;

import com.proyecto.MascotasDAO.MascotasRepository;
import com.proyecto.MascotasEntity.Mascotas;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotasServiceImpl implements MascotasService {

    @Autowired(required = true)
    private MascotasRepository mascotasRepository;

    // LISTADO DE MASCOTAS
    @Override
    public List<Mascotas> listadoMascotas() {
        return mascotasRepository.findAll();
    }

    // BUSCAR MASCOTAS POR ID
    @Override
    public Optional<Mascotas> buscarMascotaId(int idMascota) {
        return mascotasRepository.findById(idMascota);

    }

    // ELIMINAR MASCOTAS POR ID 
    @Override
    public void eliminarMascota(int idMascota) {
        mascotasRepository.deleteById(idMascota);

    }

    // PUBLICAR MASCOTA 
    @Override
    public Mascotas publicarMascota(Mascotas mascota) {
        return this.mascotasRepository.save(mascota);
    }
 
    // ACTUALIZAR MASCOTA 
    @Override
    public Mascotas actualizarMascota(Mascotas mascota) {
       return this.mascotasRepository.save(mascota);

    }

}
