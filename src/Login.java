import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;
    JLabel lbl1 , lbl2 , lbl3 , lbl4 , lbl5, lbl6;



    public Login () {
        super("Login Page");
        panel = new JPanel();
        setBounds(600,300,900,500);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/LoadingBackground.jpg"));
        Image i3 = i1.getImage().getScaledInstance(900, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        lbl6 = new JLabel(i2);
        setContentPane(lbl6);
        panel.setLayout(null);

        lbl1 = new JLabel("Username: ");
        lbl1.setBounds(330, 149, 95, 24);
        lbl6.add(lbl1);

        lbl2 = new JLabel("Password: ");
        lbl2.setBounds(330, 184, 95, 24);
        lbl6.add(lbl2);

        textField = new JTextField();
        textField.setBounds(416,153,157,20);
        lbl6.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(416, 188, 157, 20);
        lbl6.add(passwordField);

        lbl3 = new JLabel("WELCOME");
        lbl3.setBounds(450, 100, 100, 60);
        lbl3.setForeground(Color.RED);
        lbl6.add(lbl3);

        lbl4 = new JLabel("");
        lbl4.setBounds(583, 184, 46, 34);
        lbl6.add(lbl3);

        b1 = new JButton("Login");
        b1.addActionListener(this);

        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(250, 250, 210));
        b1.setBounds(355, 241, 113, 39);
        lbl6.add(b1);

        b2 = new JButton("SignUp");
        b2.addActionListener(this);

        b2.setForeground(new Color(139, 69, 19));
        b2.setBackground(new Color(255, 235, 205));
        b2.setBounds(495, 241, 113, 39);
        lbl6.add(b2);

        b3 = new JButton("Forgot Password");
        b3.addActionListener(this);

        b3.setForeground(new Color(205, 92, 92));
        b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(405, 291, 179, 39);
        lbl6.add(b3);

        lbl5 = new JLabel("Trouble in Login?");
        lbl5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lbl5.setForeground(new Color(255, 0, 0));
        lbl5.setBounds(276, 300, 130, 20);
        lbl6.add(lbl5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(211,211,211));
        panel2.setBounds(230, 100, 434, 263);
        lbl6.add(panel2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            Boolean status = false;
            try {
                conn con = new conn();
                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading().setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login...!.");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (e.getSource() == b2) {
            setVisible(false);
            SignUp su = new SignUp();
            su.setVisible(true);
        }
        if (e.getSource() == b3) {
            setVisible(false);
            Forgot forgot = new Forgot();
            forgot.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
