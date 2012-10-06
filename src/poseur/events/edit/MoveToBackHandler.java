/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poseur.events.edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import poseur.Poseur;
import poseur.shapes.PoseurShape;

/**
 *
 * @author Michael
 */
public class MoveToBackHandler implements ActionListener {

    public MoveToBackHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Poseur singleton = Poseur.getPoseur();
        int shapeIndex;
        
        PoseurShape selectedShape = singleton.getStateManager().getSelectedShape();
        LinkedList<PoseurShape> shapeList = singleton.getStateManager().getPose().getShapesList();
        shapeIndex = shapeList.indexOf(selectedShape);
        shapeList.remove(shapeIndex);
        shapeList.add(0, selectedShape);
        singleton.getStateManager().refreshState();
    }
    
}
