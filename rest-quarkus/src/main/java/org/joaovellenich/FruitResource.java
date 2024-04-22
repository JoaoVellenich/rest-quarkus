package org.joaovellenich;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.joaovellenich.entity.Fruit;

import java.util.List;

@Path("/fruit")
public class FruitResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruit> list() {
        return Fruit.listAll();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Fruit create(){
        Fruit newFruit = new Fruit();
        newFruit.name = "Pera";
        newFruit.quantity = 5;
        newFruit.persist();
        return newFruit;
    }
}
