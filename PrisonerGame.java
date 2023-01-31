// FullName: Ntovonis Panagiotis | AM: 5314

import java.util.Scanner;

class PrisonerGame {

    public static void main(String[] args) {

        Player player1;
        Player player2;
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play 1. Human vs Computer, or 2. Computer vs Computer?:\n>> ");
        String userInput = input.next();
        while (!(userInput.equals("1")) && !(userInput.equals("2"))) {
            System.out.println("Try again!");
        	userInput = input.next();
        }
        if (userInput.equals("1")) {
            System.out.print("Give your name or type -1 to play as 'Human': ");
            String userInput2 = input.next();
            if (userInput2.equals("-1")) {
                player1 = new HumanPlayer("Human");
                player2 = new ComputerPlayer("Computer");
            }
            else {
                player1 = new HumanPlayer(userInput2);
                player2 = new ComputerPlayer("Computer");
            }
        }
        else {
            player1 = new ComputerPlayer("Computer 1");
            player2 = new ComputerPlayer("Computer 2");
        }
        GameRounds game = new GameRounds(player1,player2);
        game.playRound();
        game.printScore();
        System.out.print("\n");
        System.out.println("Do you want to play another round?(n to end/any key to continue)");
        String playAgain = input.next();
        System.out.print("\n");
        while (!playAgain.equals("n")) {
            game.playRound();
            game.printScore();
            System.out.print("\n");
            System.out.println("Do you want to play another round?(n to end/any key to continue)");
            playAgain = input.next();
        }
        Player winner = player1.declareWinner(player2);
        if (winner != null) {
            System.out.println("Player " + winner + " has won the game!");
        }
        else {
            System.out.println("No Winner!");
        }

    }

}