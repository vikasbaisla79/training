package rockpaperscissors;
import java.util.Random;

public class RockPaperScissorsGameController implements GameController{
    private GameOption userChoice = GameOption.EMPTY;
    private GameOption machineChoice = GameOption.EMPTY;
    private Score totalScore = new Score();



    @Override
    public String welcomeMessage() {

        return "Welcome to a interesting game \n"+
                "Rock Paper Scissors Game\n"+
                "                                                \n";
    }

    @Override
    public String pleaseEnterOptionMessage(){
        return  " Please enter any of the following option:         \n"+
                "   1. ROCK "+ "    2. PAPER    "+ "   3. SCISSOR         \n"+
                " Enter your choice(1/2/3) : ";
    }

    @Override
    public void selectUserChoice(GameOption userOption) {
        this.userChoice = userOption;
    }

    @Override
    public GameOption randomMachineChoice() {
        int randomNumberBetween1to3 = new Random().nextInt(3)+1;
        GameOption machineOption = GameOption.valueOf(randomNumberBetween1to3);
        this.machineChoice = machineOption;
        return machineOption;
    }

    @Override
    public Player calculateResult() {

        totalScore.incrementTotalNumberGames();

        if(machineChoice.equals(userChoice)){
            return Player.TIE;
        }
        if(machineChoice.isWinBy(userChoice)){
            totalScore.incrementGamesWonByUser();
            return Player.USER;
        }
        return Player.MACHINE;
    }

    @Override
    public Score getResults() {
        return totalScore;
    }

}
