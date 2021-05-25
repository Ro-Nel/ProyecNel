package bo.edu.ucb.ingsoft.demo.rest.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import bo.edu.ucb.ingsoft.demo.rest.bl.GestionClinicaBl;
import bo.edu.ucb.ingsoft.demo.rest.bl.GestionPersonaBl;
import bo.edu.ucb.ingsoft.demo.rest.dto.Persona;
import bo.edu.ucb.ingsoft.demo.rest.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;



@RestController
public class ClinicaController {

    @GetMapping(path = "/cli")
    public String helloword(){
        return "Hola CLinica de Nelson";
    }
   /* @Autowired
    public DataSource dataSource;

    @Autowired
    private GestionPersonaBl gestionPersonaBl;

    @GetMapping(path = "/persona/{personaId}")
    public ResponseDto findPersonaById(@PathVariable Integer personaId) {
        Persona persona = gestionPersonaBl.findPersonaById(personaId);
        if (persona != null) {
            return new ResponseDto( true, persona, null);
        } else {
            return new ResponseDto( false, null, "No existe la persona con codigo:");
        }
    }

    @GetMapping(path = "/persona")
    public ResponseDto findAllPersonas() {
        return new ResponseDto( true, gestionPersonaBl.findAllPersonas(), null);
    }

    @PostMapping(path = "/persona")
    public ResponseDto createPersona(@RequestBody Persona persona) {
        // Validar que los datos enviados son correctos.
        if (persona.getNombre() == null || persona.getNombre().trim().equals("")) {  // nombre: "     "
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre debe ser obligatorio" );
            return new ResponseDto( false, null, "El nombre debe ser obligatorio");
        }

        if (persona.getApellido() == null || persona.getApellido().trim().equals("")) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El apellido debe ser obligatorio" );
            return new ResponseDto( false, null, "El apellido debe ser obligatorio");
        }

        return new ResponseDto(true, gestionPersonaBl.crearPersona(persona), null);
    }*/

}
