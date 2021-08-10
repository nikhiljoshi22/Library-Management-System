import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Forgot extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txt1, txt2, txt3, txt4, txt5;
    private JButton b1, b2, b3;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5;

    public Forgot() {
        super("Forgot Password");
        setBounds(500, 200, 650, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(33,245,209));
        contentPane.setLayout(null);

        lbl1 = new JLabel("Username : ");
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl1.setBounds(109, 83, 87, 29);
        contentPane.add(lbl1);

        lbl2 = new JLabel("Name : ");
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl2.setBounds(109, 122, 75, 21);
        contentPane.add(lbl2);

        lbl3 = new JLabel("Your Security Question : ");
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl3.setBounds(109, 154, 170, 27);
        contentPane.add(lbl3);

        lbl4 = new JLabel("Answer : ");
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl4.setBounds(109, 192, 104, 21);
        contentPane.add(lbl4);

        lbl5 = new JLabel("Password : ");
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl5.setBounds(109, 224, 104, 21);
        contentPane.add(lbl5);

        txt1 = new JTextField();
        txt1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txt1.setForeground(new Color(105, 105, 105));
        txt1.setBounds(277, 88, 139, 20);
        contentPane.add(txt1);
        txt1.setColumns(10);

        txt2 = new JTextField();
        txt2.setEditable(false);
        txt2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txt2.setForeground(new Color(165, 42, 42));
        txt2.setColumns(10);
        txt2.setBounds(277, 123, 139, 20);
        contentPane.add(txt2);

        txt3 = new JTextField();
        txt3.setEditable(false);
        txt3.setFont(new Font("Times New Roman", Font.BOLD, 12));
        txt3.setForeground(new Color(72, 61, 139));
        txt3.setColumns(10);
        txt3.setBounds(277, 161, 221, 20);
        contentPane.add(txt3);

        txt4 = new JTextField();
        txt4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txt4.setForeground(new Color(205, 92, 92));
        txt4.setColumns(10);
        txt4.setBounds(277, 193, 139, 20);
        contentPane.add(txt4);

        txt5 = new JTextField();
        txt5.setEditable(false);
        txt5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txt5.setForeground(new Color(50, 205, 50));
        txt5.setColumns(10);
        txt5.setBounds(277, 225, 139, 20);
        contentPane.add(txt5);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b1.setBounds(428, 83, 80, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Retrieve");
        b2.addActionListener(this);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b2.setBounds(426, 188, 102, 29);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b3.setBounds(233, 270, 101, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 3), "Forgot-Panel",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(178, 34, 34)));
        panel.setBounds(47, 45, 508, 281);
        contentPane.add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }






    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, txt1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    txt2.setText(rs.getString("name"));
                    txt3.setText(rs.getString("sec_q"));
                }

            }
            if(ae.getSource() == b2){
                String sql = "select * from account where sec_ans=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, txt4.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    txt5.setText(rs.getString("password"));
                }

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new Login().setVisible(true);

            }
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new Forgot().setVisible(true);
    }
}
