
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Runner extends JPanel implements Runnable{

    ArrayList<String> images;
    int state;
    boolean isRunning;
    Thread runThread;
    int delay;
    
    
    public Runner() {
        super();
        this.setOpaque(false);
        images = new ArrayList<>();
        state = 0;
        isRunning = false;
        delay = 10;
        
        String imagePath = this.getClass().getClassLoader().getResource("runner1").getFile();
        File file = new File(imagePath);
        File[] list = file.listFiles();
        for (File file1 : list) {
            images.add(file1.getAbsolutePath());
        }
        runThread = new Thread(this);
    }
    
    public void start(int delay){
        this.delay = delay;
        state = 0;
        isRunning = true;
        runThread.start();
    }
    public void nextState() {
        state = (state + 1) % images.size();
        setLocation(getLocation().x + 1, getLocation().y);
    }

    @Override
    protected void paintComponent(Graphics g) {

        try {
            super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
            BufferedImage image = ImageIO.read(new File(images.get(state)));
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        } catch (IOException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        while (isRunning) { 
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
            nextState();
        }
    }

}
