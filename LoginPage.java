package gui;

import entity.Customer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    JTextField customerIdField, nameField;
    JComboBox<String> flightTypeBox, fromBox, toBox;
    JButton loginButton;
    JPanel panel;

    String[] citiesDomestic = {"Dhaka", "Chittagong", "Sylhet", "Rajshahi"};
    String[] citiesInternational = {"New York", "London", "Dubai", "Singapore"};

    public static Customer currentCustomer;

    public LoginPage() {
        setTitle("Flight Expert - Login");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("FlightExpert.png"));
        ImageIcon background = new ImageIcon("Flight.png");

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        
        panel.setLayout(new GridLayout(7, 2));
        setContentPane(panel);


        panel = new JPanel(new GridLayout(7, 2));
        setContentPane(panel);

        panel.add(new JLabel("Customer ID:"));
        customerIdField = new JTextField();
        panel.add(customerIdField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Flight Type:"));
        flightTypeBox = new JComboBox<>(new String[]{"Domestic", "International"});
        panel.add(flightTypeBox);

        panel.add(new JLabel("From:"));
        fromBox = new JComboBox<>(citiesDomestic);
        panel.add(fromBox);

        panel.add(new JLabel("To:"));
        toBox = new JComboBox<>(citiesDomestic);
        panel.add(toBox);

        flightTypeBox.addActionListener(e -> updateCities());

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        setVisible(true);
    }

    void updateCities() {
        if (flightTypeBox.getSelectedItem().equals("Domestic")) {
            fromBox.setModel(new DefaultComboBoxModel<>(citiesDomestic));
            toBox.setModel(new DefaultComboBoxModel<>(citiesDomestic));
        } else {
            fromBox.setModel(new DefaultComboBoxModel<>(new String[]{"Dhaka"}));
            toBox.setModel(new DefaultComboBoxModel<>(citiesInternational));
        }
    }

    public void actionPerformed(ActionEvent e) {
        String id = customerIdField.getText();
        String name = nameField.getText();
        currentCustomer = new Customer(id, name);
        dispose();
        new AirlineSelectionPage();
    }
}
