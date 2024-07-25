
package com.proyecto.MascotasServicio;

import com.proyecto.MascotasDAO.RefugioRepository;
import com.proyecto.MascotasEntity.PerfilRefugio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefugioServiceImpl implements RefugioService {
    
    @Autowired(required = true)
    RefugioRepository RefugioRepository;

    @Override
    public List<PerfilRefugio> listadoRefugios() {
     return  this.RefugioRepository.findAll();

    }

    @Override
    public PerfilRefugio RegistrarRefugio(PerfilRefugio Refugio) {
    return this.RefugioRepository.save(Refugio);

    }

    @Override
    public Optional<PerfilRefugio> buscarRefugioId(int idRefugio) {
   return this.RefugioRepository.findById(idRefugio);


    }

    @Override
    public void eliminarRefugio(int idRefugio) {
      this.RefugioRepository.deleteById(idRefugio) ;

    }

    @Override
    public PerfilRefugio actualizarRefugio(PerfilRefugio PerfilRefugio) {
   return this.RefugioRepository.save(PerfilRefugio);

    }
    
}
