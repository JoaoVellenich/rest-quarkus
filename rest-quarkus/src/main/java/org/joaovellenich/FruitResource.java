package org.joaovellenich;

import jakarta.ws.rs.GET;
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
}
