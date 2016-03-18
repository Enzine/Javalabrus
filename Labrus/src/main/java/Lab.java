
import java.util.ArrayList;
import java.util.List;

public class Lab {
    private List<Pet> pets;
    private Owner owner;

    public Lab(String name) {
        this.pets = new ArrayList<>();
        this.owner = new Owner(name);
    }
    
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    
    public void listPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
    
    
}
