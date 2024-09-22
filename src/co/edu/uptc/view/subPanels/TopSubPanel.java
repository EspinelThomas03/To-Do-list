package co.edu.uptc.view.subPanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

import co.edu.uptc.view.constans.ConstanFonts;
import co.edu.uptc.view.constans.ConstanSize;
import co.edu.uptc.view.panels.LeftPanel;

public class TopSubPanel extends JPanel{

    MatteBorder jBorder = new MatteBorder(0, 2, 2, 0, Color.BLACK);
    public TopSubPanel(){
        setPreferredSize(new Dimension(LeftPanel.WIDTH, 120));
        setBackground(Color.WHITE);
        setBorder(jBorder);
        setLayout(new BorderLayout());
        intitComponents();

    }


    private void intitComponents(){
        addName();
    }
    private ImageIcon getprofilePhoto(){
        ImageIcon profileImage = new ImageIcon("src\\resources\\Profile_Photo.jpg");
        return profileImage;
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(getprofilePhoto().getImage(), 20, 15,90,90, null);
        UIManager.put("getprofilePhoto().getImage().arc", 100);
    }

    private void addName(){
        JLabel name = new JLabel();
        name.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
        name.setText("Thomas Espinel");
        add(name,BorderLayout.EAST);
    }
}
