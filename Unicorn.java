import java.util.*;

/**
 * Class for buying a Unicorn
 * @author Adelle.Kang
 * @version 1.0.0
 */
public class Unicorn extends Pet{
    Scanner in = new Scanner(System.in);
    private String power;
    private String name;
    private boolean rainbowPoop;
    private String hairColor;
    private static int money = 1000;
    private static int pedicure = 500;

    /**
     * Constructor
     * @param name
     * @param age
     * @param power
     * @param rainbowPoop
     * @param hairColor
     */
    public Unicorn(String name, int age, String power, boolean rainbowPoop, String hairColor){
        super(age);
        this.name = name;
        this.power = power;
        this.rainbowPoop = rainbowPoop;
        this.hairColor = hairColor;
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
     * Gets the powers
     * @return powers
     */
    public String[] getPowers() {
        String[] powers = power.split(" ");
        return powers;
    }

    /**
     * Sets the power
     * @param power
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * Checks for Rainbow Poop
     * @return rainbowPoop
     */
    public boolean isRainbowPoop() {
        return rainbowPoop;
    }

    /**
     * Set Rainbow Poop
     * @param rainbowPoop
     */
    public void setRainbowPoop(boolean rainbowPoop) {
        this.rainbowPoop = rainbowPoop;
    }

    /**
     * Gets the hairColor
     * @return hairColor
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * Sets the hairColor
     * @param hairColor
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * Gets the money total with pedicure
     * @return total money
     */
    public int getMoney() {
        int total = this.money;
        int pedicureAmount;
        System.out.println("How many times a week would you want your unicorn to experience the wonderful pedicure?");
        pedicureAmount = in.nextInt();
        for(int i = 0; i<pedicureAmount; i++){
            total += this.pedicure;
        }
        return total;

    }

    /**
     * toString method for all information for Unicorn pet
     * @return s
     */
    public String toString(){
        String powerDisplay = "";
        String[] powers = this.getPowers();
        int counter = 1;
        for(String s: powers){
            powerDisplay += "Amazing Power No." + counter + ": " + s + ", ";
            counter++;
        }
        String poop = "";
        if(isRainbowPoop()) poop = "Your house will be bombarded with colorful and smelly rainbow poop.";
        else{poop = "You will have boring old horse poop because you're are boring and lame.";}


        String s = "";
        s += "Name: " + name + "\n" +  "Age: " + super.getAge() + "\n" + "Powers: " + powerDisplay + "\n" + "Poop: " + poop + "\n" + "Total Cost: $" + this.getMoney();
        s += "\n";
        return s;

    }


}