import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Loading extends JFrame implements Runnable {

    private JPanel contentPane;
    private JProgressBar progressBar;
    Connection conn;
    ImageIcon bookicon;
    int s;
    Thread th;
    JLabel lbl1, lbl2, lbl3;

    public void setUpLoading () {
        setVisible(false);
        th.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                s = s + 1;
                int m = progressBar.getMaximum();
                int v = progressBar.getValue();
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);
                } else {
                    i = 201;
                    setVisible(false);
                    new Home().setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Loading () {
        super("Loading");
        th = new Thread((Runnable) this);

        setBounds(600, 300, 600, 400);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        bookicon = new ImageIcon(this.getClass().getResource("icons/LoginBackground.jpg"));
        lbl3 = new JLabel(bookicon);
        lbl3.setSize(600, 400);
        contentPane.add(lbl3);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        progressBar.setStringPainted(true);
        progressBar.setBounds(0, 345, 600, 25);
        lbl3.add(progressBar);

        lbl2 = new JLabel("Please Wait.....");
        lbl2.setForeground(Color.GREEN);
        lbl2.setFont(new Font("u Gothic UI Semibold", Font.BOLD, 20));
        lbl2.setBounds(200, 300, 150, 20);
        lbl3.add(lbl2);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 590, 390);
        lbl3.add(panel);
        panel.setOpaque(false);

        setUpLoading();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Loading().setVisible(true);
    }
}
