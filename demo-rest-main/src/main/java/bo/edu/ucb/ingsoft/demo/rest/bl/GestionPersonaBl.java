package bo.edu.ucb.ingsoft.demo.rest.bl;

import bo.edu.ucb.ingsoft.demo.rest.dao.PersonaDao;
import bo.edu.ucb.ingsoft.demo.rest.dto.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionPersonaBl {

    @Autowired
    PersonaDao personaDao;

    public Persona crearPersona(Persona persona) {
        // Computamos el nuemero de seguro social, conformado por los tres primeros caracteres
        // del nombre mas los tres primeros del apelliod
        persona.setNroSS( persona.getNombre().substring(0,3).toUpperCase() + persona.getApellido().substring(0,3));

        return personaDao.crearPersona(persona);
    }

    public Persona findPersonaById(Integer personaId) {
        return personaDao.findPersonaById(personaId);
    }

    public List<Persona> findAllPersonas() {
        return personaDao.findAllPersonas();
    }

}
