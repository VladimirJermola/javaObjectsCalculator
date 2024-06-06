import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            View view = new View(); // Tee JFrame
            new Controller(model, view);
            try {
                File file = new File("JavaKujundid.txt");

                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            String currentDir = System.getProperty("user.dir");
            String myFile = currentDir + "\\JavaKujundid.txt";
            model.setFilename(myFile);
            view.getLblFilename().setText(model.getFilename());

            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.pack(); //Paiguta komponendid kohale
            view.setLocationRelativeTo(null); //Ekraani keskele
            view.setVisible(true);

        });
    }
}
