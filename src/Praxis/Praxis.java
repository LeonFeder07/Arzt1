package Praxis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praxis {
    Patient platz1;
    private JPanel artzpraxis;
    private JTextField textField1;
    private JTextField textField2;
    private JButton aufnehmenButton;
    private JTextField textField3;
    private JButton aufrufenButton;
    private JLabel Artztpraxis;
    private JLabel name;
    private JLabel nachname;
    private JLabel label2;

    public Praxis() {


        aufnehmenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        aufrufenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void aufnehmen(Patient pPatient){
        if(platz1==null){
            platz1=pPatient;

        } else{
            platz1.setNachfolger(pPatient);

        }

    }
    public Patient aufrufen(){
        if(platz1!=null) {
            System.out.println(platz1.getVorname() + "," + platz1.getNachname() + "," + platz1.getKrankenkasse());
            Patient zwischenspeicher = platz1;
            platz1 = platz1.getNachfolger();
            return zwischenspeicher;
        }else{return null;}
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Praxis");
        frame.setContentPane(new Praxis().artzpraxis);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}