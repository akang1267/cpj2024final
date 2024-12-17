import java.util.*;

public class Cat extends Pet{
    Scanner in = new Scanner(System.in);
    private String breed;
    public boolean shed;
    private String name;
    private final int money = 300;
    private final int kibbleMoney = 10;

    public Cat(String name, int age, String breed, boolean shed){
        super(age);
        this.name = name;
        this.breed = breed;
        this.shed = shed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isShed() {
        return shed;
    }

    public void setShed(boolean shed) {
        this.shed = shed;
    }

    public int getMoney() {
        int total = this.money;
        System.out.println("How many pounds of kibble would you like to add?");
        int kibble = in.nextInt();
        for(int i = 0; i<kibble; i++){
            total += this.kibbleMoney;
        }
        return total;
    }

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