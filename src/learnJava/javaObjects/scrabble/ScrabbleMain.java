package learnJava.javaObjects.scrabble;

/**
 * Created by hi on 3/19/2017.
 */
public class ScrabbleMain {

    public static void main(String[] args) {
        ScrabblePlayer player1 = new ScrabblePlayer();
        player1.addTile('d');
        player1.addTile('d');
        player1.addTile('p');
        player1.addTile('e');
        player1.addTile('l');
        player1.addTile('u');

        ScrabblePlayer player2 = new ScrabblePlayer();
        player2.addTile('z');
        player2.addTile('z');
        player2.addTile('y');
        player2.addTile('f');
        player2.addTile('u');
        player2.addTile('z');

        int count = 0;
        // This would set count to 1 because player1 has 1 'p' tile in her collection of tiles
        count = player1.getCountOfLetter('p');
        // This would set count to 2 because player1 has 2 'd'' tiles in her collection of tiles
        count = player1.getCountOfLetter('d');
        System.out.println(count);
        // This would set 0, because there isn't an 'a' tile in player1's tiles
        count = player1.getCountOfLetter('a');

        // This will return 3 because player2 has 3 'z' tiles in his collection of tiles
        count = player2.getCountOfLetter('z');
        // This will return 1 because player2 has 1 'f' tiles in his collection of tiles
        count = player2.getCountOfLetter('f');
    }
}
