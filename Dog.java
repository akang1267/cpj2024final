import java.util.*;

/**
 * Class for buying a Dog
 * @author Adelle.Kang
 * @version 1.0.0
 */
public class Dog extends Pet{
    
    Scanner in = new Scanner(System.in);
    private String breed;
    private String name;
    private final int money = 500;
    private final int kibbleMoney = 30;

    /**
     * Constructor
     * @param name
     * @param age
     * @param breed
     */
    public Dog(String name, int age, String breed){
        super(age);
        this.name = name;
        this.breed = breed;
    }

    /**
     * Gets the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the cost based on the amount of food
     * @return total money
     */
    public int getCost(){
        int total = this.getMoney();
        System.out.println("How many pounds of kibble would you like to add?");
        int kibble = in.nextInt();
        for(int i = 0; i<kibble; i++){
            total += this.getKibbleMoney();
        }
        
        return total;
    }

    /**
     * Gets the Breed
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the breed
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Gets the money needed for Dog
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * Gets the money for kibble
     * @return kibbleMoney for food
     */
    public int getKibbleMoney() {
        return kibbleMoney;
    }

    /**
     * toString method string of information of dog
     * @return s 
     */
    public String toString(){
        String s = "";
        s += "Name: " + getName() + "\n" +  "Age: " + getAge() + "\n" + "Breed: " + getBreed() + "\n" + "Total Cost: $" + getCost();
        s += "\n";
        return s;
    }
    

}