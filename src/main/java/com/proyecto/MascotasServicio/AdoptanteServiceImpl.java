/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MascotasServicio;

import com.proyecto.MascotasDAO.AdoptanteRepository;
import com.proyecto.MascotasEntity.PerfilAdoptante;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos Valencia
 */
@Service
public class AdoptanteServiceImpl implements AdoptantesService {

    @Autowired(required = true)
    AdoptanteRepository adoptanteRepository;

    @Override
    public List<PerfilAdoptante> listadoAdoptantes() {
        return this.adoptanteRepository.findAll();
    }

    @Override
    public PerfilAdoptante RegistrarAdoptante(PerfilAdoptante Adoptante) {

        return this.adoptanteRepository.save(Adoptante);

    }

    @Override
    public Optional<PerfilAdoptante> buscarAdoptanteId(int idAdoptante) {

        return this.adoptanteRepository.findById(idAdoptante);
    }

    @Override
    public void eliminarAdoptante(int idAdoptante) {
        this.adoptanteRepository.deleteById(idAdoptante);

    }

    @Override
    public PerfilAdoptante actualizarAdoptante(PerfilAdoptante Adoptante) {
        return this.adoptanteRepository.save(Adoptante);
    }

}
