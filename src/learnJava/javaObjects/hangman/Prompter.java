package learnJava.javaObjects.hangman;

import java.util.Scanner;

/**
 * Created by hi on 3/18/2017.
 */
public class Prompter {
/**
 * deals with I/O from user
 */

  private Game game;

  public Prompter(Game game) {
      this.game = game;
  }

  public boolean promptForGuess() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a letter: ");
      String line = scanner.nextLine();
      char guess = line.charAt(0);
      boolean isHit = false;
      try {
          isHit = game.applyGuess(guess);
      }catch (IllegalArgumentException iae) {
          System.out.println(iae.getMessage());
      }
      return isHit;
  }

  public void displayProgress() {
      System.out.printf("You have %d tries to solve: %s%n", game.getRemainingTries(), game.getCurrentProgress());

  }

}
