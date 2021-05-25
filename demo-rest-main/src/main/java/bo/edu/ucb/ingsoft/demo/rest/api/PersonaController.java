package bo.edu.ucb.ingsoft.demo.rest.api;
/*
1. Tienen que eliminar SQL Injection de todo su codigo.
2. Tiene que solucionar el tema de el cierre de conexiones Try/resources o antiguo
3. EncapsularDto.
4. Tienen que cambiar a ResponseDTO todos los endpoints.
5. Tienen que implementar todos los endpoint REST para dos pantallas
 */
import bo.edu.ucb.ingsoft.demo.rest.bl.GestionPersonaBl;
import bo.edu.ucb.ingsoft.demo.rest.dto.Persona;
import bo.edu.ucb.ingsoft.demo.rest.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;


@RestController
public class PersonaController {

    @Autowired
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
        return new ResponseDto( true, gestionPersonaBl. findAllPersonas(), null);
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
    }

}
