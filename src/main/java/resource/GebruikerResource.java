//package resource;
//
//import dao.GebruikerDao;
//import model.Gebruiker;
//
//import javax.ejb.Stateless;
//import javax.enterprise.inject.Produces;
//import javax.inject.Inject;
//import javax.ws.rs.*;
//import java.util.List;
//
//@Stateless
//@Path("Gebruiker")
//public class GebruikerResource {
//
//    @Inject
//    private GebruikerDao gebruikerDao;
//
//    @GET
//    @Produces()
//    public List<Gebruiker> all() {
//        return gebruikerDao.getAll();
//    }
//
//    @POST
//    @Consumes("application/json")
//    public void save(Gebruiker person) {
//        gebruikerDao.save(person);
//    }
//
//    @PUT
//    @Consumes("application/json")
//    public void update(Gebruiker person) {
//        gebruikerDao.update(person);
//    }
//
////    @DELETE
////    @Path("/{id}")
////    @Consumes("application/json")
////    public void delete(@PathParam("id") Long id) {
////        Gebruiker person = gebruikerDao.find(id);
////        gebruikerDao.delete(person);
////    }
//}