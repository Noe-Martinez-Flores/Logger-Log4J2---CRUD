package mx.edu.utez.logAnimalsCrud.animals.interfaceAnimal;

import mx.edu.utez.logAnimalsCrud.animals.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface IAnimal extends CrudRepository <Animal, Integer>{
    
}
