import java.util.*;

public class Pet{
    
    private int age;
    
    public Pet (int age){

        this.age = age;
    }

    public int getAge() {
        int small = age - 1;
        int big = age + 1;
        Random r = new Random();
        int number = r.nextInt(big-small) + small;
        return number;
    }

    public void setAge(int age) {
        this.age = age;
    }



}