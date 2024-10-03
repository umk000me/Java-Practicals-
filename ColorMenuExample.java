import java.awt.*;
import java.awt.event.*;

public class ColorMenuExample {
    public ColorMenuExample() {
        Frame frame = new Frame("Color Menu Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        MenuBar menuBar = new MenuBar();
        Menu colorMenu = new Menu("Colors");

        MenuItem redItem = new MenuItem("Red");
        MenuItem greenItem = new MenuItem("Green");
        MenuItem blueItem = new MenuItem("Blue");
        MenuItem blackItem = new MenuItem("Black");
        blackItem.setEnabled(false);

        redItem.addActionListener(e -> frame.setBackground(Color.RED));
        greenItem.addActionListener(e -> frame.setBackground(Color.GREEN));
        blueItem.addActionListener(e -> frame.setBackground(Color.BLUE));

        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        colorMenu.add(blackItem);

        menuBar.add(colorMenu);
        frame.setMenuBar(menuBar);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new ColorMenuExample();
    }
}

