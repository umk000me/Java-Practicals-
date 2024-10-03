import java.awt.*;
public class Check {
    public static void main(String[] args) {
        Frame f=new Frame("Checkbox and Radio button");
        Label l= new Label("Select Gender");
        Checkbox c1= new Checkbox("Male ");
        Checkbox c2= new Checkbox("Female  ");
         Label l2 =new Label("Select Class");
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox c3=new Checkbox("FYCO",cg,false );
        Checkbox c4=new Checkbox("SYCO",cg,false );
        Checkbox c5=new Checkbox("TYCO",cg,false );
        f.add(l);
        f.add(c1);
        f.add(c2);
        f.add(l2);
        f.add(c3);
        f.add(c4);
        f.add(c5);
        l.setBounds(50,50,100,70);
        c1.setBounds(50, 100, 100, 60);
        c2.setBounds(50, 150, 100, 60);
        l2.setBounds(50,200,200,70);
        c3.setBounds(50, 250, 100, 60);
        c4.setBounds(50, 300, 100, 60);
        c5.setBounds(50, 350, 100, 60);
        f.setVisible(true);
        f.setSize(600,800);
        
        
        
    }
}
