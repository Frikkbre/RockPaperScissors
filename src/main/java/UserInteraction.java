//user interaction class

//This class will be used to interact with the user
//It will be used to get the user's input and display the output to the user
//It will be used to display the menu to the user and get the user's choice
//It will be used to display the result of the game to the user
//It will be used to display the score to the user
public class UserInteraction {
    //This method will be used to display the menu to the user
    public void displayMenu() {
        System.out.println("Please enter your choice, Rock, Paper, Scissors: ");
    }

    //This method will be used to get the user's choice
    public String getUserChoice() {
        Scanner inputScanner = new Scanner(System.in);
        String choice = inputScanner.nextLine();
        return choice;
    }

    //This method will be used to display the user's choice
    public void displayUserChoice(String choice) {
        System.out.println("You choose " + choice + "!");
    }

    //This method will be used to display the machine's choice
    public void displayMachineChoice(int randomChoice) {
        switch(randomChoice){
            case 0: System.out.println("Machine chose: Rock"); break;
            case 1: System.out.println("Machine chose: Paper"); break;
            case 2: System.out.println("Machine chose: Scissors"); break;
        }
    }

    //This method will be used to display the result of the game to the user
    public void displayResult(String choice, int randomChoice) {
        if (choice.equals("Rock") && randomChoice == 2){
            System.out.println("you win!");
        }

        else if (choice.equals("paper") && randomChoice == 0) {
            System.out.println("you win!");
        }

        else if (choice.equals("scissors") && randomChoice == 1) {
            System.out.println("you win!");
        }
    }
}
