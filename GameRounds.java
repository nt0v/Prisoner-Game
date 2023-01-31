// FullName: Ntovonis Panagiotis | AM: 5314

class GameRounds {

    private Player[] players = new Player[2];
    private int playerStartingIndex = 0;
    private int secondPlayerIndex = 1; // Extra Pedio gia voitheia

    // Constructor
    public GameRounds(Player p1,Player p2) {
        this.players[0] = p1;
        this.players[1] = p2;
    }

    // Public Method | playRound
    public void playRound() {
        boolean roundOver = false;
        System.out.println("Player " + players[playerStartingIndex] + " turn");
        int player1 = players[playerStartingIndex].play(players[secondPlayerIndex]);
        if (player1 == -1) {
            roundOver = true;
            players[secondPlayerIndex].addWin();
            System.out.println(players[playerStartingIndex] + " busted!");
        }
        System.out.print("\n");
        if (!roundOver) {
            System.out.println("Player " + players[secondPlayerIndex] + " turn");
            int player2 = players[secondPlayerIndex].play(players[playerStartingIndex]);
            if (player2 == -1) {
                roundOver = true;
                players[playerStartingIndex].addWin();
                System.out.println(players[secondPlayerIndex] + " busted!");
            }
            if (!roundOver) {
                if (player1 >= player2) {
                    System.out.println("\nRound Over, " + players[playerStartingIndex] + " won");
                    players[playerStartingIndex].addWin();
                }
                else {
                    System.out.println("\nRound Over, " + players[secondPlayerIndex] + " won");
                    players[secondPlayerIndex].addWin();
                }
            }
        }
        int tempSave = playerStartingIndex; // Voithitiki metavliti gia enalagi tis seiras se kathe guro
        playerStartingIndex = secondPlayerIndex;
        secondPlayerIndex = tempSave;
    }

    // Public Method | printScore
    public void printScore() {
        System.out.print("\n");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i] + ": " + players[i].getWins());
        }
    }


}