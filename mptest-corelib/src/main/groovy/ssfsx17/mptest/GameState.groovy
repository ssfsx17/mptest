package ssfsx17.mptest

/**
 * Created with IntelliJ IDEA.
 * User: ssfsx17
 * Date: 11/30/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameState {
    public static GameState state = new GameState()
    List<ChatMessage> chat = new Vector<ChatMessage>()

    private GameState() { }

    public static void newGame() {
        state = new GameState()
    }
}
