import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxListener implements ActionListener {
    private Model model;
    private View view;

    public ComboBoxListener(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.getCmbObjects().getSelectedItem().toString() == "Kera") {
            view.getTxtRadius().setEditable(true);
            view.getTxtHeight().setEditable(false);
            view.getTxtRadius().setText("");
            view.getTxtHeight().setText("");
        } else if (view.getCmbObjects().getSelectedItem().toString() == "Silinder") {
            view.getTxtRadius().setEditable(true);
            view.getTxtHeight().setEditable(true);
            view.getTxtRadius().setText("");
            view.getTxtHeight().setText("");
        } else {
            view.getTxtRadius().setEditable(false);
            view.getTxtHeight().setEditable(false);
            view.getTxtRadius().setText("");
            view.getTxtHeight().setText("");
        }
    }
}
