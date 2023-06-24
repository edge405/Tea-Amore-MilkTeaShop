/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package milkteashop;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class MilkTeaShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        JFrame frame = new JFrame("Radio Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        // Create a ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        radioButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (radioButton1.isSelected()) {
                    radioButton1.setSelected(false);
                    buttonGroup.clearSelection();
                } else {
                    radioButton1.setSelected(true);
                }
            }
        });

        radioButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (radioButton2.isSelected()) {
                    radioButton2.setSelected(false);
                    buttonGroup.clearSelection();
                } else {
                    radioButton2.setSelected(true);
                }
            }
        });

        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
