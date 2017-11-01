/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class UserOperations {
    
    void UserOperations() {
        ImageIcon image = new ImageIcon("images/acmp7.png");
        ImageIcon nxt = new ImageIcon("images/next3.png");
        ImageIcon pr = new ImageIcon("images/back2.png");
        ImageIcon logo = new ImageIcon("images/acmp.png");
        
        JLabel pic = new JLabel(image);
        JLabel name = new JLabel("Journey");
        name.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldname = new JTextField(15);
        fieldname.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel gender = new JLabel("Depature_Time");
        gender.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JComboBox fieldgender = new JComboBox();
        fieldgender.addItem("Fly_To");
        fieldgender.addItem("Kenya");
        fieldgender.addItem("Chuka");
        fieldgender.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Location = new JLabel("Flight_No");
        Location.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldlocation = new JTextField(15);
        fieldlocation.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Address = new JLabel("From");
        Address.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldaddress = new JTextField(15);
        fieldaddress.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Email = new JLabel("Class");
        Email.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JComboBox fieldemail = new JComboBox();
        fieldemail.addItem("Choose_Class");
        fieldemail.addItem("Business_Class");
        fieldemail.addItem("Executive_Class");
        fieldemail.addItem("Economy_Class");
        fieldemail.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel pw = new JLabel("Charge");
        pw.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField pass1 = new JTextField(10);
        pass1.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        /* JLabel pw1 = new JLabel("Re_enter");
         pw1.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
         JPasswordField pass2 = new JPasswordField(10);
         pass2.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
         JTextArea warn = new JTextArea("Please Enter \nall details");*/
        
        JButton logout = new JButton("Logout");
        logout.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton confirm = new JButton("Confirm");
        confirm.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        JButton change = new JButton("Change");
        change.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        
        JButton access = new JButton(nxt);
        access.setToolTipText("Next_Button...");
        JButton daccess = new JButton(pr);
        daccess.setToolTipText("Previous_Button...");
        JLabel details = new JLabel("Browse User Operations...");
        details.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.add(pic);
        
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(details);
        panel2.add(daccess);
        panel2.add(access);
        panel2.add(logout);
        panel2.setBackground(Color.PINK);
        panel2.setBorder(new TitledBorder("Welcome."));
        //cardlayout.
        JPanel card = new JPanel(new CardLayout(10, 10));
        
        JPanel panellogo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel acmp = new JLabel(logo);
        panellogo.add(acmp);
        panellogo.setBorder(new TitledBorder("ACMP_AIRWAYS"));
        
        JPanel panelbook = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 0, 0, 5);
        c.ipadx = 5;
        c.ipady = 5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = 0;
        c.gridy = 0;
        panelbook.add(name, c);
        c.gridy++;
        panelbook.add(gender, c);
        c.gridy++;
        panelbook.add(Location, c);
        
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 1;
        c.gridy = 0;
        panelbook.add(fieldgender);
        c.gridy++;
        panelbook.add(fieldname, c);
        c.gridy++;
        panelbook.add(fieldlocation, c);
        
        c.gridy++;
        panelbook.add(change, c);
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 2;
        c.gridy = 0;
        panelbook.add(Address, c);
        
        c.gridy++;
        panelbook.add(Email, c);
        
        c.gridy++;
        panelbook.add(pw, c);
        
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 4;
        c.gridy = 0;
        panelbook.add(fieldaddress, c);
        c.gridy++;
        panelbook.add(fieldemail, c);
        c.gridy++;
        panelbook.add(pass1, c);
        c.gridy++;
        panelbook.add(confirm, c);
        panelbook.setBorder(new TitledBorder("Book_Flight"));
        
        JPanel panelhire = new JPanel(new GridBagLayout());
        JLabel car = new JLabel("HIRE CAR");
        car.setForeground(Color.blue);
        car.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));
        JLabel feast = new JLabel("Car_Type");
        feast.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JComboBox ccar = new JComboBox();
        ccar.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        ccar.addItem("Luxuries_Car");
        ccar.addItem("Ferrari_LaFerrari");
        ccar.addItem("Bugatti");
        ccar.addItem("Lamborghini");
        ccar.addItem("Koenigsegg");
        ccar.addItem("Pagani");
        JLabel pay = new JLabel("Hiring_Cost");
        pay.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField charge = new JTextField(15);
        charge.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton hire = new JButton("Hire");
        hire.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        
        ccar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ccar.setSelectedItem("Ferrari_LaFerrari");
                String cost = "$200";
                // int value = Integer.parseInt(cost);
                charge.setText(cost);
                
            }
        });
        c.insets = new Insets(10, 0, 0, 5);
        c.ipadx = 5;
        c.ipady = 5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = 1;
        c.gridy = 0;
        panelhire.add(car, c);
        
        c.insets = new Insets(10, 0, 0, 5);
        c.ipadx = 5;
        c.ipady = 5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = 0;
        c.gridy = 1;
        panelhire.add(feast, c);
        c.gridy++;
        panelhire.add(pay, c);
        c.gridy++;
        panelhire.add(hire, c);
        
        c.insets = new Insets(10, 0, 0, 5);
        c.ipadx = 5;
        c.ipady = 5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = 1;
        c.gridy = 1;
        panelhire.add(ccar, c);
        c.gridy++;
        panelhire.add(charge, c);
        
        panelhire.setBorder(new TitledBorder("Hire_Car"));
        
        card.add(panellogo);
        card.add(panelbook);
        card.add(panelhire);
        CardLayout cardLayout = (CardLayout) (card.getLayout());
        access.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(card);
                
            }
        });
        
        daccess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(card);
            }
        });
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add("North", panel1);
        panel.add("Center", panel2);
        panel.add("South", card);
        panel.setBackground(Color.PINK);
        panel.setBorder(new TitledBorder("AirLine_System."));
        
        JFrame frame = new JFrame("ACMP_AIRWAYS");
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JOptionPane.showMessageDialog(null, "Logged_Out Successifully");
                new AirLine();
            }
        });
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        //frame.setSize(715, 730);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
