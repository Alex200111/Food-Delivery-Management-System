package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RaportsView extends JFrame {
    JTextField DayField;

    JButton Raport1Button;
    JButton Raport2Button;
    JButton Raport3Button;
    JButton Raport4Button;

    public RaportsView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        this.setLayout(null);

        Raport1Button = new JButton("Raport 1");
        Raport1Button.setFont(new Font("Tahoma", Font.BOLD, 14));
        Raport1Button.setBounds(54, 56, 107, 51);
        this.add(Raport1Button);

        Raport2Button = new JButton("Raport 2");
        Raport2Button.setFont(new Font("Tahoma", Font.BOLD, 14));
        Raport2Button.setBounds(257, 56, 107, 51);
        this.add(Raport2Button);

        Raport3Button = new JButton("Raport 3");
        Raport3Button.setFont(new Font("Tahoma", Font.BOLD, 14));
        Raport3Button.setBounds(54, 153, 107, 51);
        this.add(Raport3Button);

        Raport4Button = new JButton("Raport 4");
        Raport4Button.setFont(new Font("Tahoma", Font.BOLD, 14));
        Raport4Button.setBounds(257, 153, 107, 51);
        this.add(Raport4Button);

        DayField = new JTextField();
        DayField.setBounds(164, 124, 86, 20);
        this.add(DayField);
        DayField.setColumns(10);
    }

    public void generareRaport1(ActionListener action){
        Raport1Button.addActionListener(action);
    }
    public void generareRaport2(ActionListener action){
        Raport2Button.addActionListener(action);
    }
    public void generareRaport3(ActionListener action){
        Raport3Button.addActionListener(action);
    }
    public void generareRaport4(ActionListener action){
        Raport4Button.addActionListener(action);
    }

    public String getDayField() {
        return DayField.getText();
    }

    public void setDayField(String dayField) {
        this.DayField.setText(dayField);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }


}
