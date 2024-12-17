import java.util.*;

public class PetStore {
    public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);

        int totalcost = 0;
        
        while(true){
            System.out.println("What animal would you like to purchase? Enter Number(1. Dog / 2. Cat / 3. Turtle / 4. Unicorn / 5. Exit):");
            int animal = in.nextInt();
            
            if(animal == 1){
            
                System.out.println("What do you want your dog name to be?");
                String dogname = in.next();
                System.out.println("What age dog do you want(in years)");
                int dogage = in.nextInt();
                System.out.println("What breed would you like?");
                String dogbreed = in.next();
                Dog dog1 = new Dog(dogname, dogage, dogbreed);
                System.out.println(dog1);
            }

            else if(animal == 2){

                System.out.println("What do you want your cat name to be?");
                String catName = in.next();
                System.out.println("What age cat do you want(in years)");
                int catAge = in.nextInt();
                System.out.println("What breed would you like?");
                String catBreed = in.next();
                System.out.println("Would you like it to shed? (true or false)");
                boolean catShed = in.nextBoolean();
                Cat cat1 = new Cat(catName, catAge, catBreed, catShed);
                System.out.println(cat1);
                
            }

            else if(animal == 3){

                System.out.println("What do you want your turtle name to be?");
                String turtleName = in.next();
                System.out.println("What age turtle do you want(in years)");
                int turtleAge = in.nextInt();
                System.out.println("What shell color would you like?");
                String shellColor = in.next();
                System.out.println("What is the lifespan you want your turtle?");
                int lifeSpan = in.nextInt();
                Turtle turtle1 = new Turtle(turtleName, turtleAge, shellColor, lifeSpan);
                System.out.println(turtle1);
                
            }

            else if(animal == 4){
                System.out.println("Wonderful choice. What would you want to name your FANCY OOH-LA-LA unicorn?");
                String unicornName = in.next();
                System.out.println("Unicorns are immortal, however, how old do you want your unicorn to be (in years)?");
                int unicornAge = in.nextInt();
                in.nextLine();
                System.out.println("What powers do you want your unicorn to have? (list with spaces in between)");
                String unicornPowers = in.nextLine();
                System.out.println("Would you like rainbow poop or are you lame? (y/n)");
                String poop = in.next();
                boolean unicornPoop = false;
                if(poop.equals("y")) {System.out.println("Wonderful!"); unicornPoop = true;}
                else{System.out.println("You're so lame, I can't believe you."); unicornPoop = false;}
                System.out.println("Last but not least, what color would you like your magnificent hair to be?");
                String unicornHair = in.next();
                Unicorn uni1 = new Unicorn(unicornName, unicornAge, unicornPowers, unicornPoop, unicornHair);
                System.out.println(uni1);
            }

            else if( animal == 5) break;

            else{System.out.println("erm.... Try again.");}

        }

    }
}