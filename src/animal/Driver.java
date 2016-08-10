package animal;

public class Driver {
    
    
    public static void main(String[] args){
        
        Animal[] animalArray = new Animal[5];
        animalArray[0] = new Animal("Fido", "Dog");
        animalArray[1] = new Dog(true, "Rover", "Dog");
        animalArray[2] = new Cat(false, "Fluffy", "Cat");
        
        ((Dog)animalArray[1]).toString();
        
  
        for (Animal a1 : animalArray) {
            System.out.println(a1);
        }
        
        
    }
}
