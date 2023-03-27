package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DeleteView extends JFrame {

    JButton DeleteButton;
    JButton BackButton;
    JComboBox DeleteBox;

    public DeleteView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 390);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("DELETE PRODUCT");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(100, 11, 238, 45);
        this.add(lblNewLabel);

        DeleteBox = new JComboBox();
        DeleteBox.setBounds(10, 159, 328, 22);
        this.add(DeleteBox);

        JLabel lblNewLabel_1 = new JLabel("SELECTEAZA PRODUSUL CARE URMEAZA A FI STERS:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(10, 90, 399, 45);
        this.add(lblNewLabel_1);

        DeleteButton = new JButton("STERGE PRODUS");
        DeleteButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        DeleteButton.setBounds(138, 247, 168, 33);
        this.add(DeleteButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(181, 291, 89, 23);
        this.add(BackButton);
        
    }

    public JComboBox getDeleteBox() {
        return DeleteBox;
    }

    public void deleteListener(ActionListener action){
        DeleteButton.addActionListener(action);
    }

    public void backListener(ActionListener action){
        BackButton.addActionListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }


}
