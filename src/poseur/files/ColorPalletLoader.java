package poseur.files;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import poseur.PoseurSettings;
import poseur.state.ColorPalletState;
import static poseur.PoseurSettings.*;

/**
 * This class can be used to load color pallet data from an XML file into a
 * constructed ColorPalletState. Note that the XML file must validate against
 * the color_pallet_settings.xsd schema. This class demonstrates how application
 * settings can be loaded dynamically from a file.
 *
 * @author Richard McKenna Debugging Enterprises
 * @version 1.0
 */
public class ColorPalletLoader {

    /**
     * This method will extract the data found in the provided XML file argument
     * and use it to load the color pallet argument.
     *
     * @param colorPalletXMLFile Path and file name to an XML file containing
     * information about a custom color pallet. Note this XML file must validate
     * against the aforementioned schema.
     *
     * @param colorPalletState The state manager for the color pallet, we'll
     * load all the data found in the XML file inside here.
     */
    public void initColorPallet(String colorPalletXMLFile, ColorPalletState colorPalletState) {
        Color[] colorPallet = new Color[20];
        for (int i = 0; i < 20; i++) {
            colorPallet[i] = Color.GRAY;
        }
        XMLUtilities xmlLoader = new XMLUtilities();
        try {
            Document doc = xmlLoader.loadXMLDocument(colorPalletXMLFile, COLOR_PALLET_SETTINGS_SCHEMA);
            
            int pSize = xmlLoader.getIntData(doc, PoseurSettings.PALLET_SIZE_NODE);
            int pRows = xmlLoader.getIntData(doc, PoseurSettings.PALLET_ROWS_NODE);
            int manyColors = xmlLoader.getNumNodesOfElement(doc, PoseurSettings.PALLET_COLOR_NODE);
            int[] colors = new int[manyColors + 1];
            
            Node tmp;
            
            for (int i = 0; i < manyColors; i++) {
                tmp = xmlLoader.getNodeInSequence(doc, RED_NODE, i);
                //String temp = tmp.getFirstChild().getNodeValue();  put in int
            }
            
            
        } catch (InvalidXMLFileFormatException ex) {
            Logger.getLogger(ColorPalletLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        colorPalletState.loadColorPalletState(colorPallet, 2, 12, Color.GRAY);
    }
}