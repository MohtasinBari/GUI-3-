package gui;

import javax.swing.*;
import java.awt.*;

public class ClassSelectionPage extends JFrame {
    public ClassSelectionPage(String airline) {
        setTitle("Select Class - " + airline);
        setSize(300, 200);
        getContentPane().setBackground(Color.PINK);
        setLayout(new GridLayout(2, 1));

        JButton business = new JButton("Business Class - 20000 BDT");
        JButton economy = new JButton("Economy Class - 10000 BDT");

        business.addActionListener(e -> new PaymentPage(airline, "Business", 20000));
        economy.addActionListener(e -> new PaymentPage(airline, "Economy", 10000));

        add(business);
        add(economy);

        setVisible(true);
    }
}
