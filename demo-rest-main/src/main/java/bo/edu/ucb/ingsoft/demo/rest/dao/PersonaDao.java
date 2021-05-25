package bo.edu.ucb.ingsoft.demo.rest.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import bo.edu.ucb.ingsoft.demo.rest.dto.Persona;
import java.util.List;

@Service
public class PersonaDao {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SequenceDao sequenceDao;

    public Persona crearPersona (Persona persona) {
        persona.setPersonaId(sequenceDao.getPrimaryKeyForTable("persona"));
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO persona VALUES (?,?,?) ");
            stmt.setInt(1, persona.getPersonaId());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getApellido());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException sqex) {
                        // No hacer nada intencionalemte;
                    }
            }
        }
        return persona;
    }

    public Persona findPersonaById(Integer personaId) {
        Persona result = new Persona();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT persona_id, nombre, apellido " +
                     "FROM persona WHERE persona_id = ? ")
        ) {  // TRY WITH RESOURCES
            pstmt.setInt(1, personaId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                result.setPersonaId(rs.getInt("persona_id"));
                result.setNombre(rs.getString("nombre"));
                result.setApellido(rs.getString("apellido"));
            } else { // si no hay valores de BBDD
                result = null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public List<Persona> findAllPersonas() {
        List<Persona> result = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT persona_id, nombre, apellido FROM persona");
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setPersonaId(rs.getInt("persona_id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                result.add(persona);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
