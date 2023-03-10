package mx.edu.utez.logAnimalsCrud.animals.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mx.edu.utez.logAnimalsCrud.animals.service.AnimalServiceImp;
import mx.edu.utez.logAnimalsCrud.animals.model.Animal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Controller
@RequestMapping("/animal")
public class AnimalController {
    
    @Autowired
    private AnimalServiceImp animalServiceImp;

    private static final Logger logger = LogManager.getLogger(AnimalController.class);

    @GetMapping("/list")
    public String list(Model model) {
        List<Animal> list = animalServiceImp.findAll();
        
        logger.info("Listado de animales" + list.toString());
        model.addAttribute("animales",list);
        return "index";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("animal", new Animal());
        return "form";
    }

    @PostMapping("/save")
    public String save(Animal animal, Model model) {
        logger.debug("Animal guardado"+ animal.toString());
        animalServiceImp.save(animal);
        return "redirect:/animal/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Optional<Animal> animal = animalServiceImp.findById(id);
        logger.warn("Animal editado" + animal.toString());
        model.addAttribute("animal", animal);
        return "form";
    }

}
