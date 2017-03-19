package learnJava.javaObjects.hangman;

/**
 * Created by hi on 3/18/2017.
 */
public class Hangman {
    /**
     * The main app that runs the game by instantiating other classes
     * @param args
     */
    public static void main(String[] args) {
        Game game = new Game("treehouse");
        //System.out.println(game.applyGuess('t'));
        //System.out.println(game.applyGuess('n'));
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }

//        boolean isHit = prompter.promptForGuess();
//        if(isHit) {
//            System.out.println("We got a hit!");
//        }
//        else {
//            System.out.println("Oops missed!");
//        }





    }
}
