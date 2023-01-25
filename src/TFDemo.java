import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFDemo implements ActionListener {


    public JTextField textField;
    public JLabel label, labelPrompt, labelContents;
    JButton buttonRevers;


    public TFDemo() {


        // создать новый контейнер JFrame
        JFrame frame = new JFrame("Test TFDemo");

        // установить диспетчер компоновки FlowLayout
        frame.setLayout(new FlowLayout());

        // задать исходные размеры рамки окна
        frame.setSize(new Dimension(350, 250));

        // завершить программу после закрытия окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создание поля ввода шириной 10 символов
        textField = new JTextField(10);

        // создать кнопку Reverse
        buttonRevers = new JButton("Reverse");

        JButton buttonOne = new JButton("Первая кнопка");
        JButton buttonTwo = new JButton("Вторая кнопка");

        // Добавление приемников событий от поля ввода и кнопки.
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonRevers.addActionListener(this);
        textField.addActionListener(this);

        // создать метки
        label = new JLabel("Нажмите кнопку");
        labelPrompt = new JLabel("Enter text: "); //
        labelContents = new JLabel(""); //

        // добавить компоненты на панель содержимого
        frame.add(labelPrompt);
        frame.add(textField);
        frame.add(labelContents);
        frame.add(label);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonRevers);

        //отобразирть рамку окна
        frame.setVisible(true);


    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(TFDemo::new);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Первая кнопка")) {
            label.setText("Вы нажали первую кнопку");
        } else if (actionEvent.getActionCommand().equals("Вторая кнопка")) {
            label.setText("Вы нажали вторую кнопку");
        } else if (actionEvent.getActionCommand().equals("Reverse")) {
            String orgStr = textField.getText();
            String cleanStr = " ";

            // обратить символьную строку в поле ввода текста
            for (int i = orgStr.length() - 1; i >= 0; i--) {
                cleanStr = cleanStr + orgStr.charAt(i);
                textField.setText(cleanStr);
            }
        }
        else labelContents.setText("You pressed ENTER. Text is: " +
                    textField.getText());
    }
}