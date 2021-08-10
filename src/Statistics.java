import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Statistics extends JFrame {

    private JPanel contentPane;
    private JTable table1, table2;
    JLabel lbl1;


    public void issueBook() {
        try {
            conn con =  new conn();
            String sql = "select * from issueBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void returnBook() {
        try {
            conn con = new conn();
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public Statistics () {
        super("Statistics");
        setBounds(400, 200, 810, 594);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(33,245,209));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(40, 51, 708, 217);
        contentPane.add(scrollPane);

        table1 = new JTable();
        table1.setBackground(new Color(224, 255, 255));
        table1.setForeground(new Color(128, 128, 0));
        table1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        scrollPane.setViewportView(table1);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book-Details",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
        panel.setForeground(new Color(0, 128, 128));
        panel.setBounds(26, 36, 737, 240);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        lbl1 = new JLabel("Back");
        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                setVisible(false);
                Home home = new Home();
                home.setVisible(true);
            }
        });
        lbl1.setForeground(new Color(204, 0, 102));
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        lbl1.setIcon(i3);
        lbl1.setBounds(690, 13, 96, 27);
        contentPane.add(lbl1);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(40, 316, 717, 217);
        contentPane.add(scrollPane_1);

        table2 = new JTable();
        table2.setBackground(new Color(204, 255, 255));
        table2.setForeground(new Color(153, 51, 0));
        table2.setFont(new Font("Sitka Small", Font.BOLD, 12));
        scrollPane_1.setViewportView(table2);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 204, 153), 2, true), "Return-Book-Details",
                TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 102, 51)));
        panel_1.setBounds(22, 299, 741, 240);
        panel_1.setBackground(Color.WHITE);
        contentPane.add(panel_1);

        issueBook();
        returnBook();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Statistics().setVisible(true);
    }

}
