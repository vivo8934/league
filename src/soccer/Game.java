package soccer;

import utility.GameUtils;

public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;


    public void playGame(int maxGoals){



        int numberOfGoals = (int) (Math.random() * (maxGoals + 1));

        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;

        GameUtils.addGameGoals(this);

    }

    public void playGame(){
       playGame(4);
        playGame(6);
    }

    public String getDescription(){

        StringBuilder newString = new StringBuilder();
        for (Goal currGoal : this.goals) {

            newString.append("Goal scored after ");
            newString.append(currGoal.theTime);
            newString.append(" mins by ");
            newString.append(currGoal.thePlayer.playerName);
            newString.append(" of " + currGoal.theTeam.teamName + "\n");

        }

        return newString.toString();
    }
}

