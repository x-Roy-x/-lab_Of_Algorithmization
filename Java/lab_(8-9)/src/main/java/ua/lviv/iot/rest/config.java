package ua.lviv.iot.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("resources")
public class config extends Application {
    {
        System.out.println("Here");
    }
}
