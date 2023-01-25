import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFDemo implements ActionListener {


    public TextField textField;
    public JLabel label;


    public TFDemo() {

        Frame frame = new JFrame("Test TFDemo");
        frame.setSize(new Dimension(2550, 1500));

        frame.setLayout(new FlowLayout());

        JButton buttonOne = new JButton();
        JButton buttonTwo = new JButton();
        buttonOne = new JButton("Первая кнопка");
        buttonTwo = new JButton("Вторая кнопка");
        frame.add(buttonOne);
        frame.add(buttonTwo);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);

        label = new JLabel("Нажмите кнопку");
        frame.add(label);


        frame.setVisible(true);


    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(TFDemo::new);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Первая кнопка")) {
            label.setText("Вы нажали неправильную кнопку");
        } else label.setText("Вы нажали правильную кнопку");

    }
}