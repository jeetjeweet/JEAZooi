//package model;
//
//import javax.persistence.*;
//
//@Entity
//@NamedQueries({
//        @NamedQuery(name = "Gebruiker.getAll", query = "select p from model.Gebruiker p")
//}
//)
//public class Gebruiker {
//
//    @Id
//    @GeneratedValue
//    private long id;
//    private String name;
//    private String lastName;
//
//    public Gebruiker() {
//    }
//
//    public Gebruiker(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//    }
//}