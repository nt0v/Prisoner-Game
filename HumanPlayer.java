// FullName: Ntovonis Panagiotis | AM: 5314

import java.util.Scanner;

class HumanPlayer extends Player {

    // Constructor
    public HumanPlayer(String theName) {
        super(theName);
    }

    // Public Method | selectNumber
    public int selectNumber() {
        Scanner input = new Scanner(System.in);
        int numberSelected = 0;
        System.out.print("Give a number between 1 and 5: ");
        while (numberSelected < 1 || numberSelected > 5) {
            numberSelected = input.nextInt();
        }
        System.out.println("Player " + this.getName() + " selected " + numberSelected);
        return numberSelected;
    }

}