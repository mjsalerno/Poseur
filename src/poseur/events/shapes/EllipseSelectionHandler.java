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
 * This handler responds to when the user requests to
 * start drawing an Ellipse.
 * 
 * @author  Michael Salerno
 */
public class EllipseSelectionHandler implements ActionListener {


     /**
     * When the user requests to draw an Ellipse, we'll need
     * to notify the data manager, since it managers the 
     * shape in progress. It will update the gui as needed
     * as well.
     * 
     * @param ae The Event Object.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
         // RELAY THE REQUEST TO THE DATA MANAGER
        Poseur singleton = Poseur.getPoseur();
        PoseurStateManager poseurStateManager = singleton.getStateManager();
        poseurStateManager.selectShapeToDraw(PoseurShapeType.ELLIPSE);
    }
    
}
