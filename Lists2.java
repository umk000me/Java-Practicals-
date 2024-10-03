import java.awt.*;
public class Lists2 {
    public static void main(String[] args) {
        Frame f = new Frame("AppletViewer");
    List l1 = new List(3);
     l1.add("Nashik");
     l1.add("Nandurbar");
     l1.add("Hingoli");
     l1.add("Bhandara");
     l1.add("Dhule");
     l1.add("Mumbai");
     l1.add("Delhi");
     l1.add("Pune");
     l1.add("Vardha");
     l1.add("Chhatrapati Sambhaji Nagar");
     
     f.add(l1);
     l1.setBounds(50,50,200,100);
     f.setSize(300,300);
     f.setLayout(null);
     f.setVisible(true);
    }
    
    
}
