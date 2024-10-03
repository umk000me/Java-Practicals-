import java.awt.Frame;
import java.awt.Label;

public class Labelexample {
    public static void main(String[] args) {
       Frame f = new Frame("Label");
       Label l= new Label("Welcome to Java");
       f.add(l);
       f.setSize(300,300);
       f.setVisible(true);

    }
}
