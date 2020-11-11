import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame{
    private JButton myButton;
    private JTextArea myTextArea;
    private JPanel rootPanel;

    public MyGUIForm(){
        //This uses the form designer form
        add(rootPanel);

        setTitle("This is my title");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "I'm a squikz");
            }
        });
    }
}
