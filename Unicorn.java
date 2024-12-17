import java.util.*;

public class Unicorn extends Pet{
    Scanner in = new Scanner(System.in);
    private String power;
    private String name;
    private boolean rainbowPoop;
    private String hairColor;
    private static int money = 1000;
    private static int pedicure = 500;

    public Unicorn(String name, int age, String power, boolean rainbowPoop, String hairColor){
        super(age);
        this.name = name;
        this.power = power;
        this.rainbowPoop = rainbowPoop;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String[] getPowers() {
        String[] powers = power.split(" ");
        return powers;


    }

    public void setPower(String power) {
        this.power = power;
    }

    public boolean isRainbowPoop() {
        return rainbowPoop;
    }

    public void setRainbowPoop(boolean rainbowPoop) {
        this.rainbowPoop = rainbowPoop;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

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