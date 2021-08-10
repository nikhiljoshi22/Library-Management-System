import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame implements ActionListener {

    JLabel lbl1;
    JButton b1;

    public Index() {
        super("Library Management System");
        setSize(900,500);
        setLayout(null);
        setLocation(300,300);

        lbl1 = new JLabel("");
        b1 = new JButton("NEXT");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 25));

        b1.setBackground(new Color(33,245,209));
        b1.setForeground(Color.BLACK);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/LibraryBackground.png"));
        Image i3 = i1.getImage().getScaledInstance(900, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        lbl1 = new JLabel(i2);

        b1.setBounds(300,200,200,60);
        lbl1.setBounds(0, 0, 900, 500);

        lbl1.add(b1);
        add(lbl1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        Index window = new Index();
        window.setVisible(true);
    }
}
