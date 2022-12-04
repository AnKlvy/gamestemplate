import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strategy extends MainGame {
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  @Override
  void initialize() {
    System.out.println("Loading strategy game...");
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
        "1 - Dig mine\n" +
        "2 - Build factory\n" +
        "0 - Exit this strange game\n" +
        "3 - Overthrow the government\n");
    int choice = Integer.parseInt(reader.readLine());

      if (choice == 1) {
        digMine();
      } else if (choice == 2) {
        buildFactory();
      } else if (choice == 0) {
       endPlay();
    }else{
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

  void digMine() throws IOException {
    System.out.println("Stop digging mine?\n" +
        "y/n");
    String c = reader.readLine();
    while (!c.equals("y")) {
      System.out.println("Stop digging mine?\n" +
          "y/n");
      c = reader.readLine();
    }
    startPlay();
  }

  void buildFactory() throws IOException{
    System.out.println("Stop building factory?\n" +
        "y/n");
    String c = reader.readLine();
    while (!c.equals("y")) {
      System.out.println("Stop building factory?\n" +
          "y/n");
      c = reader.readLine();
    }
    startPlay();
  }



}
