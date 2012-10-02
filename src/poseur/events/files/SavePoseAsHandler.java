/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poseur.events.files;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import poseur.Poseur;
import poseur.files.PoseurFileManager;

/**
 *
 * @author roofis0
 */
public class SavePoseAsHandler implements ActionListener {

    public SavePoseAsHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         // FORWARD THE REQUEST TO THE FILE MANAGER
        Poseur singleton = Poseur.getPoseur();
        PoseurFileManager poseurFileManager = singleton.getFileManager();
        poseurFileManager.requestSaveAsPose();
    }
    
}
