package co.edu.uptc.view.dashboard;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

import co.edu.uptc.view.panels.CenterPanel;
import co.edu.uptc.view.panels.LeftPanel;

public class DashBoard extends JFrame{

    private static DashBoard instance;


    private DashBoard(){
        setTitle("To Do List");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setMinimumSize(new DimensionUIResource(600, 400));
        initComponents();
        setVisible(true);
    }

    public static DashBoard getInstance(){
        if(instance == null){
            instance = new DashBoard();
        }
        return instance;
    }

    private void initComponents(){
        addCenterPanel();
        addLeftPanel();
        addSubPanelInferior();
    }

    private void addCenterPanel(){
        CenterPanel centerPanel = new CenterPanel();
        add(centerPanel,BorderLayout.CENTER);
    }

    private void addLeftPanel(){
        LeftPanel leftPanel = new LeftPanel();
        add(leftPanel, BorderLayout.WEST);
    }

    private void addSubPanelInferior(){
        
    }
}
