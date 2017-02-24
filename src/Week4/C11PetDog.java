package Week4;

/**
 *
 * @author 55vanzilwa27
 */
public class C11PetDog extends C11Pet {

    @Override
    public String speak() {
        return "Ruff Ruff";
    }
    
    @Override
    public String toString(){
        return "My name is " + getPetName() + " I am a dog";
    }
}
