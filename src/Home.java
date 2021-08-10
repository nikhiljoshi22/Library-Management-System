import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton b1, b2, b3, b4, b5, b6;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;

    public Home() {
        super("Home Page");
        setBounds(400, 150, 1000, 800);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(Color.CYAN);
        menuBar.setBounds(0, 0, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(new Color(105, 105, 105));
        mntmExit.setBackground(new Color(211, 211, 211));
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);

        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmAboutUs = new JMenuItem("About Us");
        mntmAboutUs.setForeground(new Color(105, 105, 105));
        mntmAboutUs.setBackground(new Color(211, 211, 211));
        mntmAboutUs.addActionListener(this);
        mnHelp.add(mntmAboutUs);

        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem bookdetails = new JMenuItem("Book Details");
        bookdetails.addActionListener(this);
        bookdetails.setBackground(new Color(211, 211, 211));
        bookdetails.setForeground(Color.DARK_GRAY);
        mnRecord.add(bookdetails);

        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(new Color(211, 211, 211));
        studentdetails.setForeground(Color.DARK_GRAY);
        studentdetails.addActionListener(this);
        mnRecord.add(studentdetails);

        menuBar.add(mnRecord);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);

        lbl1 = new JLabel("Library Management System");
        lbl1.setForeground(new Color(204, 51, 102));
        lbl1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
        lbl1.setBounds(268, 30, 701, 80);
        contentPane.add(lbl1);

        lbl2 = new JLabel("");
        lbl2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        lbl2 = new JLabel(i3);
        lbl2.setBounds(140, 140, 159, 152);
        contentPane.add(lbl2);

        lbl3 = new JLabel("");
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/second.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        lbl3 = new JLabel(i6);
        lbl3.setBounds(393, 160, 134, 128);
        contentPane.add(lbl3);

        lbl4 = new JLabel("");
        ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/third.png"));
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        lbl4 = new JLabel(i9);
        lbl4.setBounds(610, 140, 225, 152);
        contentPane.add(lbl4);

        b1 = new JButton("Add Books");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(140, 320, 159, 44);
        contentPane.add(b1);

        b2 = new JButton("Statistics");
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(393, 320, 139, 44);
        contentPane.add(b2);

        b3 = new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(642, 320, 167, 44);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(100, 120, 750, 260);
        panel.setBackground(new Color(204,255,229));
        contentPane.add(panel);

        b4 = new JButton("Issue Book");
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(156, 620, 143, 41);
        contentPane.add(b4);

        b5 = new JButton("Return Book");
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(390, 620, 159, 41);
        contentPane.add(b5);

        b6 = new JButton("About Us");
        b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(642, 620, 159, 41);
        contentPane.add(b6);

        lbl5 = new JLabel("");
        ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.png"));
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        lbl5 = new JLabel(i12);
        lbl5.setBounds(140, 440, 159, 163);
        contentPane.add(lbl5);

        lbl6 = new JLabel("");
        ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("icons/fifth.png"));
        Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        lbl6 = new JLabel(i15);
        lbl6.setBounds(400, 440, 139, 152);
        contentPane.add(lbl6);

        lbl7 = new JLabel("");
        ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
        Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        lbl7 = new JLabel(i18);
        lbl7.setBounds(642, 440, 157, 152);
        contentPane.add(lbl7);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(233, 150, 122)));
        panel2.setBounds(100, 420, 750, 270);
        panel2.setBackground(new Color(204,255,229));
        contentPane.add(panel2);

        getContentPane().setBackground(Color.WHITE);
        contentPane.setBackground(Color.YELLOW);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("Logout")){
            setVisible(false);
            new Login().setVisible(true);
        }else if(msg.equals("Exit")){
            System.exit(ABORT);

        }else if(msg.equals("Read Me")){

        }else if(msg.equals("About Us")){
            setVisible(false);
            new aboutUs().setVisible(true);

        }else if(msg.equals("Book Details")){
            setVisible(false);
            new BookDetails().setVisible(true);
        }else if(msg.equals("Student Details")){
            setVisible(false);
            new StudentDetails().setVisible(true);

        }

        if(e.getSource() == b1){
            this.setVisible(false);
            new AddBook().setVisible(true);
        }
        if(e.getSource() == b2){
            this.setVisible(false);
            new Statistics().setVisible(true);
        }
        if(e.getSource() == b3){
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }
        if(e.getSource() == b4){
            this.setVisible(false);
            new IssueBook().setVisible(true);
        }
        if(e.getSource() == b5){
            this.setVisible(false);
            new ReturnBook().setVisible(true);

        }
        if(e.getSource() == b6){
            this.setVisible(false);
            new aboutUs().setVisible(true);

        }

    }

    public static void main(String[] args) {
        new Home().setVisible(true);
    }
}
