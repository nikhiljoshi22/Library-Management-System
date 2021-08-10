import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IssueBook extends JFrame implements ActionListener {

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14;
    private JButton b1, b2, b3, b4;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15;

    public IssueBook() {
        super("Issue Books");
        setBounds(300, 200, 900, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(33,245,209));
        contentPane.setLayout(null);

        lbl1 = new JLabel("Book ID");
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl1.setForeground(new Color(47, 79, 79));
        lbl1.setBounds(47, 63, 100, 23);
        contentPane.add(lbl1);

        lbl2 = new JLabel("Name");
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl2.setForeground(new Color(47, 79, 79));
        lbl2.setBounds(47, 97, 100, 23);
        contentPane.add(lbl2);

        lbl3 = new JLabel("ISBN");
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl3.setForeground(new Color(47, 79, 79));
        lbl3.setBounds(47, 131, 100, 23);
        contentPane.add(lbl3);

        lbl4 = new JLabel("Publisher");
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl4.setForeground(new Color(47, 79, 79));
        lbl4.setBounds(47, 165, 100, 23);
        contentPane.add(lbl4);

        lbl5 = new JLabel("Edition");
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl5.setForeground(new Color(47, 79, 79));
        lbl5.setBounds(47, 199, 100, 23);
        contentPane.add(lbl5);

        lbl6 = new JLabel("Price");
        lbl6.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl6.setForeground(new Color(47, 79, 79));
        lbl6.setBounds(47, 233, 100, 23);
        contentPane.add(lbl6);

        lbl7 = new JLabel("Pages");
        lbl7.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl7.setForeground(new Color(47, 79, 79));
        lbl7.setBounds(47, 267, 100, 23);
        contentPane.add(lbl7);

        txt1 = new JTextField();
        txt1.setForeground(new Color(47, 79, 79));
        txt1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt1.setBounds(126, 66, 86, 20);
        contentPane.add(txt1);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(234, 59, 100, 30);
        contentPane.add(b1);

        txt2 = new JTextField();
        txt2.setEditable(false);
        txt2.setForeground(new Color(47, 79, 79));
        txt2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt2.setBounds(126, 100, 208, 20);
        contentPane.add(txt2);
        txt2.setColumns(10);

        txt3 = new JTextField();
        txt3.setEditable(false);
        txt3.setForeground(new Color(47, 79, 79));
        txt3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt3.setColumns(10);
        txt3.setBounds(126, 131, 208, 20);
        contentPane.add(txt3);

        txt4 = new JTextField();
        txt4.setEditable(false);
        txt4.setForeground(new Color(47, 79, 79));
        txt4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt4.setColumns(10);
        txt4.setBounds(126, 168, 208, 20);
        contentPane.add(txt4);

        txt5 = new JTextField();
        txt5.setEditable(false);
        txt5.setForeground(new Color(47, 79, 79));
        txt5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt5.setColumns(10);
        txt5.setBounds(126, 202, 208, 20);
        contentPane.add(txt5);

        txt6 = new JTextField();
        txt6.setEditable(false);
        txt6.setForeground(new Color(47, 79, 79));
        txt6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt6.setColumns(10);
        txt6.setBounds(126, 236, 208, 20);
        contentPane.add(txt6);

        txt7 = new JTextField();
        txt7.setEditable(false);
        txt7.setForeground(new Color(47, 79, 79));
        txt7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt7.setColumns(10);
        txt7.setBounds(126, 270, 208, 20);
        contentPane.add(txt7);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
        panel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        lbl8 = new JLabel("Student ID");
        lbl8.setForeground(new Color(47, 79, 79));
        lbl8.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl8.setBounds(384, 63, 100, 23);
        contentPane.add(lbl8);

        lbl9 = new JLabel("Name");
        lbl9.setForeground(new Color(47, 79, 79));
        lbl9.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl9.setBounds(384, 103, 100, 23);
        contentPane.add(lbl9);

        lbl10 = new JLabel("Father's Name");
        lbl10.setForeground(new Color(47, 79, 79));
        lbl10.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl10.setBounds(384, 147, 100, 23);
        contentPane.add(lbl10);

        lbl11 = new JLabel("Course");
        lbl11.setForeground(new Color(47, 79, 79));
        lbl11.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl11.setBounds(384, 187, 100, 23);
        contentPane.add(lbl11);

        lbl12 = new JLabel("Branch");
        lbl12.setForeground(new Color(47, 79, 79));
        lbl12.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl12.setBounds(384, 233, 100, 23);
        contentPane.add(lbl12);

        lbl13 = new JLabel("Year");
        lbl13.setForeground(new Color(47, 79, 79));
        lbl13.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl13.setBounds(384, 284, 100, 23);
        contentPane.add(lbl13);

        lbl14 = new JLabel("Semester");
        lbl14.setForeground(new Color(47, 79, 79));
        lbl14.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl14.setBounds(384, 336, 100, 23);
        contentPane.add(lbl14);

        txt8 = new JTextField();
        txt8.setForeground(new Color(47, 79, 79));
        txt8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt8.setColumns(10);
        txt8.setBounds(508, 66, 86, 20);
        contentPane.add(txt8);

        b2 = new JButton("Search");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        txt9 = new JTextField();
        txt9.setForeground(new Color(47, 79, 79));
        txt9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt9.setEditable(false);
        txt9.setColumns(10);
        txt9.setBounds(508, 106, 208, 20);
        contentPane.add(txt9);

        txt10 = new JTextField();
        txt10.setForeground(new Color(47, 79, 79));
        txt10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt10.setEditable(false);
        txt10.setColumns(10);
        txt10.setBounds(508, 150, 208, 20);
        contentPane.add(txt10);

        txt11 = new JTextField();
        txt11.setForeground(new Color(47, 79, 79));
        txt11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt11.setEditable(false);
        txt11.setColumns(10);
        txt11.setBounds(508, 190, 208, 20);
        contentPane.add(txt11);

        txt12 = new JTextField();
        txt12.setForeground(new Color(47, 79, 79));
        txt12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt12.setEditable(false);
        txt12.setColumns(10);
        txt12.setBounds(508, 236, 208, 20);
        contentPane.add(txt12);

        txt13 = new JTextField();
        txt13.setForeground(new Color(47, 79, 79));
        txt13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt13.setEditable(false);
        txt13.setColumns(10);
        txt13.setBounds(508, 286, 208, 20);
        contentPane.add(txt13);

        txt14 = new JTextField();
        txt14.setForeground(new Color(47, 79, 79));
        txt14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt14.setEditable(false);
        txt14.setColumns(10);
        txt14.setBounds(508, 338, 208, 20);
        contentPane.add(txt14);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Student-Deatails",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
        panel_1.setForeground(new Color(0, 100, 0));
        panel_1.setBounds(360, 38, 378, 372);
        panel_1.setBackground(Color.WHITE);
        contentPane.add(panel_1);

        lbl15 = new JLabel(" Date of Issue :");
        lbl15.setForeground(new Color(105, 105, 105));
        lbl15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        lbl15.setBounds(20, 340, 118, 26);
        contentPane.add(lbl15);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        dateChooser.setDateFormatString("YYYY-MM-dd\n\n");
        contentPane.add(dateChooser);

        b3 = new JButton("Issue");
        b3.addActionListener(this);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b3.setBounds(47, 377, 118, 33);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        b4 = new JButton("Back");
        b4.addActionListener(this);
        b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b4.setBounds(199, 377, 100, 33);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from book where book_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, txt1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    txt2.setText(rs.getString("name"));
                    txt3.setText(rs.getString("isbn"));
                    txt4.setText(rs.getString("publisher"));
                    txt5.setText(rs.getString("edition"));
                    txt6.setText(rs.getString("price"));
                    txt7.setText(rs.getString("pages"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, txt8.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    txt9.setText(rs.getString("name"));
                    txt10.setText(rs.getString("father"));
                    txt11.setText(rs.getString("course"));
                    txt12.setText(rs.getString("branch"));
                    txt13.setText(rs.getString("year"));
                    txt14.setText(rs.getString("semester"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b3){
                try{
                    String sql = "insert into issueBook(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, txt1.getText());
                    st.setString(2, txt8.getText());
                    st.setString(3, txt2.getText());
                    st.setString(4, txt9.getText());
                    st.setString(5, txt11.getText());
                    st.setString(6, txt12.getText());
                    st.setString(7, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    int i = st.executeUpdate();
                    if (i > 0)
                        JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new Home().setVisible(true);

            }

            con.c.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new IssueBook().setVisible(true);
    }
}
