import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Window extends JFrame {

    private JLabel Heading;
    private JLabel ClockLabel;
    private Font font;
    Window(){
        super.setTitle("DIGITAL CLOCK");
        super.setSize(1000, 400);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
        this.createGUI();
        this.startclock();

    }
    public void createGUI(){

        // Background color
        getContentPane().setBackground(Color.BLACK);

        // Create GUI
         Heading = new JLabel("DIGITAL CLOCK");
         Heading.setForeground(Color.WHITE);
         Heading.setHorizontalAlignment(SwingConstants.CENTER);

         ClockLabel = new JLabel(" Clock");
        ClockLabel.setForeground(Color.gray);
        ClockLabel.setHorizontalAlignment(SwingConstants.CENTER);

         font = new Font("",Font.BOLD,70);

        Heading.setFont(font);
        ClockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(Heading);
        this.add(ClockLabel);
    }
    public void startclock(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String Datetime = new Date().toString();
                String Datetime = new Date().toLocaleString();
                ClockLabel.setText(Datetime);
            }
        });
        timer.start();
    }
}

