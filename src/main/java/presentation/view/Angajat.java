package presentation.view;

import javax.swing.*;

public class Angajat extends JFrame {
    JTextArea textArea;

    public Angajat() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        this.setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(40, 30, 341, 197);
        this.add(textArea);
        textArea.setEditable(false);
    }

    public String getTextArea() {
        return textArea.getText();
    }

    public void setTextArea(String textArea) {
        this.textArea.setText(textArea);
    }
}

