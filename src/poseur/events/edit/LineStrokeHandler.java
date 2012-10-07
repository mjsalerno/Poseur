/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poseur.events.edit;

import java.awt.BasicStroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import poseur.Poseur;
import poseur.shapes.PoseurShape;

/**
 *
 * @author roofis0
 */
public class LineStrokeHandler implements ActionListener {

    public LineStrokeHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Poseur singleton = Poseur.getPoseur();
        if (singleton.getStateManager().isShapeSelected()) {
            PoseurShape selectedShape = singleton.getStateManager().getSelectedShape();
            BasicStroke newStroke = new BasicStroke(singleton.getGUI().getLineThickness());
            
            selectedShape.setOutlineThickness(newStroke);
            singleton.getStateManager().refreshState();
            
        }
    }
    
}
