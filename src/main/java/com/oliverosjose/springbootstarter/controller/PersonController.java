package com.oliverosjose.springbootstarter.controller;

import com.oliverosjose.springbootstarter.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by capitanjovi on 25/3/17.
 */
@Controller
public class PersonController {
    @RequestMapping("/person")
    public String person(Model model) {
        Person person = new Person();
        person.setFirstName("jose");
        person.setLastName("oliveros");
        person.setAge(36);
        model.addAttribute("person", person);
        return "personview";
    }
}
