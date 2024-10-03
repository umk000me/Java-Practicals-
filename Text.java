import java.awt.*;

public class Text {
    public static void main(String[] args) {
        Frame f = new Frame("Text Field, TextArea, Label");
        
       
        Label l = new Label("Enter your name: ");
        TextField t = new TextField();
        Label l2 = new Label("Enter Your Address:");
        TextArea t2 = new TextArea();
        Button b=new Button("Submit");
        
        f.add(l);
        f.add(t);
        f.add(l2);
        f.add(t2);
        f.add(b);
        
      
        l.setBounds(50, 50, 150, 40);
        t.setBounds(50, 100, 350, 20);
        l2.setBounds(50, 150, 150, 40);
        t2.setBounds(50, 200, 350, 100);
        b.setBounds(50, 350, 100, 20);
      
        f.setSize(500, 500);  
        f.setLayout(null);
        f.setVisible(true);
    }
}
