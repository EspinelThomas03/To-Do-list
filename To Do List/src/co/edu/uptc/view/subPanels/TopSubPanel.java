package co.edu.uptc.view.subPanels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.view.panels.LeftPanel;

public class TopSubPanel extends JPanel{

    public TopSubPanel(){
        // setBounds(0, 0, LeftPanel.WIDTH, 100);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, 150));
        setBackground(Color.BLUE);
    }
}
