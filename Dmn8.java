import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showInternalMessageDialog;

public class Dmn8 {
        public static void main(String[] args) {
          String name = showInputDialog(null, "What is your name" );
            System.out.println(name);
            showInternalMessageDialog(null,"HALLO");
            showInternalMessageDialog(null,name);

        }
}
