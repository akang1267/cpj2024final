import java.util.*;

public class Turtle extends Pet{
    Scanner in = new Scanner(System.in);
    private String name;
    private String shellColor;
    private int lifespan;
    private static int money = 50;
    private static int tank = 100;

    public Turtle(String name, int age, String shellColor, int lifespan){
        super(age);
        this.name = name;
        this.shellColor = shellColor;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getShellColor() {
        return shellColor;
    }

    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public int getMoney(){
        int total = this.money;
        System.out.println("Would you like a tank to go with it? (y/n)");
        String tank = in.nextLine();
        if(tank.equals("y")) total += this.tank;
        return total;

    }

    public String toString(){
        String s = "";
        s += "Name: " + getName() + "\n" +  "Age: " + getAge() + "\n" + "Shell Color: " + getShellColor() + "\n" + "Lifespan: " + getLifespan() + "\n" + "Total Cost: $" + getMoney();
        s+= "\n";
        return s;

    }



    

}