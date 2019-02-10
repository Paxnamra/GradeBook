import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUIPanel extends JFrame {
    
    private JFrame mainFrame = new JFrame("Grades Manager");
    private JButton btnAverage = new JButton("Average");
    private JButton btnGradeBookAverage = new JButton("Subjects' average");

    WindowListener l = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    };

    public GUIPanel() {
        initMainPanel();
    }

    private void initMainPanel() {
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.addWindowListener(l);
    }
}
