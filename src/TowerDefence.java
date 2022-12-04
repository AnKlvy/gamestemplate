import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerDefence extends MainGame{
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  @Override
  void initialize() {
    System.out.println("Loading tower defence game...");
    try {
      int i = 0;
      System.out.println();
      while (i < 10) {
        System.out.print(".");
        Thread.sleep(50);
        i++;
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  void startPlay() throws IOException {
    System.out.println("What do you want to do?\n" +
        "1 - Build a tower\n" +
        "2 - Destroy a tower\n" +
        "0 - Exit this strange game\n" +
        "3 - Overthrow the government\n");
    int choice = Integer.parseInt(reader.readLine());

    if (choice == 1) {
      buildTower();
    } else if (choice == 2) {
      destroyTower();
    } else if (choice == 0) {
      endPlay();
    }
    else{
      System.out.println("You entered wrong number!");
      startPlay();
    }
  }

  @Override
  void endPlay() throws IOException {
    System.out.println("Do you want to exit?\n" +
        "y/n");
    String c = reader.readLine();
    if (c.equals("n"))
      startPlay();
    else if (c.equals("y"))
      System.out.println("Closing game...");

  }

  void buildTower() throws IOException {
    System.out.println("Do you want to build a tower?\n" +
        "y/n");
    String c = reader.readLine();
    while (!c.equals("n")) {
      System.out.println("Do you want to build a tower?\n" +
          "y/n");
      c = reader.readLine();
    }
    startPlay();
  }

  void destroyTower() throws IOException{
    System.out.println("Do you want to destroy a tower?\n" +
        "y/n");
    String c = reader.readLine();
    while (!c.equals("n")) {
      System.out.println("Do you want to destroy a tower?\n" +
          "y/n");
      c = reader.readLine();
    }
    startPlay();
  }
}
