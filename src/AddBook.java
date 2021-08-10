import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class AddBook extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6;
    private JButton b1, b2;
    JComboBox comboBox;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;

    public void random() {
        Random rd = new Random();
        txt1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddBook() {
        super("Add Books");
        setBounds(600, 200, 518, 442);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lbl1 = new JLabel("Name : ");
        lbl1 .setForeground(new Color(47, 79, 79));
        lbl1 .setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl1 .setBounds(73, 84, 90, 22);
        contentPane.add(lbl1);

        lbl2 = new JLabel("ISBN : ");
        lbl2.setForeground(new Color(47, 79, 79));
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl2.setBounds(73, 117, 90, 22);
        contentPane.add(lbl2);

        lbl3 = new JLabel("Publisher : ");
        lbl3.setForeground(new Color(47, 79, 79));
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl3.setBounds(73, 150, 90, 22);
        contentPane.add(lbl3);

        lbl4 = new JLabel("Price : ");
        lbl4.setForeground(new Color(47, 79, 79));
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl4.setBounds(73, 216, 90, 22);
        contentPane.add(lbl4);

        lbl5 = new JLabel("Pages : ");
        lbl5.setForeground(new Color(47, 79, 79));
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl5.setBounds(73, 249, 90, 22);
        contentPane.add(lbl5);

        lbl6 = new JLabel("Book ID : ");
        lbl6.setForeground(new Color(47, 79, 79));
        lbl6.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl6.setBounds(73, 51, 102, 22);
        contentPane.add(lbl6);

        lbl7 = new JLabel("Edition : ");
        lbl7.setForeground(new Color(47, 79, 79));
        lbl7.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl7.setBounds(73, 183, 90, 22);
        contentPane.add(lbl7);

        txt1 = new JTextField();
        txt1.setForeground(new Color(47, 79, 79));
        txt1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt1.setBounds(169, 54, 198, 20);
        contentPane.add(txt1);
        txt1.setColumns(10);

        txt2 = new JTextField();
        txt2.setForeground(new Color(47, 79, 79));
        txt2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt2.setBounds(169, 87, 198, 20);
        contentPane.add(txt2);
        txt2.setColumns(10);

        txt3 = new JTextField();
        txt3.setForeground(new Color(47, 79, 79));
        txt3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt3.setBounds(169, 120, 198, 20);
        contentPane.add(txt3);
        txt3.setColumns(10);

        txt4 = new JTextField();
        txt4.setForeground(new Color(47, 79, 79));
        txt4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt4.setBounds(169, 153, 198, 20);
        contentPane.add(txt4);
        txt4.setColumns(10);

        txt5 = new JTextField();
        txt5.setForeground(new Color(47, 79, 79));
        txt5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt5.setBounds(169, 219, 198, 20);
        contentPane.add(txt5);
        txt5.setColumns(10);

        txt6 = new JTextField();
        txt6.setForeground(new Color(47, 79, 79));
        txt6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt6.setBounds(169, 252, 198, 20);
        contentPane.add(txt6);
        txt6.setColumns(10);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        comboBox.setBounds(173, 186, 194, 20);
        contentPane.add(comboBox);

        b1 = new JButton("Add");
        b1.addActionListener(this);
        b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b1.setBounds(102, 300, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b2.setBounds(212, 300, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Books",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
        panel.setBounds(10, 29, 398, 344);
        contentPane.add(panel);

        panel.setBackground(new Color(33,245,209));
        contentPane.setBackground(new Color(33,245,209));
        random();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }





    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
                st.setString(1, txt1.getText());
                st.setString(2, txt2.getText());
                st.setString(3, txt3.getText());
                st.setString(4, txt4.getText());
                st.setString(5, (String) comboBox.getSelectedItem());
                st.setString(6, txt5.getText());
                st.setString(7, txt6.getText());

                int rs = st.executeUpdate();
                if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                else
                    JOptionPane.showMessageDialog(null, "Error");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                st.close();
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Home().setVisible(true);

            }
            con.c.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new AddBook().setVisible(true);
    }
}
