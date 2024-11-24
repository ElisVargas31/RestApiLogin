package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola! Este es un servicio simple que devuelve un texto.";
    }
}
