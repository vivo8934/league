package soccer;

import utility.GameUtils;

public class League {

    public static void main(String[] args) {

        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];


        currGame.playGame();

        System.out.println(currGame.getDescription());

        //System.out.println(theGoals.length);
//



//
//





//        for (Goal theGoal : currGame.goals) {
//            System.out.println("----------------------------------------------------------------------------------");
//            System.out.println("Goal scored after " + theGoal.theTime + " mins by " + theGoal.thePlayer.playerName + " of " + theGoal.theTeam.teamName);
//        }

        System.out.println("--------------------------------------------------------------------------------------");


//        for (Player thePlayer : team2.playerArray) {
//            if (thePlayer.playerName.matches(".*Tek.*")) {
//
//                System.out.println("Found: " + thePlayer.playerName);
//                System.out.println("Lat name: " + thePlayer.playerName.split(" ")[1]);
//            }
//
//        }

//        StringBuilder myPlayers = new StringBuilder();
//        for (Player thePlayer : team1.playerArray) {
//            String[] names = thePlayer.playerName.split(" ");
//            myPlayers.append(names[1]);
//            myPlayers.append(", ");
//            myPlayers.append(names[0]);
//           // myPlayers.append("\n");
//
//            System.out.println(myPlayers);
//             myPlayers.delete(0, myPlayers.length());
//
//
//
//        }
    }

    public static Team[] createTeams(){

        Team team1 = new Team();
        team1.teamName = "Red Lion FC";

        Player player1 = new Player();
        player1.playerName = "Yamkela James";

        Player player2 = new Player();
        player2.playerName = "Mfundo Ngqanekana";

        Player player3 = new Player();
        player3.playerName = "Anele Sigenu";


        Player[] thePlayers = {player1, player2, player3};

        team1.playerArray = thePlayers;

        Team team2 = new Team();
        team2.teamName = "FC Porto";

        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Teko Modise";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Themba Zwane";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Hlompho Kekana";



        Team [] theTeams = {team1, team2};
        return theTeams;

    }

    public static Game[] createGames(Team[] theTeams){

        Game theGame = new Game();

        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game [] theGames = {theGame};
        return  theGames;

    }

}