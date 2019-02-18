package model;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Person.findOne", query = "select p from model.Person p where p.id = :id"),
        @NamedQuery(name = "Person.getAll", query = "select p from model.Person p")
}
)
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "name: " + name + "| last name: " + lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName(){
     return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // getter methods
}
