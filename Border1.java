import java.awt.*;
 class Border1
{
public static void main(String [] args)
{
Frame f = new Frame("Border Layout");
f.setSize(200,200);

f.add("North",new Button("North"));
f.add("South",new Button("South"));
f.add("East",new Button("East"));
f.add("West",new Button("West"));
f.add("Center",new Button("Center"));


f.setVisible(true);
}
}