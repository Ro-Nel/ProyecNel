package bo.edu.ucb.ingsoft.demo.rest.dto;

import java.sql.Date;

public class Person {
    // public Integer personaid;
   // public String nombre;
   // public String apellido;

/*    private Integer id_person;
   // private Integer id_geolocation;
    private String first_name;
    private String last_name;
    private String email;
    private Date date_of_birth;
    private String phone_number;
    private String address;
    private String city;
    private String status;
*/


    public Integer id_person;
    // private Integer id_geolocation;
    public String first_name;
    public String last_name;
    public String email;
    public Date date_of_birth;
    public String phone_number;
    public String address;
    public String city;
    public String status;
    public Person(){

    }

    public Integer getId_person() {
        return id_person;
    }

    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
