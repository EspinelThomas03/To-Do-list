package co.edu.uptc.view.subPanels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import co.edu.uptc.view.constans.ConstanFonts;
import co.edu.uptc.view.constans.ConstanSize;
import co.edu.uptc.view.constans.ConstantsColors;
import co.edu.uptc.view.panels.LeftPanel;

public class InferiorSubPanel extends JPanel{

    private final int HEIGTH_CONPONENT = 40;
    MatteBorder jBorder = new MatteBorder(0, 2, 2, 0, Color.BLACK);

    public InferiorSubPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 10));
        setPreferredSize(new Dimension(LeftPanel.WIDTH,250));
        setBackground(Color.WHITE);
        setBorder(jBorder);
        initComponents();
    }

    private void initComponents(){
        addSetingsButton();
        addExitButton();
    }

    private void addSetingsButton(){
        try {
            BufferedImage iconSetings = ImageIO.read(new File("src\\resources\\SetingsIcon.png"));
            Image scaledImg = iconSetings.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalSetings = new ImageIcon(scaledImg);

            JButton buttonSetings = new JButton("Importantes");
            buttonSetings.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonSetings.setBackground(this.getBackground());
            buttonSetings.setForeground(ConstantsColors.colorForeground);
            buttonSetings.setBorderPainted(false);
            buttonSetings.setFocusPainted(false);
            buttonSetings.setIcon(iconFinalSetings);
            buttonSetings.setHorizontalAlignment(SwingConstants.LEFT);
            buttonSetings.setPreferredSize(new Dimension(250, HEIGTH_CONPONENT));
            ActionListener listener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if(source instanceof Component){
                        ((Component)source).setBackground(ConstantsColors.colorBackgroungChanged);
                    }
                }
                
            };
            buttonSetings.addActionListener(listener);
            add(buttonSetings);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void addExitButton(){
        try {
            BufferedImage iconExit = ImageIO.read(new File("src\\resources\\ExitIcon.png"));
            Image scaledImg = iconExit.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalExit = new ImageIcon(scaledImg);

            JButton buttonExit = new JButton("Importantes");
            buttonExit.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonExit.setBackground(this.getBackground());
            buttonExit.setForeground(ConstantsColors.colorForeground);
            buttonExit.setBorderPainted(false);
            buttonExit.setFocusPainted(false);
            buttonExit.setIcon(iconFinalExit);
            buttonExit.setHorizontalAlignment(SwingConstants.LEFT);
            buttonExit.setPreferredSize(new Dimension(250, HEIGTH_CONPONENT));
            ActionListener listener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if(source instanceof Component){
                        ((Component)source).setBackground(ConstantsColors.colorBackgroungChanged);
                    }
                }
                
            };
            buttonExit.addActionListener(listener);
            add(buttonExit);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
