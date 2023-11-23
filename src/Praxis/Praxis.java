package Praxis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praxis {
    Queue <Patient> blutschlange;
    Queue <Patient> arztschlange;
    Patient platz1;
    private JPanel artzpraxis;
    private JTextField textField1;
    private JTextField textField2;
    private JButton aufnehmenAButton;
    private JTextField textField3;
    private JButton aufrufenAButton;
    private JLabel Artztpraxis;
    private JLabel name;
    private JLabel nachname;
    private JLabel label2;
    private JButton aufnehmenBlutdruckButton;
    private JButton aufrufenBlutdruckButton;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;

    public Praxis() {
blutschlange= new Queue <Patient>();
        arztschlange= new Queue <Patient>();

        aufnehmenAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient pPatient=new Patient(textField1.getText(),textField2.getText());
                arztschlange.enqueue(pPatient);
            textField1.setText("");
            textField2.setText("");
                Patient lokal = arztschlange.front();

                textField3.setText(lokal.getNachname()+", "+ lokal.getVorname());
            }

        });
        aufrufenAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient lokal = arztschlange.front();

                textField4.setText(lokal.getNachname()+", "+ lokal.getVorname());
                textField3.setText("");
                arztschlange.dequeue();
                textField1.setText("");
                textField2.setText("");


            }
        });
        aufnehmenBlutdruckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient pPatient=new Patient(textField1.getText(),textField2.getText());
                blutschlange.enqueue(pPatient);
                textField1.setText("");
                textField2.setText("");
                Patient lokal = blutschlange.front();

                textField5.setText(lokal.getNachname()+", "+ lokal.getVorname());
            }
        });
        aufrufenBlutdruckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient lokal = blutschlange.front();

                textField4.setText(lokal.getNachname()+", "+ lokal.getVorname());
                blutschlange.dequeue();
                textField5.setText("");
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Praxis");
        frame.setContentPane(new Praxis().artzpraxis);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
