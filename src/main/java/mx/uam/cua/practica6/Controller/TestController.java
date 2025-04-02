package mx.uam.cua.practica6.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @GetMapping ("/pruebita")
    public String pruebita() {
        return "Prueba 1";
    }
}
