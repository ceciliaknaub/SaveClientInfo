
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ceciliaknaub
 */
public class MainPanel extends JPanel implements ActionListener{
    JTextField fName;
    JTextField lName;
    JButton saveButton;
    JSlider ageSlider;
    JButton loadButton;
    JLabel outputLabel;
    Person a = new Person();
    MainPanel(){
        
        GridLayout grid = new GridLayout(4, 1);
        setLayout(grid);
        
        fName = new JTextField("First Name");
        add(fName);
        lName = new JTextField("Last Name");
        add(lName);
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        add(saveButton);
        
        loadButton = new JButton("Load");
        loadButton.addActionListener(this);
        add(loadButton);
        
        outputLabel = new JLabel();
        add(outputLabel);
        
        ageSlider = new JSlider(JSlider.HORIZONTAL,0, 100, 10);
        ageSlider.setMajorTickSpacing(20);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);
        add(ageSlider);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton eventSource = (JButton)e.getSource();
        if (eventSource == saveButton){
            a.setFName(fName.getText());
            a.setLName(lName.getText());
            a.setAge(ageSlider.getValue());
        }
        if (eventSource == loadButton){
            outputLabel.setText(a.fName + " " + a.lName + " "
            + a.age);
        }
    }
    
}
