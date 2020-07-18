package com.grmkris.boilerplate.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class BoilerplateController {
    
    @RequestMapping(path = "/boilerplate", method = RequestMethod.POST)
    public String postBoilerplate(){
        return "string";
    }

    @RequestMapping(path = "/boilerplate/{id}", method = RequestMethod.GET)
    public String getBoilerplate(@PathVariable("id") String id){
        return "string";
    }

    @RequestMapping(path = "/boilerplates", method = RequestMethod.GET)
    public String getBoilerplates(){
        return "string";
    }

    @RequestMapping(path = "/boilerplate", method = RequestMethod.DELETE)
    public String deleteBoilerplate(){
        return "string";
    }

    @RequestMapping(path = "/boilerplate", method = RequestMethod.PUT)
    public String updateBoilerplate(){
        return "string";
    }
}