package applet;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class MainWindow {
	
	private static JFrame frame;
	
    public static JFrame getFrame() {
		return frame;
	}

	public static void main(String[] args) {
		init();
    }
	
    public static void init() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    Form form = new Form();
                    frame = new JFrame();
                    frame.add(form);
                    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame.setSize(500, 500);
                    
                    frame.setVisible(true);
                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
