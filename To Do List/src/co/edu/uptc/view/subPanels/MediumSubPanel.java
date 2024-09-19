package co.edu.uptc.view.subPanels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.view.panels.LeftPanel;

public class MediumSubPanel extends JPanel{
    
    public MediumSubPanel(){
        // setBounds(0, 200, LeftPanel.WIDTH, 100);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, 550));
        setBackground(Color.RED);
    }
}
