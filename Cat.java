import java.util.*;

/**
     * Class for buying Cats
     * @author Adelle.Kang
     * @version 1.0.0
     */
public class Cat extends Pet{
    Scanner in = new Scanner(System.in);
    private String breed;
    public boolean shed;
    private String name;
    private final int money = 300;
    private final int kibbleMoney = 10;

    /**
     * Constructor
     * @param name
     * @param age
     * @param breed
     * @param shed
     */
    public Cat(String name, int age, String breed, boolean shed){
        super(age);
        this.name = name;
        this.breed = breed;
        this.shed = shed;
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
     * Gets the breed
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the Breed
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Checks if shed
     * @return shed
     */
    public boolean isShed() {
        return shed;
    }

    /**
     * Set the shed
     * @param shed
     */
    public void setShed(boolean shed) {
        this.shed = shed;
    }

    /**
     * Gets the money based on kibble
     * @return total money
     */
    public int getMoney() {
        int total = this.money;
        System.out.println("How many pounds of kibble would you like to add?");
        int kibble = in.nextInt();
        for(int i = 0; i<kibble; i++){
            total += this.kibbleMoney;
        }
        return total;
    }

    /**
     * toString method to get info about cat
     * @return s
     */
    public String toString(){
        String shedding;
        String s = "";
        if(isShed()) shedding = "Your cat will shed.";
        else{shedding = "Your can will not shed.";}
        s += "Name: " + name + "\n" +  "Age: " + getAge() + "\n" + "Breed: " + getBreed() + "\n" + shedding + "\n" + "Total Cost: $" + getMoney();
        s += "\n";
        return s;
    }

    


    
}