import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String x = JOptionPane.showInputDialog("Dame un valor");
        System.out.println (Integer.parseInt(x));
        String y = JOptionPane.showInputDialog("Dame un valor");
        System.out.println (Integer.parseInt(y));
        String z = JOptionPane.showInputDialog("Dame un valor");
        System.out.println (Integer.parseInt(z));
        float a = (float) (Integer.parseInt(x) + Integer.parseInt(y) + Integer.parseInt(z)) / 3;
        System.out.println(a);

    }
}