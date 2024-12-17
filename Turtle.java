import java.util.*;

/**
 * Class for buying a Turtle
 * @author Adelle.Kang
 * @version 1.0.0
 */
public class Turtle extends Pet{
    Scanner in = new Scanner(System.in);
    private String name;
    private String shellColor;
    private int lifespan;
    private static int money = 50;
    private static int tank = 100;

    /**
     * Constructor
     * @param name
     * @param age
     * @param shellColor
     * @param lifespan
     */
    public Turtle(String name, int age, String shellColor, int lifespan){
        super(age);
        this.name = name;
        this.shellColor = shellColor;
        this.lifespan = lifespan;
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
     * Gets the shell Color
     * @return shellColor
     */
    public String getShellColor() {
        return shellColor;
    }

    /**
     * Sets the shell Color
     * @param shellColor
     */
    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;
    }

    /**
     * Gets the lifespan
     * @param lifespan
     */
    public int getLifespan() {
        return lifespan;
    }

    /**
     * Sets the shell Color
     * @param shellColor
     */
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    /**
     * Gets the total monet with tank
     * @return total money
     */
    public int getMoney(){
        int total = this.money;
        System.out.println("Would you like a tank to go with it? (y/n)");
        String tank = in.nextLine();
        if(tank.equals("y")) total += this.tank;
        return total;

    }

    /**
     * toString with information about Turtle
     * @return s
     */
    public String toString(){
        String s = "";
        s += "Name: " + getName() + "\n" +  "Age: " + getAge() + "\n" + "Shell Color: " + getShellColor() + "\n" + "Lifespan: " + getLifespan() + "\n" + "Total Cost: $" + getMoney();
        s+= "\n";
        return s;

    }



    

}