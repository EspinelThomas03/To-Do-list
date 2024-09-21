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
public class MediumSubPanel extends JPanel{

    private final int HEIGTH_CONPONENT = 40;

    MatteBorder jBorder = new MatteBorder(0, 2, 2, 0, Color.BLACK);


    public MediumSubPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 10 )); /*Layout con gaps horizontales y verticales*/
        // setLayout(new FlowLayout());
        setPreferredSize(new Dimension(LeftPanel.WIDTH, 700));
        setBackground(Color.WHITE);
        setBorder(jBorder);
        intitComponents();
    }


    private void intitComponents(){
        addButtonMyDay();
        addButtonImportant();
        addButtonFinished();
        addButtonPlaned();
    }

    private void addButtonMyDay(){
        try {
            BufferedImage iconSun = ImageIO.read(new File("src\\resources\\SunIcon.png"));
            Image scaledImg = iconSun.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalSun = new ImageIcon(scaledImg);

            JButton buttonMyDay = new JButton("Mi dia");
            buttonMyDay.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonMyDay.setBackground(this.getBackground());
            buttonMyDay.setForeground(ConstantsColors.colorForeground);
            buttonMyDay.setBorderPainted(false);
            buttonMyDay.setFocusPainted(false);
            buttonMyDay.setIcon(iconFinalSun);
            buttonMyDay.setHorizontalAlignment(SwingConstants.LEFT);
            // buttonMyDay.setBounds(0,0,WIDTH,50);
            buttonMyDay.setPreferredSize(new Dimension(250, HEIGTH_CONPONENT));
            ActionListener listener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if(source instanceof Component){
                        ((Component)source).setBackground(ConstantsColors.colorBackgroungChanged);
                    }
                }
                
            };
            buttonMyDay.addActionListener(listener);
            add(buttonMyDay);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void addButtonImportant(){
        try {
            BufferedImage iconSun = ImageIO.read(new File("src\\resources\\StarIcon.png"));
            Image scaledImg = iconSun.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalStar = new ImageIcon(scaledImg);

            JButton buttonImportants = new JButton("Importantes");
            buttonImportants.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonImportants.setBackground(this.getBackground());
            buttonImportants.setForeground(ConstantsColors.colorForeground);
            buttonImportants.setBorderPainted(false);
            buttonImportants.setFocusPainted(false);
            buttonImportants.setIcon(iconFinalStar);
            buttonImportants.setHorizontalAlignment(SwingConstants.LEFT);
            // buttonImportants.setBounds(0,50,WIDTH,50);
            buttonImportants.setPreferredSize(new Dimension(250, HEIGTH_CONPONENT));
            ActionListener listener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if(source instanceof Component){
                        ((Component)source).setBackground(ConstantsColors.colorBackgroungChanged);
                    }
                }
                
            };
            buttonImportants.addActionListener(listener);
            add(buttonImportants);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void addButtonFinished(){
        try {
            BufferedImage iconWork = ImageIO.read(new File("src\\resources\\WorksIcon.png"));
            Image scaledImg = iconWork.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalStar = new ImageIcon(scaledImg);

            JButton buttonWorksReady = new JButton("Terminadas");
            buttonWorksReady.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonWorksReady.setBackground(this.getBackground());
            buttonWorksReady.setForeground(ConstantsColors.colorForeground);
            buttonWorksReady.setBorderPainted(false);
            buttonWorksReady.setFocusPainted(false);
            buttonWorksReady.setIcon(iconFinalStar);
            buttonWorksReady.setHorizontalAlignment(SwingConstants.LEFT);
            // buttonWorksReady.setBounds(0,100,WIDTH,50);
            buttonWorksReady.setPreferredSize(new Dimension(250, HEIGTH_CONPONENT));
            ActionListener listener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if(source instanceof Component){
                        ((Component)source).setBackground(ConstantsColors.colorBackgroungChanged);
                    }
                }
                
            };
            buttonWorksReady.addActionListener(listener);
            add(buttonWorksReady);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void addButtonPlaned(){
        try {
            BufferedImage iconCalendar = ImageIO.read(new File("src\\resources\\calendaryIcon.png"));
            Image scaledImg = iconCalendar.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon iconFinalCalendar = new ImageIcon(scaledImg);

            JButton buttonWorksCalendar = new JButton("Planeadas");
            buttonWorksCalendar.setFont(new Font(ConstanFonts.font, ALLBITS, ConstanSize.size));
            buttonWorksCalendar.setBackground(this.getBackground());
            buttonWorksCalendar.setForeground(ConstantsColors.colorForeground);
            buttonWorksCalendar.setBorderPainted(false);
            buttonWorksCalendar.setFocusPainted(false);
            buttonWorksCalendar.setIcon(iconFinalCalendar);
            buttonWorksCalendar.setHorizontalAlignment(SwingConstants.LEFT);
            // buttonWorksCalendar.setBounds(0,100,WIDTH,50);
            buttonWorksCalendar.setPreferredSize(new Dimension(250, HEIGTH_CONPONENT));
            ActionListener listener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Object source = e.getSource();
                    if(source instanceof Component){
                        ((Component)source).setBackground(ConstantsColors.colorBackgroungChanged);
                    }
                }
                
            };
            buttonWorksCalendar.addActionListener(listener);
            add(buttonWorksCalendar);
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
