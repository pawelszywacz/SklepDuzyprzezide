package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton bnt;
    private TextPanel textPanel;  //zmiana z JButton bnt;



    public MainFrame(){
        super("Aplikacja wyliczeniowa");

        setLayout(new BorderLayout());

        bnt = new JButton();
        textPanel = new TextPanel();

        //add(textPanel,BorderLayout.CENTER);// ust textu
        //add(bnt, BorderLayout.SOUTH);  // ustawienie przycisku

        bnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //textPanel.append("Hej loll\n"); // działanie po przyciśnięciu gózika
            }
        });

        add(textPanel,BorderLayout.CENTER);
        add(bnt, BorderLayout.SOUTH);

        setSize(600,600); //rozmiar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamyka
        setVisible(true);  //widoczne

    }


}
