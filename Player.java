// FullName: Ntovonis Panagiotis | AM: 5314

abstract class Player {

    private String name;
    private int wins;

    // Constructor
    public Player(String name) {
        this.name = name;
    }

    // Accessor Method | wins
    public int getWins() {
        return this.wins;
    }

    // Accessor Method | name
    public String getName() {
        return this.name;
    }

    // Public Abstract Method | selectNumber
    public abstract int selectNumber();

    // Public Method | play
    public int play(Player other) {
        int pointsTotal = 0;
        while (pointsTotal < 26) {
            pointsTotal += this.selectNumber();
            pointsTotal += other.selectNumber();
            System.out.println(this.name + " has " + pointsTotal + " points");
        }
        if (pointsTotal > 31) {
            return -1;
        }
        return pointsTotal;
    }

    // Public Method | declareWinner
    public Player declareWinner(Player other) {
        if (this.getWins() != other.getWins()) {
            if (this.getWins() > other.getWins()) {
                return this;
            }
            return other;
        }
        return null;
    }

    // Public Method | addWin
    public void addWin() {
        this.wins += 1;
    }

    // Public Method | toString
    public String toString() {
        return this.name;
    }

}