package dragons;

/**
 *
 * @author Sean Cuny
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dragons extends JFrame implements ActionListener {

    JFrame sel = new JFrame("Choose Class");
    JLabel title = new JLabel();
    JButton barb, bard, cle, dru, fig, monk, pal, rang, rog, sorc, warl, wiz;
    Barbarians Barbarians = new Barbarians();
    Bards Bards = new Bards();
    Rolls rolls = new Rolls();

    public Dragons() {

        sel.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("d20.png")));
        sel.setContentPane(new JLabel(new ImageIcon(getClass().getResource("dragon.jpg"))));
        Font r = new Font("Times New Roman", Font.BOLD, 48);
        

        title.setText("Choose Your Class");
        title.setBounds(550, 350, 500, 200);
        title.setForeground(Color.BLUE);
        title.setFont(r);

        barb = new JButton();
        barb.setIcon(new ImageIcon(getClass().getResource("barb.jpg")));
        barb.setBounds(25, 25, 200, 300);
        bard = new JButton();
        bard.setIcon(new ImageIcon(getClass().getResource("bard.jpg")));
        bard.setBounds(230, 25, 200, 300);
        cle = new JButton();
        cle.setIcon(new ImageIcon(getClass().getResource("cleric.jpg")));
        cle.setBounds(475, 25, 200, 300);
        dru = new JButton();
        dru.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        dru.setBounds(700, 25, 200, 300);
        fig = new JButton();
        fig.setIcon(new ImageIcon(getClass().getResource("fighter.jpg")));
        fig.setBounds(875, 25, 200, 300);
        monk = new JButton();
        monk.setIcon(new ImageIcon(getClass().getResource("monk.jpg")));
        monk.setBounds(1050, 25, 200, 300);
        pal = new JButton();
        pal.setBounds(25, 25, 50, 50);
        pal.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        rang = new JButton();
        rang.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        rang.setBounds(25, 25, 50, 50);
        rog = new JButton();
        rog.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        rog.setBounds(25, 25, 50, 50);
        sorc = new JButton();
        sorc.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        sorc.setBounds(25, 25, 50, 50);
        warl = new JButton();
        warl.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        warl.setBounds(25, 25, 50, 50);
        wiz = new JButton();
        wiz.setIcon(new ImageIcon(getClass().getResource("Druid.jpg")));
        wiz.setBounds(25, 25, 50, 50);

        barb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                sel.dispose();
                Barbarians.bar.setVisible(true);

            }
        });

        bard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                sel.dispose();
                Bards.bard.setVisible(true);
            }
        });

//         cle.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });
//         
//          dru.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });
//          
//           fig.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });
//           
//            monk.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });           
//            
//            pal.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });           
//            
//            rang.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });     
//            
//            rog.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        }); 
//            
//            sorc.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });     
//            
//            warl.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });    
//            
//            wiz.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent ae)
//            {
//                sel.dispose();
//                Bards.bard.setVisible(true);
//            }
//        });
        sel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        sel.add(title);
        sel.add(barb);
        sel.add(bard);
        sel.add(cle);
        sel.add(dru);
        sel.add(fig);
        sel.add(monk);
//        sel.add(pal);
//        sel.add(rang);
//        sel.add(rog);
//        sel.add(sorc);
//        sel.add(warl);
//        sel.add(wiz);
        sel.setLayout(null);
        sel.setSize(1000, 1000);
        sel.setVisible(true);
        sel.pack();
        sel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Dragons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
