import java.awt.*;
public class Newspaper {
    public static void main(String[] args) {
        Frame f = new Frame("Newspaper");
        
        List l1 = new List(3);
         l1.add("Times Of India");
         l1.add("Sakal ");
         l1.add("Lokmat");
         l1.add("Pudhari");
         l1.add("Mumbai Times");
         l1.add("Loksatta");
         l1.add("Today Times ");
         l1.add("Chaufer");
         l1.add("PunyaNagari");
         f.add(l1);
         l1.setBounds(50,50,200,100);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
    }
    
}
