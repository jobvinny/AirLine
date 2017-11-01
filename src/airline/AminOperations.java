/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Ososi Vincent Oisebe
 */
public class AminOperations {

    void AminOperations() {
        ImageIcon image = new ImageIcon("images/acmpair3.png");

        JLabel pic = new JLabel(image);
        JLabel airno = new JLabel("AirCraft_NO");
        airno.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField tairno = new JTextField(15);
        tairno.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel craftname = new JLabel("AirCraft_Name");
        craftname.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JComboBox tcraftname = new JComboBox();
        tcraftname.addItem("Choose_AirCraft");
        tcraftname.addItem("ACMP AIRBUS C78");
        tcraftname.addItem("ACMP AIRBUS T70");
        tcraftname.addItem("ACMP AIRBUS R54");
        tcraftname.addItem("ACMP AIRBUS A45");
        tcraftname.addItem("ACMP AIRBUS ZE4");
        tcraftname.addItem("ACMP AIRBUS KA1");
        tcraftname.addItem("ACMP AIRBUS EB3");
        tcraftname.addItem("ACMP AIRBUS RT5");
        tcraftname.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel fno = new JLabel("Flight_NO");
        fno.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField tfno = new JTextField(15);
        tfno.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel mbc = new JLabel("Max.no of Seats Business Class");
        mbc.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField tmbc = new JTextField(15);
        tmbc.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel mec = new JLabel("Max.no of Seats Executive Class");
        mec.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField tmec = new JTextField(15);
        tmec.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel mecc = new JLabel("Max.no of Seats Economy Class");
        mecc.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JTextField tmecc = new JTextField(15);
        tmecc.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));

        JButton managementair = new JButton("AirCraft/Flight_Management");
        managementair.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton managementcu = new JButton("Customer_Management");
        managementcu.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton logout = new JButton("Logout");
        logout.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton delete = new JButton("Delete");
        delete.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton modify = new JButton("Update");
        modify.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JButton newcu = new JButton("New");
        newcu.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.add(pic);
        JPanel panel2 = new JPanel(new GridLayout(1, 4, 20, 10));
        panel2.add(managementair);
        panel2.add(managementcu);
        panel2.add(logout);
        panel2.setBackground(Color.PINK);
        panel2.setBorder(new TitledBorder("Welcome."));

        JPanel panelnew = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 0, 0, 5);
        c.ipadx = 5;
        c.ipady = 5;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = 0;
        c.gridy = 0;
        panelnew.add(airno, c);
        c.gridy++;
        panelnew.add(craftname, c);

        c.gridy++;
        panelnew.add(fno, c);

        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 1;
        c.gridy = 0;
        panelnew.add(tairno);
        c.gridy++;
        panelnew.add(tcraftname, c);
        c.gridy++;
        panelnew.add(tfno, c);

        /* c.gridy++;
         panelnew.add(pass2, c);*/
        c.gridy++;
        panelnew.add(modify, c);
        c.gridy++;
        panelnew.add(delete, c);

        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 2;
        c.gridy = 0;
        c.gridy++;
        panelnew.add(mbc, c);

        c.gridy++;
        panelnew.add(mec, c);

        c.gridy++;
        panelnew.add(mecc, c);
       

        /* c.gridy++;
         panelnew.add(pw1, c);*/
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 5, 0, 0);
        c.gridx = 4;
        c.gridy = 0;
        c.gridy++;
        panelnew.add(tmbc, c);
        c.gridy++;
        panelnew.add(tmec, c);
        c.gridy++;
        panelnew.add(tmecc, c);
        c.gridy++;
        panelnew.add(newcu, c);
        panelnew.setBorder(new TitledBorder("Enter_Details"));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add("North", panel1);
        panel.add("Center", panel2);
        panel.add("South", panelnew);
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
