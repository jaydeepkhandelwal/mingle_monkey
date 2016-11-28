package com.jarvis.mm.resource;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import com.jarvis.mm.error.AppException;

import javax.inject.Singleton;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by jafar.rizvi on 10/09/16.
 */
@Singleton
@Path("/sync")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Slf4j
public class SyncResource {

    public SyncResource() {
    }

    @Path("{id}")
    @GET
    @Timed
    @Metered(name = "getInfo.CallMeter")
    @ExceptionMetered(name = "getInfo.ExceptionMeter", cause = AppException.class)
    public void getInfo(@NotNull @PathParam("id") final String id)
            throws AppException {
/*
        log.info("getInfo called with ID: {}", id);
        try {

        }
        catch (AppException e){
            throw new WebApplicationException(e.getError().getMessage(), e.getError().getCode());
        }
*/
    }

}
