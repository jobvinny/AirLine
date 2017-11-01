package airline;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class AdminLogin {

    void AdminLogin() {

        ImageIcon image = new ImageIcon("images/acmp.png");
        ImageIcon image1 = new ImageIcon("images/login3.png");
        JLabel logo = new JLabel(image);
        JLabel Uname = new JLabel("UserName");
        Uname.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JLabel Upass = new JLabel("Password");
        Upass.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));

        JTextField username = new JTextField(20);
        username.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        JPasswordField pass = new JPasswordField(20);

        JButton login = new JButton(image1);
        login.setToolTipText("Click to login...");
        login.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        login.setBackground(Color.green);
        /*JButton signin = new JButton("SignIn");
         signin.setToolTipText("Click to signin..");
         signin.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
         signin.setBackground(Color.pink);*/

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel1.add(logo);
        JPanel panel2 = new JPanel(new GridLayout(3, 2, 5, 5));
        panel2.add(Uname);
        panel2.add(username);
        panel2.add(Upass);
        panel2.add(pass);
        panel2.add(login);
        //panel2.add(signin);
        panel2.setBorder(new TitledBorder("Administration_LoginForm"));
        JPanel panel = new JPanel(new BorderLayout());
        panel.add("North", panel1);
        panel.add("South", panel2);
        panel.setBackground(Color.PINK);
        panel.setBorder(new TitledBorder("Welcome."));

        JFrame frame = new JFrame("ACMP_AIRWAYS_LOGIN");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enter1 = "Vinny";
                String enter2 = "6668";
                String usr = username.getText();
                String up = pass.getText();
                if (enter1.equals(usr) && up.equals(enter2)) {
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Logged_in Successifully");
                    AdminOperations uo = new AdminOperations();
                    uo.AdminOperations();

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Details");
                }
            }
        });
        frame.add(panel);
        // frame.pack();
        frame.setSize(350, 360);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
