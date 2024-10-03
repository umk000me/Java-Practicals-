import java.awt.*;

class GridBagLayoutEX {
    public static void main(String[] args) {
       
        Frame f = new Frame("GridBag Layout Example");
        f.setSize(400, 400);
        f.setLayout(new GridBagLayout()); 
        
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; 
        

        Button btn1 = new Button("Button One");
        gbc.gridx = 0;  
        gbc.gridy = 0; 
        f.add(btn1, gbc);  
        
       
        Button btn2 = new Button("Button Two");
        gbc.gridx = 1;  
        gbc.gridy = 0;  
        f.add(btn2, gbc);  

        Button btn3 = new Button("Button Three");
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        f.add(btn3, gbc);  

        Button btn4 = new Button("Button Four");
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        f.add(btn4, gbc);  
        
        Button btn5 = new Button("Button Five");
        gbc.gridx = 0;  
        gbc.gridy = 2;  
        gbc.gridwidth = 2;  
        f.add(btn5, gbc);  
        
        f.setVisible(true);
    }
}
