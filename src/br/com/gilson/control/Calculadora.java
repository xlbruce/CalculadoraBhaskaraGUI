
package br.com.gilson.control;

import br.com.gilson.view.FrmPrincipal;
import br.com.gilson.model.Resultado;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Gilson da Silva
 * @version 1.0
 */
public class Calculadora {

    private static Resultado resultado;
    private static final String VERSION = "1.0";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setTitle("Calculo de Bhaskara");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        frmPrincipal.setBounds((d.width / 2) - (308 / 2), (d.height / 2) - (300 / 2), 308, 300);
        frmPrincipal.setVisible(true);

    }

    public static String getVERSION() {
        return VERSION;
    }
}
