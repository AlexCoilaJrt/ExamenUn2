
package pe.edu.upeu.examen2;

import pe.edu.upeu.examen2.gui.ControllerGame;
import pe.edu.upeu.examen2.gui.Inicio;
import pe.edu.upeu.examen2.gui.ModelGame;

/**
 *
 * @author ALEXCJ
 */
public class ExamenACJ {

    public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Inicio view = new Inicio();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
