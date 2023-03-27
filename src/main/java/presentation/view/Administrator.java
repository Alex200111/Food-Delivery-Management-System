package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Administrator extends JFrame {

    JButton ImportButton;
    JButton AddButton;
    JButton DeleteButton;
    JButton ModifyButton;
    JButton CreateComposedButton;
    JButton BackButton;
    JButton RaportButton;

    public Administrator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 497, 360);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("ADMINISTRATOR");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(135, 11, 217, 49);
        this.add(lblNewLabel);

        ImportButton = new JButton("IMPORT");
        ImportButton.setBounds(55, 100, 105, 23);
        this.add(ImportButton);

        AddButton = new JButton("ADD PRODUCT");
        AddButton.setBounds(55, 151, 105, 23);
        this.add(AddButton);

        DeleteButton = new JButton("DELETE");
        DeleteButton.setBounds(55, 208, 105, 23);
        this.add(DeleteButton);

        ModifyButton = new JButton("MODIFY");
        ModifyButton.setBounds(278, 120, 131, 23);
        this.add(ModifyButton);

        CreateComposedButton = new JButton("CREATE COMPOSED");
        CreateComposedButton.setBounds(278, 175, 131, 23);
        this.add(CreateComposedButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(216, 257, 89, 23);
        this.add(BackButton);

        RaportButton = new JButton("RAPORTS");
        RaportButton.setBounds(362, 59, 89, 23);
        this.add(RaportButton);
    }

    public void ImportListener(ActionListener action){
        ImportButton.addActionListener(action);
    }

    public void AddOpenListener(ActionListener action){
        AddButton.addActionListener(action);
    }

    public void DeleteOpenListener(ActionListener action){
        DeleteButton.addActionListener(action);
    }

    public void modifyOpenListener(ActionListener action){
        ModifyButton.addActionListener(action);
    }

    public void createComposedOpenListener(ActionListener action){
        CreateComposedButton.addActionListener(action);
    }

    public void backListener(ActionListener action){
        BackButton.addActionListener(action);
    }

    public void raportOpenListener(ActionListener action){
        RaportButton.addActionListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
