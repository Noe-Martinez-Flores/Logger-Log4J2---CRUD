package mx.edu.utez.logAnimalsCrud.animals.interfaceAnimal;

import mx.edu.utez.logAnimalsCrud.animals.model.Animal;

import java.util.List;
import java.util.Optional;

public interface IAnimalService {
    public List<Animal> findAll();
    public Optional<Animal> findById(int id);
    public int save(Animal animal);
    
}
