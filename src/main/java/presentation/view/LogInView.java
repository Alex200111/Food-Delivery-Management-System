package presentation.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class LogInView extends JFrame {
    
    JTextField UserField;
    JTextField PasswordField;
    
    JButton LogInButton;
    JButton CreateButton;
    
    public LogInView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 509, 358);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("BINE ATI VENIT!");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(141, 72, 202, 36);
        this.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("USER");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(86, 164, 46, 14);
        this.add(lblNewLabel_1);

        UserField = new JTextField();
        UserField.setBounds(177, 163, 166, 20);
        this.add(UserField);
        UserField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("PASSWORD");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_2.setBounds(61, 211, 97, 14);
        this.add(lblNewLabel_2);

        PasswordField = new JTextField();
        PasswordField.setBounds(177, 210, 166, 20);
        this.add(PasswordField);
        PasswordField.setColumns(10);

        LogInButton = new JButton("LOGIN");
        LogInButton.setBounds(165, 266, 89, 23);
        this.add(LogInButton);

        CreateButton = new JButton("NEW USER");
        CreateButton.setBounds(285, 266, 89, 23);
        this.add(CreateButton);

        this.setVisible(true);
    }

    public String getUserField() {
        return UserField.getText();
    }

    public void setUserField(String userField) {
        this.UserField.setText(userField);
    }

    public String getPasswordField() {
        return PasswordField.getText();
    }

    public void setPasswordField(String passwordField) {
        this.PasswordField.setText(passwordField);
    }

    public void logInListener(ActionListener action){
        LogInButton.addActionListener(action);
    }

    public void newUserListener(ActionListener action){
        CreateButton.addActionListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
        refreh();
    }

    private void refreh() {
        UserField.setText(null);
        PasswordField.setText(null);
    }

    public void refresh() {
        UserField.setText(null);
        PasswordField.setText(null);
    }
}
