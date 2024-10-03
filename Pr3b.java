
import java.awt.*;

class Pr3b{

	public static void main(String[] args){
		
	Frame f= new Frame("GridLayout Demo");
	f.setVisible(true);
	f.setSize(700,700);
	f.setLayout(new GridLayout(3,2,20,20));

	for(int i=1; i<=5; i++){
	f.add(new Button (" Button "+i));
    
	}

}

}