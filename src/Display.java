import javax.swing.*;

public class Display {
    public static void main(String[] args) {

        JFrame frame = new JFrame(/* название нашей игры */); // создали рамку
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход из программы
        frame.setSize(1200,800);
        frame.setResizable(true);
        frame.setUndecorated(true);
        frame.add(new Main());
        frame.setVisible(true); // рамка видимая

    }

}