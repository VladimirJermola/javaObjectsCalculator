import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ButtonShowListener implements ActionListener {

        private Model model;
        private View view;

    public  ButtonShowListener(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(view.getCmbObjects().getSelectedItem().toString() == "Kera") {
            try {
                double radius = Double.parseDouble(view.getTxtRadius().getText());
                Sphere sphere = new Sphere(radius);
                String result = "Kera" + ";" + Double.toString(sphere.getRadius()) + ";" + Double.toString(sphere.calculateSurfaceArea()) + ";" + Double.toString(sphere.calculateCircumference()) + ";" + Double.toString(sphere.calculateVolume()) + "\n";
                view.getTxtArea().setText("");//Tühjenda tekstikast
                //view.getTxtArea().append(result);
                view.getTxtArea().append("Kera\n");
                view.getTxtArea().append("Raadius: ");
                view.getTxtArea().append(Double.toString(sphere.getRadius()) + "\n");
                view.getTxtArea().append("Pindala: ");
                view.getTxtArea().append(Double.toString(sphere.calculateSurfaceArea()) + "\n");
                view.getTxtArea().append("Ümbermõõt: ");
                view.getTxtArea().append(Double.toString(sphere.calculateCircumference()) + "\n");
                view.getTxtArea().append("Ruumala: ");
                view.getTxtArea().append(Double.toString(sphere.calculateVolume()) + "\n");

                String filePath = "JavaKujundid.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                    writer.write(result);
                } catch (IOException er) {
                    er.printStackTrace();
                }
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null, "Palun sisesta sobiv number! \n'" + view.getTxtRadius().getText() + "' Ei sobi!", "Sisestusviga", JOptionPane.ERROR_MESSAGE);
                view.getTxtRadius().setText("");
            }
        } else if (view.getCmbObjects().getSelectedItem().toString() == "Silinder") {
            try {
                double radius = Double.parseDouble(view.getTxtRadius().getText());
                double height = Double.parseDouble(view.getTxtHeight().getText());
                Cylinder cylinder = new Cylinder(radius, height);
                String result = "Silinder" + ";" + Double.toString(cylinder.getRadius()) + ";" + Double.toString(cylinder.getHeight()) + ";" + Double.toString(cylinder.calculateTotalSurface()) + ";" + Double.toString(cylinder.calculateLateralSurface()) + ";" + Double.toString(cylinder.calculateVolume()) + "\n";
                view.getTxtArea().setText("");//Tühjenda tekstikast
                //view.getTxtArea().append(result);
                view.getTxtArea().append("Silinder\n");
                view.getTxtArea().append("Raadius: ");
                view.getTxtArea().append(Double.toString(cylinder.getRadius()) + "\n");
                view.getTxtArea().append("Kõrgus: ");
                view.getTxtArea().append(Double.toString(cylinder.getHeight()) + "\n");
                view.getTxtArea().append("Kogu pindala: ");
                view.getTxtArea().append(Double.toString(cylinder.calculateTotalSurface()) + "\n");
                view.getTxtArea().append("Külg pindala: ");
                view.getTxtArea().append(Double.toString(cylinder.calculateLateralSurface()) + "\n");
                view.getTxtArea().append("Ruumala: ");
                view.getTxtArea().append(Double.toString(cylinder.calculateVolume()) + "\n");

                String filePath = "JavaKujundid.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                    writer.write(result);
                } catch (IOException er) {
                    er.printStackTrace();
                }
            } catch (NumberFormatException er) {
                JOptionPane.showMessageDialog(null, "Palun sisesta sobiv number! \n'" + view.getTxtRadius().getText() + " või " + view.getTxtHeight().getText() + "' Ei sobi!","Sisestusviga", JOptionPane.ERROR_MESSAGE);
                view.getTxtRadius().setText("");
                view.getTxtHeight().setText("");
            }
        }else {
            view.getTxtArea().setText("Vali kujund");
        }
    }
}
