import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private JButton btnShow;
    private JComboBox<String> cmbObjects;
    private JLabel lblFilename;
    private JLabel lblRadius;
    private JLabel lblHeight;
    private JTextArea txtArea;
    private JTextField txtRadius;
    private JTextField txtHeight;
    private GridBagConstraints gbc = new GridBagConstraints();

    public MainPanel() {
        setLayout(new GridBagLayout());
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.ipadx = 25; // Laius kõigil lahtritel
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Täida kogu lahter

        firstLine();
        secondLine();
        thirdLine();
        forthLine();
    }

    private void firstLine() {

        cmbObjects = new JComboBox<>(new String[] {"Vali kujund", "Kera", "Silinder"});
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(cmbObjects, gbc);

        lblRadius = new JLabel("Raadius", JLabel.RIGHT);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(lblRadius, gbc);

        txtRadius = new JTextField(10);
        txtRadius.setEditable(false);
        //txtRadius.setPreferredSize(new Dimension(10,25));
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(txtRadius, gbc);

        btnShow = new JButton("Näita ja salvesta");
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(btnShow, gbc);
    }
    private void secondLine() {

        lblHeight = new JLabel("Kõrgus", JLabel.RIGHT);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(lblHeight, gbc);

        txtHeight = new JTextField(10);
        txtHeight.setEditable(false);
        //txtRadius.setPreferredSize(new Dimension(10,25));
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(txtHeight, gbc);
    }
    private void thirdLine() {
        lblFilename = new JLabel("Salvestuse fail");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 10;
        add(lblFilename, gbc);
    }

    private void forthLine() {
        txtArea = new JTextArea(15, 15);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        gbc.gridx = 0;
        gbc.gridy = 3;
        //gbc.gridwidth = 3; // Siin on sama mis varem muudetud 3
        add(scrollPane, gbc);
    }



    public JButton getBtnShow() {
        return btnShow;
    }

    public JComboBox<String> getCmbObjects() {
        return cmbObjects;
    }

    public JLabel getLblFilename() {
        return lblFilename;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public JTextField getTxtRadius() {
        return txtRadius;
    }

    public JTextField getTxtHeight() {
        return txtHeight;
    }
}
