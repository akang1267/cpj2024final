import java.util.*;

public class Dog extends Pet{
    
    Scanner in = new Scanner(System.in);
    private String breed;
    private String name;
    private final int money = 500;
    private final int kibbleMoney = 30;

    public Dog(String name, int age, String breed){
        super(age);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCost(){
        int total = this.getMoney();
        System.out.println("How many pounds of kibble would you like to add?");
        int kibble = in.nextInt();
        for(int i = 0; i<kibble; i++){
            total += this.getKibbleMoney();
        }
        
        return total;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getMoney() {
        return money;
    }

    public int getKibbleMoney() {
        return kibbleMoney;
    }

    public String toString(){
        String s = "";
        s += "Name: " + getName() + "\n" +  "Age: " + getAge() + "\n" + "Breed: " + getBreed() + "\n" + "Total Cost: $" + getCost();
        s += "\n";
        return s;
    }
    

}