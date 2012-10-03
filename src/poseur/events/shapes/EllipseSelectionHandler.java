/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poseur.events.shapes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import poseur.Poseur;
import poseur.shapes.PoseurShapeType;
import poseur.state.PoseurStateManager;

/**
 *
 * @author roofis0
 */
public class EllipseSelectionHandler implements ActionListener {

    public EllipseSelectionHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         // RELAY THE REQUEST TO THE DATA MANAGER
        Poseur singleton = Poseur.getPoseur();
        PoseurStateManager poseurStateManager = singleton.getStateManager();
        poseurStateManager.selectShapeToDraw(PoseurShapeType.ELLIPSE);
    }
    
}
