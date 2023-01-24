import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton implements ActionListener {

    public JLabel label;


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

        frame.setBackground(Color.GREEN);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);

        // создаю новую панель, добавляю в рамку и закрашиваю (уродски)
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(1200,1200));
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);

    }

    // Обработка событий от кнопки.
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("Red tablet TEST"))
            label.setText("You wish Red tablet");
        else
            label.setText("You wish blue tablet.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TestButton::new);
    }
}
