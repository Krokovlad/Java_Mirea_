package Prac4;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

class Threading extends JFrame {

    private JPanel contentPane;
    private JTextField DisplayOne;
    private JTextField DisplayTwo;
    private JTextField DisplayThree;

    int count;
    int count1;
    int count2;
    JTextField a;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Threading frame = new Threading();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    public Threading()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);

        DisplayOne = new JTextField();
        panel.add(DisplayOne);
        DisplayOne.setColumns(10);

        DisplayTwo = new JTextField();
        panel.add(DisplayTwo);
        DisplayTwo.setColumns(10);

        DisplayThree = new JTextField();
        panel.add(DisplayThree);
        DisplayThree.setColumns(20);

        JButton btnCountOne = new JButton("AC Milan");
        count1=1;
        btnCountOne.addActionListener(arg0 -> {
            DisplayOne.setText(Integer.toString(count1++));
            DisplayThree.setText("Last Scorer: AC Milan");
        });
        panel.add(btnCountOne);
        JButton btnCountTwo = new JButton("Real Madrid");
        count2=1;
        btnCountTwo.addActionListener(arg0 -> {
            DisplayTwo.setText(Integer.toString(count2++));
            DisplayThree.setText("Last Scorer: Real Madrid");
        });
        panel.add(btnCountTwo);

        JButton btnCountBoth = new JButton("Result match");
        btnCountBoth.addActionListener(arg0 -> {
            if(count1 > count2){
                JFrame Winner = new JFrame(" ");
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Winner is: AC Milan", "Победтель", JOptionPane.PLAIN_MESSAGE);
                Winner.setSize(800, 600);
                Winner.setVisible(true);
            }
            if(count1 < count2) {
                JFrame Winner = new JFrame(" ");
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Winner is: Real Madrid", "Победитель", JOptionPane.PLAIN_MESSAGE);
                Winner.setSize(800, 600);
                Winner.setVisible(true);
            }
            if(count1 == count2){
                JFrame Winner = new JFrame(" ");
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Ничья", "Победтель", JOptionPane.PLAIN_MESSAGE);
                Winner.setSize(800, 600);
                Winner.setVisible(true);
            }
        });
        panel.add(btnCountBoth);
    }
}
