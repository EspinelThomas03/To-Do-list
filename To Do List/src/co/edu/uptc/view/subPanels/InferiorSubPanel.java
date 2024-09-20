package co.edu.uptc.view.subPanels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.view.panels.LeftPanel;

public class InferiorSubPanel extends JPanel{

    private int y = HEIGHT-300;
    private int heigthInferior = HEIGHT-100;


    public InferiorSubPanel(){
        // setBounds(0, HEIGHT-150/2, LeftPanel.WIDTH, 100);
        setPreferredSize(new Dimension(LeftPanel.WIDTH,350));
        setBackground(Color.WHITE);
    }

    private void initComponents(){

    }
    
}
