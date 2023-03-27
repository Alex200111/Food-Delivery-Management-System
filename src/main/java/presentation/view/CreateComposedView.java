package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CreateComposedView extends JFrame {
    JTextField NumeField;

    JComboBox Prod1comboBox;
    JComboBox Prod2comboBox;
    JComboBox Prod3comboBox;

    JButton CreateComposedButton;
    JButton BackButton;


    public CreateComposedView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 478, 361);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("CREATE COMPOSED");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(104, 11, 222, 54);
        this.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nume:");
        lblNewLabel_1.setBounds(21, 92, 46, 14);
        this.add(lblNewLabel_1);

        NumeField = new JTextField();
        NumeField.setBounds(77, 89, 148, 20);
        this.add(NumeField);
        NumeField.setColumns(10);

        Prod1comboBox = new JComboBox();
        Prod1comboBox.setBounds(21, 129, 222, 22);
        this.add(Prod1comboBox);

        Prod2comboBox = new JComboBox();
        Prod2comboBox.setBounds(21, 176, 222, 22);
        this.add(Prod2comboBox);

        Prod3comboBox = new JComboBox();
        Prod3comboBox.setBounds(21, 223, 222, 22);
        this.add(Prod3comboBox);

        CreateComposedButton = new JButton("CREATE");
        CreateComposedButton.setBounds(311, 176, 89, 23);
        this.add(CreateComposedButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(311, 256, 89, 23);
        this.add(BackButton);
    }

    public String getNumeField() {
        return NumeField.getText();
    }

    public void setNumeField(String numeField) {
        this.NumeField.setText(numeField);
    }

    public JComboBox getProd1comboBox() {
        return Prod1comboBox;
    }

    public JComboBox getProd2comboBox() {
        return Prod2comboBox;
    }

    public JComboBox getProd3comboBox() {
        return Prod3comboBox;
    }

    public void createComposedListener(ActionListener action){
        CreateComposedButton.addActionListener(action);
    }

    public void backListener(ActionListener action){
        BackButton.addActionListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
        refresh();
    }

    public void refresh() {
        NumeField.setText(null);
    }
}
