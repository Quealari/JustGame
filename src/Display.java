import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Display implements ActionListener {

    JLabel jLabel;

    Display() {

        JFrame frame = new JFrame("Test Frame"); // создали рамку
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход из программы

        frame.setLayout(new FlowLayout()); // диспетчер компоновки - без него хаос
        frame.setBackground(Color.GRAY);

        JLabel jlabel = new JLabel("Press a button");
        frame.getContentPane().add(jlabel);

        frame.setPreferredSize(new Dimension(600, 600));
        frame.pack();

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        // Добавление приемников событий от кнопки.
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        frame.add(jbtnUp);
        frame.add(jbtnDown);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // Для определения нажатой кнопки используется команда действия.
        jLabel = new JLabel();
        if (event.getActionCommand().equals("Up")) {
            jLabel.setText("You pressed Up.");
        } else jLabel.setText("You pressed down.");
    }

    public static void main(String[] args) {
        // Объект SwingDemo должен быть создан в потоке
        // диспетчеризации событий.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Display();
            }
        });
    }

}