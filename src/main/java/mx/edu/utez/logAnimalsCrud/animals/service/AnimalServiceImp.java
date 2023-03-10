package mx.edu.utez.logAnimalsCrud.animals.service;

import mx.edu.utez.logAnimalsCrud.animals.interfaceAnimal.IAnimal;
import mx.edu.utez.logAnimalsCrud.animals.interfaceAnimal.IAnimalService;
import mx.edu.utez.logAnimalsCrud.animals.model.Animal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImp implements IAnimalService{

    @Autowired
    private IAnimal animalRepository;

    @Override
    public List<Animal> findAll() {
        return (List<Animal>)animalRepository.findAll();
    }

    @Override
    public Optional<Animal> findById(int id) {
        
        return animalRepository.findById(id);
    }

    @Override
    public int save(Animal animal) {
        int res = 0;
        Animal animal1 = animalRepository.save(animal);
        if(!animal1.equals(null)) {
            res = 1;
        }
        return res;
    }
    
}
