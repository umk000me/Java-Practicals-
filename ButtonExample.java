import java.awt.*;
public class ButtonExample {
    public static void main(String[] args) {
        Frame f= new Frame("Button Example");
       
        Button b = new Button("Click here " );
        f.add(b);
        
        b.setBounds(50, 250, 100, 30); 
        f.setSize(500, 500);
        f.setLayout(null); 
        
       

     
        
        f.setVisible(true);
        
        
    }
    
}
