package referencechampion;

import gui.UI;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        UI kl = new UI(600, 600);

        SwingUtilities.invokeLater(kl);
    }
}
