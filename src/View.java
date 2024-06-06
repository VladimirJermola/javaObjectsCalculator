import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    public ComboBoxModel<String> getCmbObjects;
    private MainPanel mainPanel;

    public View() {
        super("Java Kujundid");// JFrame konstruktor
        //setResizable(false);//Frame suurust muuta ei saa

        setLayout(new BorderLayout());

        mainPanel = new MainPanel();

        add(mainPanel, BorderLayout.NORTH);

    }


    public void registerButtonShow(ActionListener al) {
        mainPanel.getBtnShow().addActionListener(al);
    }

    public void registerComboBoxListener(ActionListener al) {
        mainPanel.getCmbObjects().addActionListener(al);
    }

    public JButton getBtnShow() {
        return mainPanel.getBtnShow();
    }

    public JComboBox<String> getCmbObjects() {
        return mainPanel.getCmbObjects();
    }

    public JLabel getLblFilename() {
        return mainPanel.getLblFilename();
    }

    public JTextArea getTxtArea() {
        return mainPanel.getTxtArea();
    }

    public JTextField getTxtRadius() {return mainPanel.getTxtRadius();}

    public JTextField getTxtHeight() {return mainPanel.getTxtHeight();}


}
