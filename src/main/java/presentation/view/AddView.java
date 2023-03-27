package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddView extends JFrame {

    JTextField NameField;
    JTextField RatingField;
    JTextField ClaoriiField;
    JTextField ProteineField;
    JTextField GrasimeField;
    JTextField SodiuField;
    JTextField PretField;

    JButton CreateAddButton;
    JButton BackButton;

    public AddView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 499, 333);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("ADD NEW PRODUCT");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(101, 11, 287, 56);
        this.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nume:");
        lblNewLabel_1.setBounds(33, 93, 46, 14);
        this.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Rating:");
        lblNewLabel_2.setBounds(33, 118, 46, 14);
        this.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Calorii:");
        lblNewLabel_3.setBounds(33, 143, 46, 14);
        this.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Proteine:");
        lblNewLabel_4.setBounds(33, 168, 46, 14);
        this.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Grasimi:");
        lblNewLabel_5.setBounds(33, 193, 46, 14);
        this.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Sodiu:");
        lblNewLabel_6.setBounds(33, 219, 46, 14);
        this.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Pret:");
        lblNewLabel_7.setBounds(33, 244, 46, 14);
        this.add(lblNewLabel_7);

        NameField = new JTextField();
        NameField.setBounds(90, 90, 148, 20);
        this.add(NameField);
        NameField.setColumns(10);

        RatingField = new JTextField();
        RatingField.setBounds(89, 115, 149, 20);
        this.add(RatingField);
        RatingField.setColumns(10);

        ClaoriiField = new JTextField();
        ClaoriiField.setBounds(89, 140, 149, 20);
        this.add(ClaoriiField);
        ClaoriiField.setColumns(10);

        ProteineField = new JTextField();
        ProteineField.setBounds(89, 165, 149, 20);
        this.add(ProteineField);
        ProteineField.setColumns(10);

        GrasimeField = new JTextField();
        GrasimeField.setBounds(89, 190, 149, 20);
        this.add(GrasimeField);
        GrasimeField.setColumns(10);

        SodiuField = new JTextField();
        SodiuField.setBounds(89, 216, 149, 20);
        this.add(SodiuField);
        SodiuField.setColumns(10);

        PretField = new JTextField();
        PretField.setBounds(89, 241, 149, 20);
        this.add(PretField);
        PretField.setColumns(10);

        CreateAddButton = new JButton("ADD PRODUCT");
        CreateAddButton.setBounds(331, 119, 105, 62);
        this.add(CreateAddButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(342, 215, 89, 23);
        this.add(BackButton);
    }

    public String getNameField() {
        return NameField.getText();
    }

    public void setNameField(String nameField) {
        this.NameField.setText(nameField);
    }

    public String getRatingField() {
        return RatingField.getText();
    }

    public void setRatingField(String ratingField) {
        this.RatingField.setText(ratingField);
    }

    public String getClaoriiField() {
        return ClaoriiField.getText();
    }

    public void setClaoriiField(String claoriiField) {
        this.ClaoriiField.setText(claoriiField);
    }

    public String getProteineField() {
        return ProteineField.getText();
    }

    public void setProteineField(String proteineField) {
        this.ProteineField.setText(proteineField);
    }

    public String getGrasimeField() {
        return GrasimeField.getText();
    }

    public void setGrasimeField(String grasimeField) {
        this.GrasimeField.setText(grasimeField);
    }

    public String getSodiuField() {
        return SodiuField.getText();
    }

    public void setSodiuField(String sodiuField) {
        this.SodiuField.setText(sodiuField);
    }

    public String getPretField() {
        return PretField.getText();
    }

    public void setPretField(String pretField) {
        this.PretField.setText(pretField);
    }

    public void AddToListListener(ActionListener action){
        CreateAddButton.addActionListener(action);
    }

    public void backListener(ActionListener action){
        BackButton.addActionListener(action);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
        refreh();
    }

    public void refreh() {
        NameField.setText(null);
        RatingField.setText(null);
        ClaoriiField.setText(null);
        ProteineField.setText(null);
        GrasimeField.setText(null);
        SodiuField.setText(null);
        PretField.setText(null);
    }
}
