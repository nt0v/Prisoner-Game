// FullName: Ntovonis Panagiotis | AM: 5314

import java.util.Random;

class ComputerPlayer extends Player {

    // Constructor
    public ComputerPlayer(String theName) {
        super(theName);
    }

    // Public Method | selectNumber
    public int selectNumber() {
        Random rnd = new Random();
        int numberSelected = rnd.nextInt(1,5);
        System.out.println("Player " + this.getName() + " selected " + numberSelected);
        return numberSelected;
    }

}

// To SSH Secure Shell mou vgazei to akoloutho error pou den mou vgazei ston diko mou upologisti
// otan pao na to kano turnin
/*ComputerPlayer.java:15: error: no suitable method found for nextInt(int,int)
        int numberSelected = rnd.nextInt(1,5);
        ^
        method Random.nextInt() is not applicable
        (actual and formal argument lists differ in length)
        method Random.nextInt(int) is not applicable
        (actual and formal argument lists differ in length)
        1 error
 */
