import javax.swing.*;
import java.awt.*;

public class aboutUs extends JFrame {

    private JPanel contentPane;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;

    public aboutUs () {
        super("About Us");
        setBackground(new Color(173, 216, 230));
        setBounds(500, 250, 700, 500);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(33,245,209));

        lbl1 = new JLabel("Library");
        lbl1.setForeground(Color.RED);
        lbl1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        lbl1.setBounds(160, 40, 150, 55);
        contentPane.add(lbl1);

        lbl2 = new JLabel("Management System");
        lbl2.setForeground(Color.RED);
        lbl2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        lbl2.setBounds(70, 90, 405, 40);
        contentPane.add(lbl2);

        lbl3 = new JLabel("Developed By : Nikhil Joshi");
        lbl3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        lbl3.setBounds(70, 198, 600, 35);
        contentPane.add(lbl3);

        lbl4 = new JLabel("Contact Me : joshinikhil314@gmail.com");
        lbl4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        lbl4.setBounds(70, 260, 600, 34);
        contentPane.add(lbl4);

        lbl5 = new JLabel("My LinkedIn account: https://www.linkedin.com/in/nik\n" +
                "hil-joshi-827b90201/\n");
        lbl5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        lbl5.setBounds(70, 290, 600, 34);
        contentPane.add(lbl5);

        lbl6 = new JLabel("My github account: https://github.com/nikhiljoshi22");
        lbl6.setFont(new Font("Trebuchet MS", Font.BOLD , 16));
        lbl6.setBounds(70, 320, 600, 34);
        contentPane.add(lbl6);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new aboutUs().setVisible(true);
    }
}
