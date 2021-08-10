import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class SignUp extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txt1, txt2 , txt3, txt4;
    private JButton b1, b2;
    private JComboBox comboBox;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5;



    public SignUp () {
        super("Sign Up Page");
        setBounds(600, 250, 606, 406);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(33,245,209));
        contentPane.setLayout(null);

        lbl1 = new JLabel("Username :");
        lbl1.setForeground(Color.DARK_GRAY);
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl1.setBounds(99, 86, 92, 26);
        contentPane.add(lbl1);

        lbl2 = new JLabel("Name :");
        lbl2.setForeground(Color.DARK_GRAY);
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl2.setBounds(99, 123, 92, 26);
        contentPane.add(lbl2);

        lbl3 = new JLabel("Password :");
        lbl3.setForeground(Color.DARK_GRAY);
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl3.setBounds(99, 160, 92, 26);
        contentPane.add(lbl3);

        lbl4 = new JLabel("Answer :");
        lbl4.setForeground(Color.DARK_GRAY);
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl4.setBounds(99, 234, 92, 26);
        contentPane.add(lbl4);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your favourite book?", "Your Lucky Number?",
                "Your child Superhero?", "Your favourite marvel movie?" }));
        comboBox.setBounds(265, 202, 148, 20);
        contentPane.add(comboBox);

        lbl5 = new JLabel("Security Question :");
        lbl5.setForeground(Color.DARK_GRAY);
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl5.setBounds(99, 197, 140, 26);
        contentPane.add(lbl5);

        txt1 = new JTextField();
        txt1.setBounds(265, 91, 148, 20);
        contentPane.add(txt1);
        txt1.setColumns(10);

        txt2 = new JTextField();
        txt2.setBounds(265, 128, 148, 20);
        contentPane.add(txt2);
        txt2.setColumns(10);

        txt3 = new JTextField();
        txt3.setBounds(265, 165, 148, 20);
        contentPane.add(txt3);
        txt3.setColumns(10);

        txt4 = new JTextField();
        txt4.setBounds(265, 239, 148, 20);
        contentPane.add(txt4);
        txt4.setColumns(10);

        b1 = new JButton("Create");
        b1.addActionListener(this);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b2.setBounds(300, 289, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(34, 139, 34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setBounds(31, 46, 476, 296);
        panel.setBackground(new Color(33,245,209));
        contentPane.add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            conn con = new conn();

            if(e.getSource() == b1){
                String sql = "insert into account (username, name, password, sec_q, sec_ans) values (?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, txt1.getText());
                st.setString(2, txt2.getText());
                st.setString(3, txt3.getText());
                st.setString(4, (String) comboBox.getSelectedItem());
                st.setString(5, txt4.getText());

                int i = st.executeUpdate();
                if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully Created");
                }

                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
            }
            if(e.getSource() == b2){
                this.setVisible(false);
                new Login().setVisible(true);

            }
        }catch(Exception ae){

        }
    }

    public static void main(String[] args) {
        new SignUp().setVisible(true);
    }
}
