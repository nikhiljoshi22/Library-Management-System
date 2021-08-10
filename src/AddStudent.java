import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class AddStudent extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txt1, txt2, txt3;
    private JComboBox CB1, CB2, CB3, CB4;
    JButton b1, b2;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;

    public void random() {
        Random rd = new Random();
        txt1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddStudent() {
        super("Add Students");
        setBounds(700, 200, 550, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lbl1 = new JLabel("Student ID : ");
        lbl1.setForeground(new Color(25, 25, 112));
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl1.setBounds(64, 63, 102, 22);
        contentPane.add(lbl1);

        lbl2 = new JLabel("Name : ");
        lbl2.setForeground(new Color(25, 25, 112));
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl2.setBounds(64, 97, 102, 22);
        contentPane.add(lbl2);

        lbl3 = new JLabel("Father's Name: ");
        lbl3.setForeground(new Color(25, 25, 112));
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl3.setBounds(64, 130, 112, 22);
        contentPane.add(lbl3);

        lbl4 = new JLabel("Branch : ");
        lbl4.setForeground(new Color(25, 25, 112));
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl4.setBounds(64, 209, 102, 22);
        contentPane.add(lbl4);

        lbl5 = new JLabel("Year : ");
        lbl5.setForeground(new Color(25, 25, 112));
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl5.setBounds(64, 242, 102, 22);
        contentPane.add(lbl5);

        lbl6 = new JLabel("Semester : ");
        lbl6.setForeground(new Color(25, 25, 112));
        lbl6.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl6.setBounds(64, 275, 102, 22);
        contentPane.add(lbl6);

        txt1 = new JTextField();
        txt1.setEditable(false);
        txt1.setForeground(new Color(47, 79, 79));
        txt1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt1.setBounds(174, 66, 156, 20);
        contentPane.add(txt1);
        txt1.setColumns(10);

        txt2 = new JTextField();
        txt2.setForeground(new Color(47, 79, 79));
        txt2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt2.setBounds(174, 100, 156, 20);
        contentPane.add(txt2);
        txt2.setColumns(10);

        txt3 = new JTextField();
        txt3.setForeground(new Color(47, 79, 79));
        txt3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        txt3.setBounds(174, 133, 156, 20);
        contentPane.add(txt3);
        txt3.setColumns(10);

        CB1 = new JComboBox();
        CB1.setModel(new DefaultComboBoxModel(new String[] { "ETRX", "EXTC", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
        CB1.setForeground(new Color(47, 79, 79));
        CB1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        CB1.setBounds(176, 211, 154, 20);
        contentPane.add(CB1);

        CB2 = new JComboBox();
        CB2.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
        CB2.setForeground(new Color(47, 79, 79));
        CB2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        CB2.setBounds(176, 244, 154, 20);
        contentPane.add(CB2);

        CB3 = new JComboBox();
        CB3.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        CB3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        CB3.setForeground(new Color(47, 79, 79));
        CB3.setBounds(176, 277, 154, 20);
        contentPane.add(CB3);

        b1 = new JButton("ADD");
        b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        lbl7 = new JLabel("Course");
        lbl7.setForeground(new Color(25, 25, 112));
        lbl7.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lbl7.setBounds(64, 173, 102, 22);
        contentPane.add(lbl7);

        CB4 = new JComboBox();
        CB4.setModel(new DefaultComboBoxModel(new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
        CB4.setForeground(new Color(47, 79, 79));
        CB4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        CB4.setBounds(176, 176, 154, 20);
        contentPane.add(CB4);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 4, true),
                "Add-Student", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 358, 348);

        contentPane.setBackground(new Color(33,245,209));
        panel.setBackground(new Color(33,245,209));

        contentPane.add(panel);
        random();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }







    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            if(ae.getSource() == b1){
                try{
                    conn con = new conn();
                    String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, txt1.getText());
                    st.setString(2, txt2.getText());
                    st.setString(3, txt3.getText());
                    st.setString(4, (String) CB4.getSelectedItem());
                    st.setString(5, (String) CB1.getSelectedItem());
                    st.setString(6, (String) CB2.getSelectedItem());
                    st.setString(7, (String) CB3.getSelectedItem());

                    int i = st.executeUpdate();
                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        this.setVisible(false);
                        new Home().setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }

            if(ae.getSource() == b2){
                this.setVisible(false);
                new Home().setVisible(true);
            }
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }
}
