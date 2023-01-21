import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;


public class Actions extends JPanel {

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(200, 200, 1000, 1000);
    }

}
