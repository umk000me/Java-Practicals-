import java.awt.*;

class SimpleForm {
    public static void main(String[] args) {

        Frame f = new Frame("GridBagLayout in Java Example");
        f.setSize(400, 300);
        f.setLayout(new GridBagLayout());  
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;  
        Label nameLabel = new Label("Name");
        gbc.gridx = 0;  
        gbc.gridy = 0;  
        gbc.weightx = 0.1;  
        gbc.weighty = 0.1;  
        gbc.anchor = GridBagConstraints.WEST; 
        f.add(nameLabel, gbc);

     
        TextField nameField = new TextField();
        gbc.gridx = 1;  
        gbc.gridy = 0; 
        gbc.weightx = 0.9;  
        gbc.gridwidth = 2;  
        f.add(nameField, gbc);

     
        Label commentsLabel = new Label("Comments");
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        gbc.weightx = 0.1;  
        gbc.weighty = 0.1;  
        gbc.gridwidth = 1;  
        f.add(commentsLabel, gbc);

     
        TextArea commentsArea = new TextArea();
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        gbc.gridheight = 2;  
        gbc.weightx = 0.9;  
        gbc.weighty = 0.7;  
        gbc.gridwidth = 2;  
        f.add(commentsArea, gbc);

       
        Button submitButton = new Button("Submit");
        gbc.gridx = 0;  
        gbc.gridy = 3;  
        gbc.gridwidth = 1;  
        gbc.gridheight = 1;  
        gbc.weightx = 0.1; 
        gbc.weighty = 0.1;  
        f.add(submitButton, gbc);

        f.setVisible(true);
    }
}
