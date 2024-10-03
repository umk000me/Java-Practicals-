import java.awt.*;

public class Btn {
    public static void main(String[] args) {
       Frame f = new Frame("Button Example");
       Label l = new Label("Click any one Button ");
       Button b1 = new Button("OK ");
      
       Button b2 = new Button("RESET");
       Button b3 = new Button("CANCEL ");
       f.add(l);
       f.add(b1);
       f.add(b2);
       f.add(b3);
       l.setBounds(50,50,200,30);
       b1.setBounds(50,100,60,30);
       b2.setBounds(150,100,60,30);
       b3.setBounds(250,100,60,30);
f.setSize(400,400);
f.setLayout(null);
       f.setVisible(true);
    }
    
}
