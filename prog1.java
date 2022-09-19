/*
Design a screen "Number Converter" that will convert the number from binary to decimal,octal
and hexadecimal equivalents.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class prog1 
{
    public static void main(String args[])
    {
        Menu mobj = new Menu();
    }
}
class Menu
{
    JFrame frame;
    JTextField tobj;
    JButton bobj;
    JRadioButton robj,robj1,robj2;
    JLabel lobj,lobj1;

    public Menu()
    {
        frame=new JFrame();
        frame.setTitle("Number Converter");
        frame.setSize(650,300);

        tobj = new JTextField();
        tobj.setBounds(50, 40,150, 30);
        tobj.setToolTipText("Enter Number");

        bobj = new JButton("Show");
        bobj.setBounds(280, 40, 110,30);

        robj=new JRadioButton("Hexadecimal");
        robj.setBounds(50, 80, 100, 40);
        robj1=new JRadioButton("Decimal");
        robj1.setBounds(50, 110, 100, 40);
        robj2=new JRadioButton("Octal");
        robj2.setBounds(50, 140, 100, 40);

        lobj = new JLabel("Result = ");
        lobj.setForeground(Color.BLACK);
        lobj.setBounds(290, 190, 140, 100);
        lobj.setFont(new Font("Serif", Font.BOLD, 18));

        lobj1 = new JLabel();
        lobj1.setForeground(Color.BLACK);
        lobj1.setBounds(360, 190, 140, 100);
        lobj1.setFont(new Font("Serif", Font.BOLD, 18));

        bobj.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int iNo=0;
                String str=tobj.getText();
                
                if(robj.isSelected())
                {
                    iNo=Integer.parseInt(str,2);

                    lobj1.setText(Integer.toHexString(iNo));
                }
                else if(robj1.isSelected())
                {
                    iNo=Integer.parseInt(str,2);

                    lobj1.setText(Integer.toString(iNo));
                }
                else if(robj2.isSelected())
                {
                    iNo=Integer.parseInt(str,2);

                    lobj1.setText(Integer.toOctalString(iNo));
                }
            }
        });


        frame.add(tobj);
        frame.add(bobj);
        frame.add(robj);
        frame.add(robj1);
        frame.add(robj2);
        frame.add(lobj1);
        frame.add(lobj);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}