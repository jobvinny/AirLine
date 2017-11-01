package airline;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class AirLine {

    public AirLine() {
//create a constructors of image
        ImageIcon image = new ImageIcon("images/acmpair.png");
        ImageIcon image1 = new ImageIcon("images/user1.png");
        ImageIcon image2 = new ImageIcon("images/admin.png");
        ImageIcon image3 = new ImageIcon("images/update.png");
        ImageIcon image4 = new ImageIcon("images/air.png");
        ImageIcon image5 = new ImageIcon("images/acmp1.png");
        ImageIcon image6 = new ImageIcon("images/acmp2.png");
        ImageIcon nxt = new ImageIcon("images/next3.png");
        ImageIcon pr = new ImageIcon("images/back2.png");
        ImageIcon logo = new ImageIcon("images/acmp.png");

        //create the jlabel components.
        JLabel pic = new JLabel(image);
        JLabel pic1 = new JLabel(image5);
        JLabel pic2 = new JLabel(image4);
        //JLabel pic4 = new JLabel(image6);

        JLabel read1 = new JLabel("Admin");
        read1.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));
        JLabel read2 = new JLabel("User");
        read2.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));

        /* JButton home = new JButton("Home");
         home.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
         JButton about = new JButton("About_Us");
         about.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
         JButton contact = new JButton("Contact_Us");
         contact.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
         JButton gallery = new JButton("Gallery");
         gallery.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
         JButton login = new JButton("Login");
         login.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12
         */
        JButton exit = new JButton(image5);
        exit.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
        exit.setToolTipText("Click To Exit The System...");
        JButton exit1 = new JButton(image6);
        exit.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 12));
        exit1.setToolTipText("Click To Exit The System...");
        exit1.setBackground(Color.green);
        JButton admin = new JButton(image2);
        admin.setSize(50, 50);
        admin.setToolTipText("administration Login...");

        JButton user = new JButton(image1);
        user.setSize(50, 50);
        user.setToolTipText("Users Login...");

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.add(pic);
        JPanel panel2 = new JPanel(new FlowLayout());
        /* panel2.add(home);
         panel2.add(about);
         panel2.add(contact);
         panel2.add(gallery);
         panel2.add(login);*/

        JButton access = new JButton(nxt);
        access.setToolTipText("Next_Button...");
        JButton daccess = new JButton(pr);
        daccess.setToolTipText("Previous_Button...");
        JLabel details = new JLabel("Click the buttons to browse ur entry");
        details.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        panel2.add(details);
        panel2.add(daccess);
        panel2.add(access);
        panel2.setBackground(Color.PINK);
        panel2.setBorder(new TitledBorder("Welcome."));

        JPanel card = new JPanel(new CardLayout(10, 10));

        JPanel panellogo = new JPanel(new BorderLayout());
        JLabel welcome = new JLabel("WELCOME TO....");
        welcome.setForeground(Color.PINK);
        welcome.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        JLabel acmp = new JLabel(logo);
        JLabel copy = new JLabel("Designed By:Ososi V Oisebe.");
        copy.setForeground(Color.BLUE);
        panellogo.add("North", welcome);
        panellogo.add("West", exit1);
        panellogo.add("Center", acmp);
        panellogo.add("South", copy);

        JPanel panelhome = new JPanel(new FlowLayout());
        JTextArea words = new JTextArea("Many people navigate websites\n by scanning the text for links."
                + "\n Clear link text can help visitors find what they want. "
                + "\n This will give them a more positive impression\n of your site and may encourage them to visit it for longer. "
                + "\n (It also helps people using screen reader software.)");
        words.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));
        panelhome.add("Left", pic1);
        panelhome.add("Right", words);
        panelhome.add(exit);
        panelhome.setBorder(new TitledBorder("Home"));

        JPanel panelus = new JPanel(new FlowLayout());
        JLabel work = new JLabel("ACMP_AIRWAYS is the leading airlinetravelling...");
        panelus.add(work);
        panelus.add(exit);
        panelus.setBorder(new TitledBorder("About_Us"));

        JPanel panelcontact = new JPanel(new FlowLayout());
        JLabel email = new JLabel("Email:generalossebe@gmail.com");
        JLabel number = new JLabel("+254713255791");
        panelcontact.add(email);
        panelcontact.add(number);
        panelcontact.add("Left", exit);
        panelcontact.setBorder(new TitledBorder("Reach_Us"));
        JPanel panelgallery = new JPanel(new FlowLayout());
        ImageIcon picimg = new ImageIcon("images/acmp1.png");
        ImageIcon picimg1 = new ImageIcon("images/index1.jpg");
        ImageIcon picimg2 = new ImageIcon("images/image2.png");
        ImageIcon picimg3 = new ImageIcon("images/image5.png");
        JLabel img = new JLabel(picimg);
        JLabel img1 = new JLabel(picimg1);
        JLabel img2 = new JLabel(picimg2);
        JLabel img3 = new JLabel(picimg3);
        panelgallery.add(img);
        panelgallery.add(img1);
        //panelgallery.add(img2);
        //panelgallery.add(img3);
        //panelgallery.add(exit);
        panelgallery.setBorder(new TitledBorder("Gallery"));

        JPanel panellogin = new JPanel(new GridLayout(2, 3, 150, 0));
        panellogin.add(admin);
        panellogin.add(pic2);
        panellogin.add(user);
        panellogin.add(read1);
        panellogin.add(exit);
        panellogin.add(read2);
        panellogin.setBorder(new TitledBorder("Admin/user_Login"));

        card.add(panellogo);
        card.add(panelhome);
        card.add(panelus);
        card.add(panelcontact);
        card.add(panelgallery);
        card.add(panellogin);
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
        //panel.add("South",panelhome);
        // panel.add("South", panellogin);
        panel.add("South", card);
        panel.setBackground(Color.PINK);
        panel.setBorder(new TitledBorder("AirLine_System."));

        JFrame frame = new JFrame("ACMP_AIRWAYS");
      /* try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.put("nimbusBase", Color.GREEN);
        } catch (Exception e) {
        }*/
        admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin min = new AdminLogin();
                min.AdminLogin();
                frame.setVisible(false);
            }
        });
        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserLogin usr = new UserLogin();
                usr.UserLogin();
                frame.setVisible(false);
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        //frame.setSize(715, 740);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new AirLine();
    }

}
