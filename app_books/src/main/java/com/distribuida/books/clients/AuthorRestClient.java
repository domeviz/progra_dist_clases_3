package com.distribuida.books.clients;

import com.distribuida.books.dtos.AuthorDto;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
// @RegisterRestClient(baseUri = "http://localhost:9090")  // Proxy
//@RegisterRestClient(configKey = "AuthorRestClient")
@RegisterRestClient(baseUri = "stork://my-service")

public interface AuthorRestClient { //la configuracion es AuthorRestClient
    @GET
    @Path("/{id}")
    AuthorDto findById(@PathParam("id") Integer id);
}