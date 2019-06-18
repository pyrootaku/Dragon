/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragons;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Sean
 */
import java.awt.event.ActionListener;

public class Barbarians extends JFrame implements ActionListener
{

    JFrame bar = new JFrame("Barbarian Dice Roller");
    Rolls roll = new Rolls();
    Rolls x2 = new Rolls();
    JTextField rolls = new JTextField("Roll Dice");
    JOptionPane hit, fail;
    JDialog hits, fails;
    JLabel blud, slash, pirc, dice, sim, mart;

    public Barbarians()
    {
        //adding buttons for dice and weapons
        JButton d4 = new JButton("Roll D4");
        JButton d6 = new JButton("Roll D6");
        JButton d8 = new JButton("Roll D8");
        JButton d10 = new JButton("Roll D10");
        JButton d12 = new JButton("Roll D12");
        JButton d20 = new JButton("Roll D20");
        JButton dub = new JButton("Double Test");
        JButton club = new JButton("Club");
        JButton lham = new JButton("Light Hammer");
        JButton mace = new JButton("Mace");
        JButton dag = new JButton("Dagger");
        bar.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("d20.png")));
        bar.setContentPane(new JLabel(new ImageIcon(getClass().getResource("barb2.jpg"))));
        Font f = new Font("Times New Roman", Font.BOLD, 14);
        rolls.setFont(f);
        rolls.setEditable(false);
        fail = new JOptionPane("Would you like to roll for Critical Fail?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        hit = new JOptionPane("Would you like to roll for Critical Hit", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        hits = new JDialog(bar);
        dice = new JLabel();
        blud = new JLabel();
        slash = new JLabel();
        pirc = new JLabel();
        sim = new JLabel();
        mart = new JLabel();

        Font r = new Font("Times New Roman", Font.BOLD, 16);

        dice.setText("Dice");
        dice.setBounds(25, 75, 75, 20);
        dice.setForeground(Color.WHITE);
        dice.setFont(r);

        blud.setText("Blugeoning");
        blud.setBounds(25, 275, 75, 20);
        blud.setForeground(Color.WHITE);
        blud.setFont(r);

        slash.setText("Slashing");
        slash.setBounds(175, 275, 75, 20);
        slash.setForeground(Color.WHITE);
        slash.setFont(r);

        sim.setText("Simple Hand Weapons");
        sim.setBounds(150, 250, 200, 20);
        sim.setForeground(Color.WHITE);
        sim.setFont(r);

//        mart.setText("Martial Hand Weapons");
//        mart.setBounds(100, 275, 75, 20);
//        mart.setForeground(Color.WHITE);
//        mart.setFont(r);
        //setting boundries for dice
        d4.setBounds(25, 100, 75, 20);
        d6.setBounds(25, 125, 75, 20);
        d8.setBounds(25, 150, 75, 20);
        d10.setBounds(25, 175, 90, 20);
        d12.setBounds(25, 200, 90, 20);
        d20.setBounds(25, 225, 90, 20);

        club.setBounds(25, 300, 75, 20);
        lham.setBounds(25, 325, 120, 20);
        mace.setBounds(25, 350, 75, 20);
        dag.setBounds(175, 300, 75, 20);

        rolls.setBounds(25, 25, 200, 50);

        //setting button actions for individual dice rolling and weapon attacks
        d4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d4();
                rolls.setText("You Rolled " + roll.d4());
            }

        });
        d6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d6();
                rolls.setText("You Rolled " + roll.d6());
            }

        });
        d8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d8();
                rolls.setText("You Rolled " + roll.d8());
            }

        });
        d10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d10();
                rolls.setText("You Rolled " + roll.d10());
            }

        });

        d12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d12();
                rolls.setText("You Rolled " + roll.d12());
            }

        });
        d20.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d20();
                rolls.setText("You Rolled " + roll.d20());

            }

        });

        club.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                roll.d4();
                rolls.setText("You hit for " + roll.d4() + " bludgeoning");
            }
        });

        lham.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d4();
                rolls.setText("You hit for " + roll.d4() + " bludgeoning");
            }
        });

        mace.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d6();
                rolls.setText("You hit for " + roll.d6() + " bludgeoning");
            }
        });

        dag.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                roll.d4();
                rolls.setText("You hit for " + roll.d4() + " slashing");
            }
        });

        bar.add(rolls);
        bar.add(d4);
        bar.add(dub);
        bar.add(d6);
        bar.add(d8);
        bar.add(d10);
        bar.add(d12);
        bar.add(d20);
        bar.add(club);
        bar.add(lham);
        bar.add(mace);
        bar.add(dag);
        bar.add(dice);
        bar.add(blud);
        bar.add(pirc);
        bar.add(slash);
        bar.add(sim);
        bar.add(mart);
        bar.setLayout(null);
        bar.setSize(1000, 1000);
        bar.setVisible(false);
        bar.pack();
        bar.setResizable(false);
        bar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
