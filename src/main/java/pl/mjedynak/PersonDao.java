package pl.mjedynak;

import pl.mjedynak.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();

    void addPerson(Person person);
}
