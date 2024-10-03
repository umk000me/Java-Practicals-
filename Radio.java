import java.awt.*;

public class Radio {
    public static void main(String[] args) {
        Frame f = new Frame();
        CheckboxGroup c = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male" ,c,false);
        Checkbox c2 = new Checkbox("Female",c,false);
        Checkbox c3 = new Checkbox("SYCO",c,false);
        Checkbox c4 = new Checkbox("TYCO",c,false);

        
        c1.setBounds(50, 100, 100, 30);
        c2.setBounds(50, 150, 100, 30);
        c3.setBounds(50, 200, 100, 30);
        c4.setBounds(50, 250, 100, 30);
       
        
       
       
       
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.setVisible(true);
        f.setSize(200, 400);
       
    }
}
