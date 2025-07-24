import javax.swing.*;
import java.awt.*;

public class JavaGUI extends JFrame
{
    public JavaGUI()
        {super("Restaurant App");
        //JFrame
        setTitle("Hello World!");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        //Überschrift
        JLabel titelLabel = new JLabel("Pizza Menü",JLabel.CENTER);
        titelLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titelLabel.setBorder(BorderFactory.createEmptyBorder(10, 0,10,0));



       JPanel radioPanel = new JPanel();
       radioPanel.setLayout(new GridLayout(5,1,5,5));
       radioPanel.setBorder(BorderFactory.createTitledBorder("Wähle eine Option"));

        JRadioButton option1 = new JRadioButton("Pizza Margarita");
        JRadioButton option2 = new JRadioButton("Pizza Salami");
        JRadioButton option3 = new JRadioButton("Pizza Funghi");
        JRadioButton option4 = new JRadioButton("Kinderpizza");
        JRadioButton option5 = new JRadioButton("Pizza Calzone");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);
        buttonGroup.add(option4);
        buttonGroup.add(option5);

        radioPanel.add(option1);
        radioPanel.add(option2);
        radioPanel.add(option3);
        radioPanel.add(option4);
        radioPanel.add(option5);

        add(titelLabel, BorderLayout.NORTH);
        add(radioPanel, BorderLayout.CENTER);

        setVisible(true);




        }

}
