//package dao;
//
//import model.Gebruiker;
//
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Stateless
//public class GebruikerDao {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<Gebruiker> getAll() {
//        return entityManager.createNamedQuery("Gebruiker.getAll", Gebruiker.class).getResultList();
//    }
//
////    public Gebruiker find(Long id) {
////        return entityManager.createNamedQuery("Gebruiker.findOne", Gebruiker.class).setParameter("id", id).getSingleResult();
////    }
//
//    public void save(Gebruiker person) {
//        entityManager.persist(person);
//    }
//
//    public void update(Gebruiker person) {
//        entityManager.merge(person);
//    }
//
//    public void delete(Gebruiker person) {
//        entityManager.remove(person);
//    }
//}
