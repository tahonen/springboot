package com.redhat.emeatigers.springboot.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class SpringBootService {

  @Value("${service.message:Hello Worldxxxxx!}")
  String message;

  public String sayHello() {
    return message;
  }

  @GET
  public Response hello() {
    return Response.ok(message,MediaType.APPLICATION_JSON).build();
  }
}
