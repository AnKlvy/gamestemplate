import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    MainGame mainGame = null;

    while(true){
    System.out.println("\nChoose the game\n" +
        "1 - Strategy\n" +
        "2 - TowerDefence\n" +
        "0 - Exit programm");

    int choice = Integer.parseInt(reader.readLine());


        if (choice == 1) {
          mainGame = new Strategy();
        } else if (choice == 2) {
          mainGame = new TowerDefence();
        }
        else if (choice == 0) {
          break;
        }
        mainGame.play();
      }
  }
}
