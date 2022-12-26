import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    // STATE VARIABLES
    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    // THIS IS A CONSTRUCTOR
    public GUI(){

        this.frame =  new JFrame();

        JButton button = new JButton("Click Me!");
        button.addActionListener(this);

        this.label = new JLabel("Number of clicks: 0");

        this.panel = new JPanel();
        this.panel.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));
        this.panel.setLayout(new GridLayout(0, 1));
        this.panel.add(button);
        this.panel.add(label);

        this.frame.add(panel, BorderLayout.CENTER);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("Sarven's GUI");
        this.frame.pack();
        this.frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        this.count++;
        this.label.setText("Number of clicks: " + count);

    }
}
