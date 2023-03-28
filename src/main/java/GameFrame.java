import javax.swing.*;

public class GameFrame extends JFrame {
    //create constructor
    GameFrame(){

        this.add(new GamePanel()); //shortcut to initialize the game panel
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //takes JFrame and fits it around our components
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
