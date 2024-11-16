import java.util.HashMap;
import java.util.Random;
//import java.util.random.RandomGenerator;
import java.util.Scanner;

public class Attributes {


    public static void main(String[] args){
        HashMap<String, Integer> rps = new HashMap<>();

        /*rps.put(0, "Rock");
        rps.put(1, "Paper");
        rps.put(2, "Scissors");*/

        rps.put("Rock", 0);
        rps.put("Paper", 1);
        rps.put("Scissors", 2);

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter your choice, Rock, Paper, Scissors: ");
        String choice = inputScanner.nextLine();

        if (rps.containsKey(choice)){
            System.out.println("You choose " + choice + "!");
            //wait(1000);
        }
        else{
            System.out.println("Your choice isnt accepted");
            System.out.println("Please enter your choice, Rock, Paper, Scissors: ");
            }

        Random randomNumber = new Random();
        int randomChoice = randomNumber.nextInt(3);


        switch(randomChoice){
            case 0: System.out.println("Machine chose: Rock"); break;
            case 1: System.out.println("Machine chose: Paper"); break;
            case 2: System.out.println("Machine chose: Scissors"); break;
        }


        //if (choice.equals("Rock") && rps.containsKey(randomChoice)) {
        if (choice.equals("Rock") && randomChoice == 2){
            System.out.println("you win!");
        }

        else if (choice.equals("paper") && randomChoice == 0) {
            System.out.println("you win!");
        }

        else if (choice.equals("scissors") && randomChoice == 1) {
            System.out.println("you win!");
        }

        else if (choice.equals(randomChoice)){
            System.out.println("Draw!");
        }
        else{
            System.out.println("You loose!");
        }



    }


}
