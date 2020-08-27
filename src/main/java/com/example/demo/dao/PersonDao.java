package com.example.demo.dao;
//sluzy aby wspierac wiele sposobow dostania sie do bazy danych
import com.example.demo.model.Person;
import java.util.UUID;
public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){  // metoda która generuje losowy numer i wrzuca go do metody wyżej
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }                                            // dwie metody, pierwsza pozwala wpisać osoby z id, a druga bez ID ktore jest randomowe generowane
}
