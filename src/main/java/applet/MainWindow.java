package applet;

import javax.swing.JFrame;


public class MainWindow {
	
	private static JFrame frame;
	
    public static JFrame getFrame() {
		return frame;
	}

	public static void main(String[] args) {
    	
    	frame = new JFrame();
    	
        Form form = new Form();
        
        frame.add(form);
        
        frame.setVisible(true);
    }
}
