import java.io.IOException;

public abstract class MainGame {
  abstract void initialize();
  abstract void startPlay() throws IOException;
  abstract void endPlay() throws IOException;
  public final void play() throws IOException {

    //initialize the game
    initialize();

    //start game
    startPlay();

    //end game
//    endPlay();
  }
}
