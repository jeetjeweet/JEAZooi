package resource;

import dao.PersonDAO;
import model.Person;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Stateless
@Path("person")
public class PersonResource {

    @Inject
    private PersonDAO personDao;

    @GET
    @Produces("application/json")
    public List<Person> all() {
        return personDao.getAll();
    }

    @POST
    @Consumes("application/json")
    public void save(Person person) {
        System.out.println("Pist request save person" + person.toString());

            personDao.save(person);
    }

    @PUT
    @Consumes("application/json")
    public void update(Person person) {
        personDao.update(person);
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    public void delete(@PathParam("id") Long id) {
        Person person = personDao.find(id);
        personDao.delete(person);
    }
}