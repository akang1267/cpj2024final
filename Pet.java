import java.util.*;

/**
 * Class super class that overlooks all Pets
 * @author Adelle.Kang
 * @version 1.0.0
 */
public class Pet{
    
    private int age;

    /**
     * Constructor
     * @param age
     */
    public Pet (int age){
        this.age = age;
    }

    /**
     * Gets age at random between one under and one more.
     * @return number age
     */
    public int getAge() {
        int small = age - 1;
        int big = age + 1;
        Random r = new Random();
        int number = r.nextInt(big-small) + small;
        return number;
    }
    /**
     * Sets age.
     * @param age the age needed to add
     */
    public void setAge(int age) {
        this.age = age;
    }



}