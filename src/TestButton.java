import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton implements ActionListener {

    JLabel label; 

    public TestButton() {

        JFrame frame = new JFrame("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(1200, 1200));

        frame.setLayout(new FlowLayout());

        label = new JLabel("Выберите таблетку");
        frame.add(label);

        JButton buttonOne = new JButton("Red tablet TEST");
        JButton buttonTwo = new JButton("Blue tablet TEST");
        frame.add(buttonOne);
        frame.add(buttonTwo);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);


        frame.pack();
        frame.setVisible(true);

    }

    // Обработка событий от кнопки.
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("Red tablet TEST"))
            label.setText("You pressed Red tablet.");
        else
            label.setText("You pressed down. ");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TestButton::new);
    }
}
