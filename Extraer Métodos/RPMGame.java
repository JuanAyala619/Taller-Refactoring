public class RPMGame {
    int draw = 0;
    public void printPlay(Player p1, Player p2, int roundsPlayed) {
        System.out.println("***** Round: " + roundsPlayed + "****************\n");
        System.out.println("Number of Draws: " + draw + "\n");
        String p1Choice = p1.playerChoice();
        System.out.println("Player 1: " + p1Choice +
                "\t Player 1 Total Wins: " + p1.getWins());
        String p2Choice = p2.playerChoice();
        System.out.println("Player 2: " + p2Choice +
                "\t Player 2 Total Wins: " + p2.getWins());
    }
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        RPMGame game = new RPMGame();
        boolean gameWon = false;
        int roundsPlayed = 0; // Number of rounds played
        int p1Wins = p1.wins;
        int p2Wins = p2.wins;
        int draw = 0;
        String p1Choice= p1.playerChoice();
        String p2Choice= p2.playerChoice();

        // Game Loop
        do {
            game.printPlay(p1, p2, roundsPlayed);

            if((p1Choice.equals("rock")) && (p2Choice.equals("paper"))) {
                System.out.println("Player 2 Wins");
                p2Wins++;
            } else if((p1Choice.equals("paper")) && (p2Choice.equals("rock"))) {
                p1Wins++;
                System.out.println("Player 1 Wins");
            } else if((p1Choice.equals("rock")) && (p2Choice.equals("scissors"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if((p1Choice.equals("scissors")) && (p2Choice.equals("rock"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            } else if((p1Choice.equals("scissors")) && (p2Choice.equals("paper"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if((p1Choice.equals("paper")) && (p2Choice.equals("scissors"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            }

            if (p1Choice == p2Choice) {
                draw++;
                System.out.println("\n\t\t\t Draw \n");
            }

            roundsPlayed++;
            if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
                gameWon = true;
                System.out.println("GAME WON");
            }

        } while (gameWon != true);
    }    
}
