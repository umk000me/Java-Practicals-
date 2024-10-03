import java.awt.*;

class Pr3a{

	public static void main(String[] args){
		
	Frame f= new Frame("Grid of 5*5");
	f.setVisible(true);
	f.setSize(550,550);
	f.setLayout(new GridLayout(5,5));

	for(int i=1; i<=25; i++){
	f.add(new Button("Button "+i));
	}

}

}