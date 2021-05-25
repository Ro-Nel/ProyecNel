
select * from person;

select * from person
WHERE id_person = 7;

select id_person, first_name, last_name,email,date_of_birth,phone_number,address,city,status from person WHERE id_person = 7;

INSERT INTO person VALUES
    (now(),
                    + 4,'"
                    + person.first_name +"','"
                    + person.last_name +"','"
                    + person.email +"','"
                    + person.date_of_birth +"','"
                    + person.phone_number +"','"
                    + person.address +"','"
                    + person.city+"','"
                    + person.status+"',
                    + now(),
                    + 2,
                    + '127.0.0.1',
                    + now())
