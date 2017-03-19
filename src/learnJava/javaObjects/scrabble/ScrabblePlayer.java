package learnJava.javaObjects.scrabble;

/**
 * Created by hi on 3/19/2017.
 */
public class ScrabblePlayer {
    // A String representing all of the tiles that this player has
    private String tiles;

    public ScrabblePlayer() {
        tiles = "";
    }

    public String getTiles() {
        return tiles;
    }

    public void addTile(char tile) {
        // TODO: Add the tile to tiles
        tiles += tile;

    }

    public boolean hasTile(char tile) {
        // TODO: Determine if user has the tile passed in

        return tiles.indexOf(tile) >= 0;

    }
}
