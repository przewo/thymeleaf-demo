package pl.ricosoft.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car=new Car("Hyundai","i30");
        model.addAttribute("car",car);
        model.addAttribute("name","Ryszard");
        return "car";
    }
}
