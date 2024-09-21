package co.edu.uptc.view.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CenterPanel extends JPanel{
    
    public CenterPanel(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.MAGENTA);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dimension size = getSize();
        g.drawImage(getWallpaper().getImage(), 0, 0,size.width,size.height, null);
    }

    public ImageIcon getWallpaper(){
        ImageIcon image = new ImageIcon("src/resources/Wallpaper.jpg");
        return image;
    }
}
