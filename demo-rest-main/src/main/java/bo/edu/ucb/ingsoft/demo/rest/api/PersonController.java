package bo.edu.ucb.ingsoft.demo.rest.api;

import bo.edu.ucb.ingsoft.demo.rest.dto.Person;
//import bo.edu.ucb.ingsoft.demo.rest.api.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class PersonController {

    @Autowired
    public DataSource dataSource;


  /*  @GetMapping(path = "/per")
    public Person helloWorld(){
        //Imprimir en el Nabegador Letras
        //return "Hola Persona Nelson";
        //Para imprimir variables locales
  //      Person dummy = new Person();
      //  dummy.personaid = 10;
     //   dummy.nombre = "Juan";
     //   dummy.apellido = "Robles";
     //   return dummy;

        Person result = new Person();
        try{
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            //ResultSet rs =stmt.executeQuery("select id_person, first_name, last_name,email,date_of_birth,phone_number,address,city,status from person WHERE id_person = 7");
            ResultSet rs =stmt.executeQuery("select id_person, first_name, last_name,email,date_of_birth,phone_number,address,city,status from person");
            if (rs.next()){
                result.id_person = rs.getInt("id_person");
                //result.id_geolocation = rs.getInt("id_geolocation");
                result.first_name = rs.getString("first_name");
                result.last_name = rs.getString("last_name");
                result.email = rs.getString("email");
                result.date_of_birth = rs.getDate("date_of_birth");
                result.phone_number = rs.getString("phone_number");
                result.address = rs.getString("address");
                result.city = rs.getString("city");
                result.status = rs.getString("status");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }*/


    @GetMapping(path = "/per")
    public List<Person> findAllPerson(){
       List<Person> result = new ArrayList<>();
        Connection conn = null;
        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id_person, first_name, last_name,email,date_of_birth,phone_number,address,city,status from person");
            while (rs.next()){
                Person persons = new Person();
                persons.id_person = rs.getInt("id_person");
                //persons.id_geolocation = rs.getInt("id_geolocation");
                persons.first_name = rs.getString("first_name");
                persons.last_name = rs.getString("last_name");
                persons.email = rs.getString("email");
                persons.date_of_birth = rs.getDate("date_of_birth");
                persons.phone_number = rs.getString("phone_number");
                persons.address = rs.getString("address");
                persons.city = rs.getString("city");
                persons.status = rs.getString("status");
                result.add(persons);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    @GetMapping(path = "/per/{id_person}")
    public Person findPersonById(@PathVariable Integer id_person){
        Connection conn = null;
        Person result = new Person();
        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id_person, first_name, last_name,email,date_of_birth,phone_number,address,city,status from person WHERE id_person =" + id_person);
            if (rs.next()){
                result.id_person = rs.getInt("id_person");
                //result.id_geolocation = rs.getInt("id_geolocation");
                result.first_name = rs.getString("first_name");
                result.last_name = rs.getString("last_name");
                result.email = rs.getString("email");
                result.date_of_birth = rs.getDate("date_of_birth");
                result.phone_number = rs.getString("phone_number");
                result.address = rs.getString("address");
                result.city = rs.getString("city");
                result.status = rs.getString("status");
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
/*
INSERT INTO person (
id_geolocation,
first_name,
last_name,
email,
date_of_birth,
phone_number,
address,
city,
status,
tx_date,
tx_id_user,
tx_host,
tx_update)
VALUES ( 1, 'Marco',
'Mamani',
'marco123@gmail.com',
'1994-02-19',
'6345678',
'Villa Dolores',
'La Paz',
1,
now(),
2,
'127.0.0.1',
now());
       commit ;
 */

    @PostMapping(path = "/per")
    public Person createPerso(@RequestBody Person person){
        Connection conn = null;
        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            /*INSERT INTO person (id_geolocation,first_name,last_name,email,date_of_birth,phone_number,address,city,status,tx_date,tx_id_user,tx_host,tx_update)
            VALUES (1,'Marco','Mamani','marco123@gmail.com','1994-02-19','6345678','Villa Dolores', 'La Paz',1, now(),2,'127.0.0.1',now());
            commit ;*/
 //           stmt.executeQuery("INSERT INTO person (id_person,id_geolocation,first_name,last_name,email,date_of_birth,phone_number,address,city,status,tx_date,tx_id_user,tx_host,tx_update)            VALUES (",7,person.first_name,person.last_name,person.email ,person.date_of_birth ,person.phone_number,person.address, person.city,1, "2021-05-24 22:57:11.468603",2,"127.0.0.1",2021-05-24+");");
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
