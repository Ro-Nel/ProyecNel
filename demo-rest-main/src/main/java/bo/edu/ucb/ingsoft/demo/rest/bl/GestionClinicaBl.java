package bo.edu.ucb.ingsoft.demo.rest.bl;

import bo.edu.ucb.ingsoft.demo.rest.dao.ClinicaDao;
import bo.edu.ucb.ingsoft.demo.rest.dao.PersonaDao;
import bo.edu.ucb.ingsoft.demo.rest.dto.Clinica;
import bo.edu.ucb.ingsoft.demo.rest.dto.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionClinicaBl {

    @Autowired
    ClinicaDao clinicaDao;

    public Clinica crearClinica (Clinica clinica) {
        // Computamos el nuemero de seguro social, conformado por los tres primeros caracteres
        // del nombre mas los tres primeros del apelliod
        clinica.setNroSS( clinica.getNombre().substring(0,3).toUpperCase() + clinica.getApellido().substring(0,3));

        return clinicaDao.crearClinica(clinica);
    }

    public Persona findPersonaById(Integer personaId) {
        return clinicaDao.findPersonaById(personaId);
    }

    public List<Persona> findAllPersonas() {
        return clinicaDao.findAllPersonas();
    }

}
