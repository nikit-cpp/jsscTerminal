package applet;

import javax.swing.JFrame;


public class MainWindow {
	
    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame();
    	
        Form form = new Form();
        
        frame.add(form);
        
        frame.setVisible(true);
    }
}
