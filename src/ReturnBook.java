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
import java.sql.SQLException;

public class ReturnBook extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7;
    private JButton b1, b2, b3;
    private JDateChooser dateChooser;

    public void delete() {
        try {
            conn con = new conn();
            String sql = "delete from issueBook where book_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, txt1.getText());
            int i = st.executeUpdate();
            if (i > 0)
                JOptionPane.showConfirmDialog(null, "Book Returned");
            else
                JOptionPane.showMessageDialog(null, "error in Deleting");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    public ReturnBook () {
        super("Return Books");
        setBounds(450, 300, 617, 363);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Book_id");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(52, 52, 87, 24);
        contentPane.add(lblNewLabel);

        JLabel lblStudentid = new JLabel("Student_id");
        lblStudentid.setForeground(Color.BLACK);
        lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblStudentid.setBounds(243, 52, 87, 24);
        contentPane.add(lblStudentid);

        JLabel lblBook = new JLabel("Book");
        lblBook.setForeground(Color.BLACK);
        lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBook.setBounds(52, 98, 71, 24);
        contentPane.add(lblBook);

        JLabel lblName = new JLabel("Name");
        lblName.setForeground(Color.BLACK);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblName.setBounds(300, 98, 71, 24);
        contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Course");
        lblCourse.setForeground(Color.BLACK);
        lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCourse.setBounds(52, 143, 87, 24);
        contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Branch");
        lblBranch.setForeground(Color.BLACK);
        lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBranch.setBounds(303, 144, 68, 24);
        contentPane.add(lblBranch);

        JLabel lblDateOfIssue = new JLabel("Date of Issue");
        lblDateOfIssue.setForeground(Color.BLACK);
        lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDateOfIssue.setBounds(52, 188, 105, 29);
        contentPane.add(lblDateOfIssue);

        JLabel lblDateOfReturn = new JLabel("Date of Return");
        lblDateOfReturn.setForeground(Color.BLACK);
        lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDateOfReturn.setBounds(52, 234, 118, 29);
        contentPane.add(lblDateOfReturn);

        txt1 = new JTextField();
        txt1.setForeground(new Color(105, 105, 105));
        txt1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt1.setBounds(128, 56, 105, 20);
        contentPane.add(txt1);
        txt1.setColumns(10);

        txt2 = new JTextField();
        txt2.setForeground(new Color(105, 105, 105));
        txt2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt2.setBounds(340, 56, 93, 20);
        contentPane.add(txt2);
        txt2.setColumns(10);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBounds(443, 52, 105, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        txt3 = new JTextField();
        txt3.setEditable(false);
        txt3.setForeground(new Color(0, 100, 0));
        txt3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        txt3.setBounds(128, 102, 162, 20);
        contentPane.add(txt3);
        txt3.setColumns(10);

        txt4 = new JTextField();
        txt4.setEditable(false);
        txt4.setForeground(new Color(0, 100, 0));
        txt4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        txt4.setColumns(10);
        txt4.setBounds(369, 102, 179, 20);
        contentPane.add(txt4);

        txt5 = new JTextField();
        txt5.setEditable(false);
        txt5.setForeground(new Color(0, 100, 0));
        txt5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        txt5.setColumns(10);
        txt5.setBounds(128, 147, 162, 20);
        contentPane.add(txt5);

        txt6 = new JTextField();
        txt6.setForeground(new Color(0, 100, 0));
        txt6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        txt6.setEditable(false);
        txt6.setColumns(10);
        txt6.setBounds(369, 147, 179, 20);
        contentPane.add(txt6);

        txt7 = new JTextField();
        txt7.setForeground(new Color(0, 100, 0));
        txt7.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        txt7.setEditable(false);
        txt7.setColumns(10);
        txt7.setBounds(167, 194, 162, 20);
        contentPane.add(txt7);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        dateChooser.setBounds(167, 234, 172, 29);
        contentPane.add(dateChooser);

        b2 = new JButton("Return");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        b2.setBounds(369, 179, 149, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        contentPane.add(b2);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        b3.setBounds(369, 231, 149, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2, true), "Return-Panel",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(10, 24, 569, 269);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from issueBook where student_id = ? and book_id =?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, txt2.getText());
                st.setString(2, txt1.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    txt3.setText(rs.getString("bname"));
                    txt4.setText(rs.getString("sname"));
                    txt5.setText(rs.getString("course"));
                    txt6.setText(rs.getString("branch"));
                    txt7.setText(rs.getString("dateOfIssue"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, txt1.getText());
                st.setString(2, txt2.getText());
                st.setString(3, txt3.getText());
                st.setString(4, txt4.getText());
                st.setString(5, txt5.getText());
                st.setString(6, txt6.getText());
                st.setString(7, txt7.getText());

                st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                int i = st.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Processing..");
                    delete();
                } else
                    JOptionPane.showMessageDialog(null, "error");

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new Home().setVisible(true);

            }
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new ReturnBook().setVisible(true);
    }
}
