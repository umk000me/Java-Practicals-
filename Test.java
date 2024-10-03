import java.awt.*;
public class Test {
    
    public static void main(String[] args) {
        Frame f= new Frame("MY frame");
        Label l=new Label("Welcome to the Advanced java");
        Button b=new Button("click here");
        TextField t=new TextField("Simple awt program");
       
        f.add(l);
        f.add(b);
        f.add(t);
       
        f.setVisible(true);
        l.setBounds(100,150,200,70);
        b.setBounds(150,250,100,40);
        f.setSize(400,400);

    }
}
