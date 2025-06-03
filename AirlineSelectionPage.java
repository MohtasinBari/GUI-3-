package gui;

import javax.swing.*;
import java.awt.*;

public class AirlineSelectionPage extends JFrame {
    public AirlineSelectionPage() {
        setTitle("Select Airline");
        setSize(400, 400);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(4, 1));

        add(createButton("Bangladesh Biman"));
        add(createButton("US Bangla"));
        add(createButton("United Arab Emirates"));
        add(createButton("Singapore Airlines"));

        setVisible(true);
    }

    JButton createButton(String name) {
        JButton button = new JButton(name);
        button.addActionListener(e -> new ClassSelectionPage(name));
        return button;
    }
}
