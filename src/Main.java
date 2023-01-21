import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JPanel implements ActionListener {

    Timer timer = new Timer(20, this);

    Image image = new ImageIcon("src/test.jpg").getImage();

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
//        graphics.drawLine(200, 200, 1000, 1000); нарисовать линию
        graphics.drawImage(image, 0, 0, 250,250,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
