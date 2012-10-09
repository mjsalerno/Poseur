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
import poseur.state.PoseurStateManager;

/**
 *
 * @author roofis0
 */
public class CutHandler implements ActionListener {

    public CutHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Poseur singleton = Poseur.getPoseur();
        PoseurStateManager poseurStateManager = singleton.getStateManager();
        poseurStateManager.copySelectedItem();
        PoseurShape selectedShape = singleton.getStateManager().getSelectedShape();
        LinkedList<PoseurShape> shapeList = singleton.getStateManager().getPose().getShapesList();
        int shapeIndex = shapeList.indexOf(selectedShape);
        shapeList.remove(shapeIndex);
        singleton.getStateManager().refreshState();
    }
    
}
