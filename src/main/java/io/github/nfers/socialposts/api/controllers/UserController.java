package io.github.nfers.socialposts.api.controllers;

import io.github.nfers.socialposts.user.entities.dto.CreateUserRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserController {

    @POST
    public Response createUser(CreateUserRequest userRequest) {
        return Response.ok().entity(userRequest).build();
    }

}
