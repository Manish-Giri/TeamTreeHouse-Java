package learnJava.javaObjects.hangman;

/**
 * Created by hi on 3/18/2017.
 */
public class Game {
    /**
     * contains the main game logic
     */
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1;
        if(isHit) {
            hits += letter;
        }
        else {
            misses += letter;
        }
        return isHit;


    }
}
