/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Cátia
 */

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class DeliveryWSClient {

    private static final String BASE_URI = "http://localhost:8080/DeliveryServiceWS/deliveryWS";
    
    public static void testCreateCity(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("createCity").queryParam("username", "Adam Hale").queryParam("cityname", "London").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("createCity").queryParam("username", "Adrienne Clark").queryParam("cityname", "Paris").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("createCity").queryParam("username", "Adrienne Clark").queryParam("cityname", "Braga").request().accept(MediaType.TEXT_PLAIN).get(String.class));

    }
    
    public static void testSelectCity(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("selectCity").queryParam("cityname", "Braga").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("selectCity").queryParam("cityname", "London").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
    }
    
    public static void testUpdateCity(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("updateCity").queryParam("username", "Adam Hale").queryParam("oldcityname", "Braga").
                queryParam("newcityname", "London").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("updateCity").queryParam("username", "Adrienne Clark").queryParam("oldcityname", "Braga").
                queryParam("newcityname", "London").request().accept(MediaType.TEXT_PLAIN).get(String.class));

        System.out.println(baseService.path("updateCity").queryParam("username", "Adrienne Clark").queryParam("oldcityname", "Porto").
                queryParam("newcityname", "Lisboa").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
    }
    
    public static void testDeleteCity(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("deleteCity").queryParam("username", "Adam Hale").queryParam("cityname", "Porto").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("deleteCity").queryParam("username", "Adrienne Clark").queryParam("cityname", "Almada").request().accept(MediaType.TEXT_PLAIN).get(String.class));

        System.out.println(baseService.path("deleteCity").queryParam("username", "Adrienne Clark").queryParam("cityname", "Amesterdan").request().accept(MediaType.TEXT_PLAIN).get(String.class));

    }
    
    public static void testCreateRoute(){
       
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("createRoute").queryParam("username", "Adam Hale").queryParam("origin", "Aveiro").
                queryParam("destination", "Lisboa").queryParam("time", 12).queryParam("cost", 34).
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("createRoute").queryParam("username", "Adrienne Clark").queryParam("origin", "Aveiro").
                queryParam("destination", "Lisboa").queryParam("time", 12).queryParam("cost", 34).
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
    
        System.out.println(baseService.path("createRoute").queryParam("username", "Adrienne Clark").queryParam("origin", "Maia").
                queryParam("destination", "Albufeira").queryParam("time", 12).queryParam("cost", 34).
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
    }
    
    public static void testSelectRoute(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("selectRoute").queryParam("origin", "Coimbra").queryParam("destination", "Almada").
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("selectRoute").queryParam("origin", "Maia").queryParam("destination", "Albufeira").
                request().accept(MediaType.TEXT_PLAIN).get(String.class));

    }
    
    public static void testUpdateRoute(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("updateRoute").queryParam("username", "Adam Hale").queryParam("origin", "Aveiro").
                queryParam("destination", "Lisboa").queryParam("time", 12).queryParam("cost", 34).
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("updateRoute").queryParam("username", "Adrienne Clark").queryParam("origin", "Aveiro").
                queryParam("destination", "Lisboa").queryParam("time", 34).queryParam("cost", 12).
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("updateRoute").queryParam("username", "Adrienne Clark").queryParam("origin", "Fafe").
                queryParam("destination", "Faro").queryParam("time", 34).queryParam("cost", 12).
                request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
    }
    
    public static void testDeleteRoute(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("deleteRoute").queryParam("username", "Adam Hale").queryParam("origin", "Aveiro").
                queryParam("destination", "Lisboa").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("deleteRoute").queryParam("username", "Adrienne Clark").queryParam("origin", "Aveiro").
                queryParam("destination", "Lisboa").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
        System.out.println(baseService.path("deleteRoute").queryParam("username", "Adrienne Clark").queryParam("origin", "Fafe").
                queryParam("destination", "Faro").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
    }
    
    public static void testDijkstra(){
        
        Client client = ClientBuilder.newClient();

        WebTarget baseService = client.target(BASE_URI);
        
        System.out.println(baseService.path("getShortestPath").queryParam("origin", "Amadora").queryParam("destination", "Bragança").
                queryParam("measure", "time").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        
    }
    
    
    
    public static void main(String[] args) {
        
        testCreateCity();
        
        testSelectCity();
        
        testUpdateCity();
        
        //testDeleteCity();
        
        testCreateRoute();
        
        testSelectRoute();
        
        testUpdateRoute();
        
        testDeleteRoute();
        
        testDijkstra();
                
    }

}
