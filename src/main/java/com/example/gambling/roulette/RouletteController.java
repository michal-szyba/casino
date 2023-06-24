package com.example.gambling.roulette;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/roulette")
public class RouletteController {
    @RequestMapping(value = "/play")
    public String play(Model model){
        Roulette roulette = new Roulette();
        roulette.spin();
        model.addAttribute("color", roulette.getColor());
        model.addAttribute("number", roulette.getNumber());
        return "roulette/spin";
    }
}
