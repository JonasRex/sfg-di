package rex.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rex.springframework.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();

        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}