import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame{

    GamePanel panel;
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When we hit that X button it will close out of our application
        this.pack(); //Window will adjust to game panel
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
