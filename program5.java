/*
Develop the Application to simulate COLLEGE ADMISSION System.
Design the forms(using swing) for:

1.Student registration form(Student name,Username,password,Admission Year).
2.Student Admission form(Personal Details,academics details).
3.Student admission list.
4.Course wise admission list.
store the record in files.
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
class program5
{
    public static void main(String args[])
    {
        Menu mobj=new Menu();
    }
}
class Menu
{
    JFrame frame;
    JLabel lobj,lobj1,lobj2,lobj3,lobj4;
    JTextField tobj,tobj1,tobj2;
    JPasswordField pobj;
    JButton bobj;

    public Menu()
    {
        frame=new JFrame();
        frame.setTitle("Registration Form");
        frame.setSize(700,500); 
         
        lobj=new JLabel("Student Registration Form");
        lobj.setBounds(220,50,500,40);
        lobj.setForeground(Color.BLACK);
        lobj.setFont(new Font("Serif", Font.BOLD, 30));


        lobj1=new JLabel("Student Name : ");
        lobj1.setBounds(50,100,200,50);
        tobj=new JTextField();
        tobj.setToolTipText("Enter Student Name");
        tobj.setBounds(150,115,300,25);


        lobj2=new JLabel("Username : ");
        lobj2.setBounds(50,150,200,50);
        tobj1=new JTextField();
        tobj1.setToolTipText("Enter Username");
        tobj1.setBounds(150,165,300,25);

        lobj3=new JLabel("Password : ");
        lobj3.setBounds(50,200,200,50);
        pobj=new JPasswordField();
        pobj.setToolTipText("Enter Password");
        pobj.setBounds(150,215,300,25);

        lobj4=new JLabel("Addmission Year : ");
        lobj4.setBounds(50,250,200,50);
        tobj2=new JTextField();
        tobj2.setToolTipText("Enter Addmission Year");
        tobj2.setBounds(158,265,300,25);

        bobj=new JButton("Submit");
        bobj.setBounds(50,315,70,30);
        bobj.setForeground(Color.BLACK);
        bobj.setFont(new Font("Serif", Font.BOLD, 12));


        
        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                 String str=tobj.getText();
                 FileWriter fw = new FileWriter("data.txt",true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 bw.write("Student name is :"+str);
                 bw.newLine();

                 String str1=tobj1.getText();
                 bw.write("Username :"+str1);
                 bw.newLine();

                 char ch[]=pobj.getPassword();
                 String str2=new String(ch);
                 bw.write("Password :"+str2);
                 bw.newLine();

                 String str3=tobj2.getText();
                 bw.write("Addmission Year :"+str3);
                 bw.newLine();
                 bw.close();
                }
                catch(Exception obj)
                {
                    System.out.println(e);
                }
                frame.dispose();
                Student sobj = new Student();
            }
        });
        frame.add(bobj);
        frame.add(lobj4);
        frame.add(tobj2);
        frame.add(lobj3);
        frame.add(pobj);
        frame.add(lobj2);
        frame.add(tobj1);
        frame.add(tobj);
        frame.add(lobj1);
        frame.add(lobj);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
class Student
{
    JFrame frame;
    JLabel lobj,lobj1,lobj2,lobj3,lobj4,lobj5,lobj6,lobj7,lobj8,lobj9,lobj10,lobj11,lobj12;
    JTextField tobj,tobj1,tobj2,tobj3,tobj4,tobj5,tobj6,tobj7,tobj8,tobj9,tobj10,tobj11;
    JRadioButton robj,robj1,robj2;
    ButtonGroup bobj;
    final JComboBox cobj;
    JButton bt,bt1;

    public Student()
    {
        frame=new JFrame();
        frame.setTitle("Personal and Academics Details");
        frame.setSize(700,700); 

        lobj=new JLabel("Personal Details");
        lobj.setBounds(220,15,500,40);
        lobj.setForeground(Color.BLACK);
        lobj.setFont(new Font("Serif", Font.BOLD, 30));

        lobj1=new JLabel("Student Name : ");
        lobj1.setBounds(15,85,200,50);
        tobj=new JTextField();
        tobj.setToolTipText("Enter Student Name");
        tobj.setBounds(115,100,175,25);

        lobj2=new JLabel("Student Address : ");
        lobj2.setBounds(320,85,200,50);
        tobj1=new JTextField();
        tobj1.setToolTipText("Enter Student Address");
        tobj1.setBounds(435,100,230,25);

        lobj3=new JLabel("Student Address : ");
        lobj3.setBounds(320,85,200,50);
        tobj2=new JTextField();
        tobj2.setToolTipText("Enter Student Address");
        tobj2.setBounds(435,100,230,25);

        lobj4=new JLabel("Contact Number : ");
        lobj4.setBounds(15,135,200,50);
        tobj3=new JTextField();
        tobj3.setToolTipText("Enter Contact Number");
        tobj3.setBounds(120,150,175,25);
        
        lobj5=new JLabel("Email : ");
        lobj5.setBounds(320,135,200,50);
        tobj4=new JTextField();
        tobj4.setToolTipText("Enter Email Address");
        tobj4.setBounds(375,150,230,25);


        lobj6=new JLabel("Gender : ");
        lobj6.setBounds(15,195,100,25);
        robj=new JRadioButton(" Male");
        robj.setBounds(75,198,100,25);
        robj1=new JRadioButton(" Female");
        robj1.setBounds(75,219,100,25);
        robj2=new JRadioButton("Other");
        robj2.setBounds(75,240,100,25);
        bobj=new ButtonGroup();
        bobj.add(robj);
        bobj.add(robj1);
        bobj.add(robj2);


        lobj7=new JLabel("Academics Details");
        lobj7.setBounds(220,260,500,40);
        lobj7.setForeground(Color.BLACK);
        lobj7.setFont(new Font("Serif", Font.BOLD, 30));

        lobj8=new JLabel("Select Course : ");
        lobj8.setBounds(15,330,100,25);
        String course[]={" ","BSC(CS)","BSC(chem)","BSC(Microbiology","BSC(Botony)","BSC(Physics)","BSC(Electronics","BSC(Geology","BCA"};
        cobj=new JComboBox(course);
        cobj.setBounds(115,330,125,25);

        lobj9=new JLabel("10th Marks (%) : ");
        lobj9.setBounds(15,380,100,25);
        tobj8=new JTextField();
        tobj8.setBounds(115,380,80,25);

        lobj10=new JLabel("School Name : ");
        lobj10.setBounds(300,380,100,25);
        tobj9=new JTextField();
        tobj9.setBounds(390,380,280,25);

        lobj11=new JLabel("12th Marks (%) : ");
        lobj11.setBounds(15,425,100,25);
        tobj10=new JTextField();
        tobj10.setBounds(115,425,80,25);

        lobj12=new JLabel("College Name : ");
        lobj12.setBounds(300,425,100,25);
        tobj11=new JTextField();
        tobj11.setBounds(390,425,280,25);

        bt=new JButton("Submit");
        bt.setBounds(20,500,90,40);
        bt.setForeground(Color.BLACK);
        bt.setFont(new Font("Serif", Font.BOLD, 12));


        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent obj)
            {
                try
                {
                    String str=tobj.getText();
                    FileWriter fobj = new FileWriter("Demo.txt",true);
                    BufferedWriter bobj = new BufferedWriter(fobj);

                    String str1=tobj1.getText();

                    String str2=tobj3.getText();

                    String str3=tobj4.getText();

                    String str4="";
                    if(robj.isSelected())
                    {
                        str4=robj.getText();
                    }
                    else if(robj1.isSelected())
                    {
                        str4=robj1.getText();
                    }
                    else if(robj2.isSelected())
                    {
                        str4=robj1.getText();
                    }

                    String str5=(String)cobj.getItemAt(cobj.getSelectedIndex());

                    String str6=tobj8.getText();

                    String str7=tobj9.getText();

                    String str8=tobj10.getText();

                    String str9=tobj11.getText();

                    bobj.write(str+", "+str1+", "+str2+", "+str3+", "+str4+", "+str5+", "+str6+", "+str7+", "+str8+", "+str9);
                    bobj.newLine();
                    bobj.close();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });

        bt1=new JButton("Admission List");
        bt1.setBounds(150,500,120,40);
        bt1.setForeground(Color.BLACK);
        bt1.setFont(new Font("Serif", Font.BOLD, 12));

        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               AdmissionList lobj = new AdmissionList();
            }
        });

        frame.add(bt1);
        frame.add(bt);
        frame.add(lobj11);
        frame.add(tobj10);
        frame.add(lobj12);
        frame.add(tobj11);
        frame.add(lobj10);
        frame.add(tobj9);
        frame.add(tobj8);
        frame.add(lobj9);
        frame.add(lobj8);
        frame.add(cobj);
        frame.add(lobj7);
        frame.add(lobj6);
        frame.add(robj);
        frame.add(robj1);
        frame.add(robj2);
        frame.add(lobj4);
        frame.add(tobj3);
        frame.add(lobj5);
        frame.add(tobj4);
        frame.add(lobj2);
        frame.add(tobj1);
        frame.add(lobj1);
        frame.add(tobj);
        frame.add(lobj);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
class AdmissionList
{
    public JFrame f; 
    public JTable jobj;

    public AdmissionList()
    {     
        f=new JFrame("Admission List");                        
        try
        {
           File file=new File("Demo.txt");  
           FileReader fr=new FileReader(file);    
           BufferedReader br=new BufferedReader(fr);   
           StringBuffer sb=new StringBuffer();   
           String line;  

           DefaultTableModel model = new DefaultTableModel();
           jobj=new JTable(model);

           model.addColumn("Name");
           model.addColumn("Mobile No");
           model.addColumn("Gender");
           model.addColumn("Course");
  
           while((line=br.readLine())!=null)
           {
               String Arr[]=line.split(", ");
               String dataRow1[]=new String[4];

               dataRow1[0]=Arr[0];
               dataRow1[1]=Arr[2];
               dataRow1[2]=Arr[4];
               dataRow1[3]=Arr[5];

               model.addRow(dataRow1);
           }
           fr.close();  
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }

        JScrollPane sp=new JScrollPane(jobj);    
        f.add(sp);          
        
        f.setSize(700,700);    
        f.setVisible(true);
        f.setLayout(null);
    }
}