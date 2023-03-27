package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Client extends JFrame {

    JTextField RatingField;
    JTextField CaloriiField;
    JTextField ProteineField;
    JTextField FatField;
    JTextField SodiumField;
    JTextField PretField;

    JButton AddToButton;
    JButton FinalizareButton;
    JButton  BackButton;
    JButton UpdateButton;

    JComboBox comboBox;


    public Client() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 551, 400);
        this.setLayout(null);

        JLabel lblClient = new JLabel("CLIENT");
        lblClient.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblClient.setBounds(222, 27, 115, 25);
        this.add(lblClient);

        JLabel lblNewLabel = new JLabel("RATING");
        lblNewLabel.setBounds(20, 80, 54, 14);
        this.add(lblNewLabel);

        RatingField = new JTextField();
        RatingField.setBounds(100, 77, 115, 20);
        this.add(RatingField);
        RatingField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("CALORII");
        lblNewLabel_1.setBounds(250, 80, 62, 14);
        this.add(lblNewLabel_1);

        CaloriiField = new JTextField();
        CaloriiField.setBounds(332, 77, 132, 20);
        this.add(CaloriiField);
        CaloriiField.setColumns(10);

        comboBox = new JComboBox();
        comboBox.setBounds(31, 198, 247, 22);
        this.add(comboBox);

        AddToButton = new JButton("ADD TO CART");
        AddToButton.setBounds(349, 198, 116, 23);
        this.add(AddToButton);

        FinalizareButton = new JButton("FINALIZARE COMANDA");
        FinalizareButton.setBounds(201, 298, 184, 23);
        this.add(FinalizareButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(49, 298, 89, 23);
        this.add(BackButton);

        JLabel lblNewLabel_2 = new JLabel("PROTEINE");
        lblNewLabel_2.setBounds(20, 113, 65, 14);
        this.add(lblNewLabel_2);

        ProteineField = new JTextField();
        ProteineField.setBounds(100, 110, 115, 20);
        this.add(ProteineField);
        ProteineField.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("GRASIME");
        lblNewLabel_3.setBounds(250, 113, 62, 14);
        this.add(lblNewLabel_3);

        FatField = new JTextField();
        FatField.setBounds(332, 108, 132, 20);
        this.add(FatField);
        FatField.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("SODIUM");
        lblNewLabel_4.setBounds(20, 150, 57, 14);
        this.add(lblNewLabel_4);

        SodiumField = new JTextField();
        SodiumField.setBounds(100, 147, 115, 20);
        this.add(SodiumField);
        SodiumField.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("PRET");
        lblNewLabel_5.setBounds(250, 150, 46, 14);
        this.add(lblNewLabel_5);

        PretField = new JTextField();
        PretField.setBounds(332, 147, 132, 20);
        this.add(PretField);
        PretField.setColumns(10);

        UpdateButton = new JButton("UPDATE CRITERIA");
        UpdateButton.setBounds(332, 249, 155, 23);
        this.add(UpdateButton);
    }

    public String getRatingField() {
        return RatingField.getText();
    }

    public void setRatingField(String ratingField) {
        this.RatingField.setText(ratingField);
    }

    public String getCaloriiField() {
        return CaloriiField.getText();
    }

    public void setCaloriiField(String caloriiField) {
        this.CaloriiField.setText(caloriiField);
    }

    public String getProteineField() {
        return ProteineField.getText();
    }

    public void setProteineField(String proteineField) {
        this.CaloriiField.setText(proteineField);
    }

    public String getFatField() {
        return FatField.getText();
    }

    public void setFatField(String fatField) {
        this.FatField.setText(fatField);
    }

    public String getSodiumField() {
        return SodiumField.getText();
    }

    public void setSodiumField(String sodiumField) {
        this.SodiumField.setText(sodiumField);
    }

    public String getPretField() {
        return PretField.getText();
    }

    public void setPretField(String pretField) {
        this.PretField.setText(pretField);
    }

    public void addToCartListener(ActionListener action){
        AddToButton.addActionListener(action);
    }

    public void updateListener(ActionListener action){
        UpdateButton.addActionListener(action);
    }

    public void finalizarListener(ActionListener action){
        FinalizareButton.addActionListener(action);
    }

    public JComboBox getComboBox() {
        return comboBox;
    }


    public void backListener(ActionListener action){
        BackButton.addActionListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void refresh() {
        RatingField.setText(null);
        CaloriiField.setText(null);
        ProteineField.setText(null);
        FatField.setText(null);
        SodiumField.setText(null);
        PretField.setText(null);
    }
}
