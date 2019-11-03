package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
@RequestMapping("cheese")
public class CheeseController {

    @RequestMapping(value="")
    public String index(Model model) {
        model.addAttribute("title", "My Cheeses");

        ArrayList<String> cheeses = new ArrayList<>();
        cheeses.add("cheddar");
        cheeses.add("brie");

        model.addAttribute("cheeses", cheeses);

        return "cheese/index";
    }
    @RequestMapping(value="add" method=RequestMapping.GET)
    public String displayAddCheeseForm(Model model) {
        model.addAttribute("title", "Add Cheese");
        return "cheese/add";
    }

    @RequestMapping(value="add")
    public String processAddCheeseForm(Model model) {

    }
}
