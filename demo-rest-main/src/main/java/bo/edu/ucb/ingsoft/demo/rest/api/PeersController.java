package bo.edu.ucb.ingsoft.demo.rest.api;
import bo.edu.ucb.ingsoft.demo.rest.dto.Peers;
//import bo.edu.ucb.ingsoft.demo.rest.api.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PeersController {
    @Autowired
    public DataSource dataSource;




    @GetMapping(path = "/peers")
    public List<Peers> findAllPerson(){
        List<Peers> result = new ArrayList<>();
        Connection conn = null;
        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id_person,id_geolocation, first_name, last_name,email,date_of_birth,phone_number,address,city,status from person");
            while (rs.next()){
                Peers peers = new Peers();
                peers.id_person = rs.getInt("id_person");
                peers.id_geolocation = rs.getInt("id_geolocation");
                peers.first_name = rs.getString("first_name");
                peers.last_name = rs.getString("last_name");
                peers.email = rs.getString("email");
                peers.date_of_birth = rs.getDate("date_of_birth");
                peers.phone_number = rs.getString("phone_number");
                peers.address = rs.getString("address");
                peers.city = rs.getString("city");
                peers.status = rs.getString("status");
                result.add(peers);
            }
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
        return result;
    }




    @PostMapping(path = "/Peers")
    public Peers createPeers(@RequestBody Peers person){
        Connection conn = null;
        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            /*INSERT INTO person (id_geolocation,first_name,last_name,email,date_of_birth,phone_number,address,city,status,tx_date,tx_id_user,tx_host,tx_update)
            VALUES (1,'Marco','Mamani','marco123@gmail.com','1994-02-19','6345678','Villa Dolores', 'La Paz',1, now(),2,'127.0.0.1',now());
            commit ;*/
           // stmt.executeQuery("INSERT INTO person (id_person,id_geolocation,first_name,last_name,email,date_of_birth,phone_number,address,city,status,tx_date,tx_id_user,tx_host,tx_update)            VALUES (",7,person.first_name,person.last_name,person.email ,person.date_of_birth ,person.phone_number,person.address, person.city,1, "2021-05-24 22:57:11.468603",2,"127.0.0.1",2021-05-24+");");
            /*stmt.executeQuery("INSERT INTO person VALUES ("
                    + "now(),"//person.id_person
                    +",4,'"
                    + person.first_name +"','"
                    + person.last_name +"','"
                    + person.email +"','"
                    + person.date_of_birth +"','"
                    + person.phone_number +"','"
                    + person.address +"','"
                    + person.city +"','"
                    + person.status +"',"
                    + "now(),"
                    + "2+,"
                    + "127.0.0.1,"
                    + "now())");
*/

               /* Person persons = new Person();
                person.id_person = rs.getInt("id_person");
                //persons.id_geolocation = rs.getInt("id_geolocation");
                person.first_name = rs.getString("first_name");
                person.last_name = rs.getString("last_name");
                person.email = rs.getString("email");
                person.date_of_birth = rs.getDate("date_of_birth");
                person.phone_number = rs.getString("phone_number");
                person.address = rs.getString("address");
                person.city = rs.getString("city");
                person.status = rs.getString("status");*/
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
        return person;
    }

}
