import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s;
        double ta, tb, tc;

        Paralelepipedo pp = new Paralelepipedo();

        s= JOptionPane.showInputDialog("Entre com o valor do lado A: ");
        pp.dA = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Entre com o valor do lado B: ");
        pp.dB = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Entre com o valor do lado C: ");
        pp.dC = Double.parseDouble(s);

        ta = Math.pow(pp.dA, 2);
        tb = Math.pow(pp.dB, 2);
        tc = Math.pow(pp.dC, 2);

        pp.Diagonal = Math.sqrt(ta+tb+tc);

        JOptionPane.showMessageDialog(null, "O valor da Diagonal é: "+pp.Diagonal);
    }
}