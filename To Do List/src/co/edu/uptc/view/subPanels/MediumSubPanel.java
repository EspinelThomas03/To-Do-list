package co.edu.uptc.view.subPanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import co.edu.uptc.view.constans.ConstanFonts;
import co.edu.uptc.view.constans.ConstanSize;
import co.edu.uptc.view.panels.LeftPanel;

public class MediumSubPanel extends JPanel{

    public MediumSubPanel(){
        setLayout(null);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, 550));
        setBackground(Color.WHITE);
        intitComponents();
    }


    private void intitComponents(){
        addLineSeparator();
        addButtons();
        addButtonImportant();
        addButtonFinished();
    }

    private void addLineSeparator(){
        JPanel blackLine = new JPanel();
        blackLine.setBackground(Color.BLACK);
        blackLine.setPreferredSize(new Dimension(WIDTH, 2));
        add(blackLine, BorderLayout.SOUTH);
    }

    private void addButtons(){
        try {
            BufferedImage iconSun = ImageIO.read(new File("To Do List\\src\\resources\\SunIcon.png"));
            Image scaledImg = iconSun.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalSun = new ImageIcon(scaledImg);

            JButton buttonMyDay = new JButton("Mi dia");
            buttonMyDay.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonMyDay.setBackground(this.getBackground());
            buttonMyDay.setForeground(Color.LIGHT_GRAY);
            buttonMyDay.setBorderPainted(false);
            buttonMyDay.setFocusPainted(false);
            buttonMyDay.setIcon(iconFinalSun);
            // buttonMyDay.setHorizontalAlignment(SwingConstants.RIGHT);
            buttonMyDay.setBounds(0,0,WIDTH,50);
            buttonMyDay.setPreferredSize(new Dimension(WIDTH, 50));
            add(buttonMyDay);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void addButtonImportant(){
        try {
            BufferedImage iconSun = ImageIO.read(new File("To Do List\\src\\resources\\StarIcon.png"));
            Image scaledImg = iconSun.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalStar = new ImageIcon(scaledImg);

            JButton buttonImportants = new JButton("Importantes");
            buttonImportants.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonImportants.setBackground(this.getBackground());
            buttonImportants.setForeground(Color.LIGHT_GRAY);
            buttonImportants.setBorderPainted(false);
            buttonImportants.setFocusPainted(false);
            buttonImportants.setIcon(iconFinalStar);
            // buttonImportants.setHorizontalAlignment(SwingConstants.RIGHT);
            buttonImportants.setBounds(0,50,WIDTH,50);
            buttonImportants.setPreferredSize(new Dimension(WIDTH, 50));
            add(buttonImportants);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void addButtonFinished(){
        try {
            BufferedImage iconWork = ImageIO.read(new File("To Do List\\src\\resources\\WorksIcon.png"));
            Image scaledImg = iconWork.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalStar = new ImageIcon(scaledImg);

            JButton buttonWorksReady = new JButton("Terminadas");
            buttonWorksReady.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonWorksReady.setBackground(this.getBackground());
            buttonWorksReady.setForeground(Color.LIGHT_GRAY);
            buttonWorksReady.setBorderPainted(false);
            buttonWorksReady.setFocusPainted(false);
            buttonWorksReady.setIcon(iconFinalStar);
            // buttonImportants.setHorizontalAlignment(SwingConstants.RIGHT);
            buttonWorksReady.setBounds(0,100,WIDTH,50);
            buttonWorksReady.setPreferredSize(new Dimension(WIDTH, 50));
            add(buttonWorksReady);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
