/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/**
 *
 * @author Ososi Vincent Oisebe
 */
public class MemberSignin {

    void MemberSignin() {
        JLabel name = new JLabel("Name ID");
        name.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldname = new JTextField(15);
        fieldname.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JComboBox fieldgender = new JComboBox();
        fieldgender.addItem("Choose Gender");
        fieldgender.addItem("Male");
        fieldgender.addItem("Female");
        fieldgender.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Location = new JLabel("Location");
        Location.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldlocation = new JTextField(15);
        fieldlocation.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Address = new JLabel("Address");
        Address.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldaddress = new JTextField(15);
        fieldaddress.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Email = new JLabel("Email");
        Email.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField fieldemail = new JTextField(15);
        fieldemail.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel pw = new JLabel("Password");
        pw.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JPasswordField pass1 = new JPasswordField(10);
        pass1.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel pw1 = new JLabel("Re_enter");
        pw1.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JPasswordField pass2 = new JPasswordField(10);
        pass2.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextArea warn = new JTextArea("Please Enter \nall details");
        warn.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        warn.setForeground(Color.red);

        //getting details entered
        String Name = fieldname.getText();
        String lo = fieldlocation.getText();
        String add = fieldaddress.getText();
        String mail = fieldemail.getText();

        // String Name = fieldname.getText();
        JButton Submit = new JButton("Submit");
        Submit.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));

        JPanel panelnew = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 0, 0, 5);
        c.ipadx = 5;
        c.ipady = 5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = 0;
        c.gridy = 0;
        panelnew.add(name, c);
        c.gridy++;
        panelnew.add(gender, c);

        c.gridy++;
        panelnew.add(Location, c);

        c.gridy++;
        panelnew.add(Address, c);

        c.gridy++;
        panelnew.add(Email, c);

        c.gridy++;
        panelnew.add(pw, c);

        c.gridy++;
        panelnew.add(pw1, c);

        c.gridy++;
        panelnew.add(Submit, c);

        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 1;
        c.gridy = 0;
        panelnew.add(fieldname);
        c.gridy++;
        panelnew.add(fieldgender, c);
        c.gridy++;
        panelnew.add(fieldlocation, c);
        c.gridy++;
        panelnew.add(fieldaddress, c);
        c.gridy++;
        panelnew.add(fieldemail, c);
        c.gridy++;
        panelnew.add(pass1, c);
        c.gridy++;
        panelnew.add(pass2, c);
        c.gridy++;
        panelnew.add(warn, c);
        panelnew.setBorder(new TitledBorder("Enter_Details"));
        JFrame frame = new JFrame("ACMP_AIRWAYS_MEMBERSHIP");

        Submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String passg1 = pass1.getText();
                String passg2 = pass2.getText();
                if (passg1.equals(passg2)) {
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Details Entered Successifully");
                    UserLogin lg = new UserLogin();
                    lg.UserLogin();
                } else {
                    JOptionPane.showMessageDialog(null, "password dont match");
                }
                {

                }
            }
        });
        frame.add(panelnew);

        frame.pack();
        //frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
