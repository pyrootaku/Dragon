/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragons;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sean
 */
public class Bards extends JFrame implements ActionListener
{

    JFrame bard = new JFrame("Bards");
    Rolls roll = new Rolls();
    JTextField rolls = new JTextField("Roll Dice");

    public Bards()
    {
        JButton d4 = new JButton("Roll D4");
        JButton d6 = new JButton("Roll D6");
        JButton d8 = new JButton("Roll D8");
        JButton d10 = new JButton("Roll D10");
        JButton d12 = new JButton("Roll D12");
        JButton d20 = new JButton("Roll D20");
        bard.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("d20.png")));
        bard.setContentPane(new JLabel(new ImageIcon(getClass().getResource("bar.jpg"))));
        Font f = new Font("Times New Roman", Font.BOLD, 14);
        rolls.setFont(f);
        rolls.setEditable(false);
        
        
        rolls.setBounds(25, 25, 200, 50);
        d4.setBounds(25, 100, 75, 20);
        d6.setBounds(25, 125, 75, 20);
        d8.setBounds(25, 150, 75, 20);
        d10.setBounds(25, 175, 90, 20);
        d12.setBounds(25, 200, 90, 20);
        d20.setBounds(25, 225, 90, 20);

        d4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d4();
                rolls.setText("You rolled " + roll.d4());
            }
        });

        d6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d6();
                rolls.setText("You rolled " + roll.d6());
            }
        });

        d8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d8();
                rolls.setText("You rolled " + roll.d8());
            }
        });

        d10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d10();
                rolls.setText("You rolled " + roll.d10());
            }
        });

        d12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d12();
                rolls.setText("You rolled " + roll.d12());
            }
        });

        d20.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d20();
                rolls.setText("You rolled " + roll.d20());
            }
        });
        bard.add(d4);
        bard.add(d6);
        bard.add(d8);
        bard.add(d10);
        bard.add(d12);
        bard.add(d20);
        bard.add(rolls);
        bard.setLayout(null);
        bard.setSize(1000, 1000);
        bard.setVisible(false);
        bard.pack();
        bard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
