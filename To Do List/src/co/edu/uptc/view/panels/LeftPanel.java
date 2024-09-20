package co.edu.uptc.view.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import co.edu.uptc.view.subPanels.InferiorSubPanel;
import co.edu.uptc.view.subPanels.MediumSubPanel;
import co.edu.uptc.view.subPanels.TopSubPanel;

public class LeftPanel extends JPanel{


    public LeftPanel(){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(250,HEIGHT));
        setBackground(Color.BLACK);
        initSubPanels();
    }

    private void initSubPanels(){
        addTopSubPanel();
        addMediumSubPanel();
        addInferiorSubPanel();
    }


    private void addTopSubPanel(){
        TopSubPanel topSubPanel = new TopSubPanel();
        add(topSubPanel,BorderLayout.NORTH);
    }

    private void addMediumSubPanel(){
        MediumSubPanel mediumSubPanel = new MediumSubPanel();
        add(mediumSubPanel,BorderLayout.CENTER);
    }

    private void addInferiorSubPanel(){
        InferiorSubPanel inferiorSubPanel = new InferiorSubPanel();
        add(inferiorSubPanel,BorderLayout.SOUTH);
    }
}
