import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StrawberryCalculator extends JFrame implements ActionListener {

    JTextField display;
    JButton[] NumberButtons = new JButton[10];
    JButton[] MainButtons = new JButton[9];
    JButton divide, multiply, add, subtract;
    JButton AC_Button, sum, decimal, percent, negative;

    double num1=0,num2=0,result=0;
    char operator;


    public StrawberryCalculator() {

        JFrame frame = new JFrame();
        frame.setSize(470, 610);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Strawberry Calculator");
        frame.setLayout(null);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Times New Roman", Font.BOLD, 60));
        display.setBounds(10, 30, 428, 120);
        frame.add(display);

        NumberButtons(frame);
        MainButtons(frame);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();



    }

    private void MainButtons(JFrame frame) {

        divide = new JButton("÷");
        divide.setBounds(338, 180, 100, 70);
        frame.getContentPane().add(divide);
        divide.setBackground(new Color(0xB8F3A0));
        divide.setForeground(Color.DARK_GRAY);
        MainButtons[0] = divide;

        multiply = new JButton("*");
        multiply.setBounds(338, 260, 100, 70);
        frame.getContentPane().add(multiply);
        multiply.setBackground(new Color(0xB8F3A0));
        multiply.setForeground(Color.DARK_GRAY);
        MainButtons[1] = multiply;

        subtract = new JButton("-");
        subtract.setBounds(338, 340, 100, 70);
        frame.getContentPane().add(subtract);
        subtract.setBackground(new Color(0xB8F3A0));
        subtract.setForeground(Color.DARK_GRAY);
        MainButtons[2] = subtract;

        add = new JButton("+");
        add.setBounds(338, 420, 100, 70);
        frame.getContentPane().add(add);
        add.setBackground(new Color(0xB8F3A0));
        add.setForeground(Color.DARK_GRAY);
        MainButtons[3] = add;

        sum = new JButton("=");
        sum.setBounds(338, 500, 100, 70);
        frame.getContentPane().add(sum);
        sum.setBackground(new Color(0xB8F3A0));
        sum.setForeground(Color.DARK_GRAY);
        MainButtons[4] = sum;

        AC_Button = new JButton("AC");
        AC_Button.setBounds(10, 180, 100, 70);
        frame.getContentPane().add(AC_Button);
        AC_Button.setBackground(new Color(0x71A66E));
        AC_Button.setForeground(Color.DARK_GRAY);
        MainButtons[5] = AC_Button;

        decimal = new JButton(".");
        decimal.setBounds(230, 500, 100, 70);
        frame.getContentPane().add(decimal);
        decimal.setBackground(new Color(0x71A66E));
        decimal.setForeground(Color.DARK_GRAY);
        MainButtons[6] = decimal;

        percent = new JButton("%");
        percent.setBounds(230, 180, 100, 70);
        frame.getContentPane().add(percent);
        percent.setBackground(new Color(0x71A66E));
        percent.setForeground(Color.DARK_GRAY);
        MainButtons[7] = percent;

        negative = new JButton("+/-");
        negative.setBounds(120, 180, 100, 70);
        frame.getContentPane().add(negative);
        negative.setBackground(new Color(0x71A66E));
        negative.setForeground(Color.DARK_GRAY);
        MainButtons[8] = negative;

        for (JButton button : MainButtons) {
            button.addActionListener(this);
        }

    }


    private void NumberButtons(JFrame frame) {

        JButton seven = new JButton("7");
        seven.setBounds(10, 260, 100, 70);
        frame.getContentPane().add(seven);
        seven.setBackground(new Color(0x71A66E));
        seven.setForeground(Color.DARK_GRAY);
        NumberButtons[7] = seven;

        JButton four = new JButton("4");
        four.setBounds(10, 340, 100, 70);
        frame.getContentPane().add(four);
        four.setBackground(new Color(0x71A66E));
        four.setForeground(Color.DARK_GRAY);
        NumberButtons[4] = four;

        JButton one = new JButton("1");
        one.setBounds(10, 420, 100, 70);
        frame.getContentPane().add(one);
        one.setBackground(new Color(0x71A66E));
        one.setForeground(Color.DARK_GRAY);
        NumberButtons[1] = one;

        JButton eight = new JButton("8");
        eight.setBounds(120, 260, 100, 70);
        frame.getContentPane().add(eight);
        eight.setBackground(new Color(0x71A66E));
        eight.setForeground(Color.DARK_GRAY);
        NumberButtons[8] = eight;

        JButton five = new JButton("5");
        five.setBounds(120, 340, 100, 70);
        frame.getContentPane().add(five);
        five.setBackground(new Color(0x71A66E));
        five.setForeground(Color.DARK_GRAY);
        NumberButtons[5] = five;

        JButton two = new JButton("2");
        two.setBounds(120, 420, 100, 70);
        frame.getContentPane().add(two);
        two.setBackground(new Color(0x71A66E));
        two.setForeground(Color.DARK_GRAY);
        NumberButtons[2] = two;

        JButton nine = new JButton("9");
        nine.setBounds(230, 260, 100, 70);
        frame.getContentPane().add(nine);
        nine.setBackground(new Color(0x71A66E));
        nine.setForeground(Color.DARK_GRAY);
        NumberButtons[9] = nine;

        JButton six = new JButton("6");
        six.setBounds(230, 340, 100, 70);
        frame.getContentPane().add(six);
        six.setBackground(new Color(0x71A66E));
        six.setForeground(Color.DARK_GRAY);
        NumberButtons[6] = six;

        JButton three = new JButton("3");
        three.setBounds(230, 420, 100, 70);
        frame.getContentPane().add(three);
        three.setBackground(new Color(0x71A66E));
        three.setForeground(Color.DARK_GRAY);
        NumberButtons[3] = three;

        JButton zero = new JButton("0");
        zero.setBounds(10, 500, 210, 70);
        frame.getContentPane().add(zero);
        zero.setBackground(new Color(0x71A66E));
        zero.setForeground(Color.DARK_GRAY);
        NumberButtons[0] = zero;

        for (JButton button : NumberButtons) {
            button.addActionListener(this);
        }

    }

    public static void main(String[] args) {

        new StrawberryCalculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == NumberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decimal) {
            display.setText(display.getText().concat("."));
        }

        if (e.getSource() == AC_Button) {
            display.setText("");
        }

        if (e.getSource() == add) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }

        if (e.getSource() == subtract) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        }

        if (e.getSource() == multiply) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");

        }

        if (e.getSource() == divide) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }

        if (e.getSource() == sum) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
        }

        if (e.getSource() == negative) {
            double temp = Double.parseDouble(display.getText());
            display.setText(String.valueOf(-temp));

        }


    }

}


