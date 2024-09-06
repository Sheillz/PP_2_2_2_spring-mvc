package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarServicelmpl;

@Controller
@RequestMapping("/car")
public class CarController {
    private final CarServicelmpl carServicelmpl;

    @Autowired
    public CarController(CarServicelmpl carServicelmpl) {
        this.carServicelmpl = carServicelmpl;
    }

    @GetMapping()
    public String getCars(ModelMap model) {
        model.addAttribute("cars", carServicelmpl.getCars());
        return "/car/index";
    }

    @GetMapping("/count/{count}")
    public String getCars(@ModelAttribute("count") int count, ModelMap model) {
        model.addAttribute("cars", carServicelmpl.getIndexCars(count));
        return "/car/count";
    }
}
