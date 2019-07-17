package soccer;

public class League {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.playerName = "Yamkela James";

        Player player2 = new Player();
        player2.playerName = "Mfundo Ngqanekana";


        Player[] thePlayers = {player1, player2};

        Team team1 = new Team();
        team1.teamName = "Red Lion FC";

        Team team2 = new Team();
        team2.teamName = "FC Porto";

        team1.playerArray = thePlayers;

        team2.playerArray = new Player[2];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Teko Modise";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Themba Zwane";


        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[1];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;


        System.out.println("-----------Red Lion FC ----------");
        for (Player thePlayer: team1.playerArray ){
            System.out.println(thePlayer.playerName);
        }

        System.out.println("-----------FC Porto ----------");
        for (Player thePlayer: team2.playerArray ){
            System.out.println(thePlayer.playerName);
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by " + currGame.goals[0].thePlayer.playerName + " of " + currGame.goals[0].theTeam.teamName);
    }
}
