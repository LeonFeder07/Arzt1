package Praxis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praxis {
    Queue <Patient> blutschlange;
    Queue <Patient> arztschlange;
    Stack <Patient> rechnung;
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
    private JButton stackbuttom;
    private JTextField textField6;
    private JButton eingabeLeerenButton;

    public Praxis() {
blutschlange= new Queue <Patient>();
        arztschlange= new Queue <Patient>();
        rechnung= new Stack<Patient>();

        aufnehmenAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient pPatient=new Patient(textField1.getText(),textField2.getText(),"Arzt");
                arztschlange.enqueue(pPatient);


                Patient lokal = arztschlange.front();

                textField3.setText(lokal.getNachname()+", "+ lokal.getVorname());
            }

        });
        aufrufenAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Patient  lokal = arztschlange.front();
             if(arztschlange.front()!=null) {
                 rechnung.push(arztschlange.front());

                 textField6.setText(rechnung.top().getNachname() +", "+ rechnung.top().getVorname()+", "+rechnung.top().getTermin());
             }
                if(arztschlange.front()!=null) {


                    textField4.setText(lokal.getNachname() + ", " + lokal.getVorname());
                    textField3.setText("");
                    arztschlange.dequeue();
                    lokal=arztschlange.front();


                    if(arztschlange.front()!=null) {
                        textField3.setText(lokal.getNachname() + ", " + lokal.getVorname());
                    }
                }

            }
        });
        aufnehmenBlutdruckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient pPatient=new Patient(textField1.getText(),textField2.getText(),"Blut");
                blutschlange.enqueue(pPatient);


                Patient lokal = blutschlange.front();

                textField5.setText(lokal.getNachname()+", "+ lokal.getVorname());
            }
        });
        aufrufenBlutdruckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient  lokal = blutschlange.front();
                if(blutschlange.front()!=null) {
                    rechnung.push(blutschlange.front());
                    textField6.setText(rechnung.top().getNachname() +","+ rechnung.top().getVorname()+", "+rechnung.top().getTermin());
                }
               if(blutschlange.front()!=null) {


                   textField4.setText(lokal.getNachname() + ", " + lokal.getVorname());
                   blutschlange.dequeue();
                   lokal = blutschlange.front();
                   textField5.setText("");

                   if(blutschlange.front()!=null) {
                   textField5.setText(lokal.getNachname() + ", " + lokal.getVorname());
               }}
            }
        });
        stackbuttom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    rechnung.pop();
                if(!rechnung.isEmpty()) {
                    textField6.setText(rechnung.top().getNachname() + ", " + rechnung.top().getVorname()+", "+rechnung.top().getTermin());
                }else{
                    textField6.setText("");
                }
            }
        });
        eingabeLeerenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
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
