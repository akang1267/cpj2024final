import java.util.*;

public class PetStore {
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);

        int totalcost = 0;
        
        while(true){
            System.out.println("What animal would you like to purchase? Enter Number(1. Dog / 2. Cat / 3. Turtle / 4. Unicorn): ";
            int animal = in.nextInt();
            
            if(animal == 1){
            
                System.out.println("What do you want your dog name to be?");
                String dogname = in.nextLine();
                System.out.println("What age dog do you want(in years)");
                int dogage = in.nextInt();
                System.out.println("What breed would you like?");
                String dogbreed = in.nextLine();
                

            }
        }

    }
}