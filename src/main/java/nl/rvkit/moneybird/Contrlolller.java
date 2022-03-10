package nl.rvkit.moneybird;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import nl.rvkit.moneybird.domain.Contact;
import nl.rvkit.moneybird.domain.Workflow;

import java.util.List;

@Controller("/moneybird")
public class Contrlolller {
    private final MoneyBirdApiClient client;

    public Contrlolller(MoneyBirdApiClient client) {
        this.client = client;
    }

    @Get("/test")
    List<Contact> test(){
        return client.getAllContacts();
    }

    @Get("/test2")
    List<Workflow> test2(){
        return client.getAllWorkflows();
    }


}
