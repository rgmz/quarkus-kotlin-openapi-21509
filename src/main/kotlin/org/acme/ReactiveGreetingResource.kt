package org.acme

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

data class Greeting(val message: String = "Hello, world!")

@Path("/hello")
class ReactiveGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    suspend fun hello(): Greeting = Greeting()
}