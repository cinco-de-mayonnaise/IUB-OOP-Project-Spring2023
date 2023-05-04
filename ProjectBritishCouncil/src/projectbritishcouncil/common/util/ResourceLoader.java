/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common.util;

import projectbritishcouncil.common.ResourceImage;
import static projectbritishcouncil.common.util.Identifiers.IMAGE_NOTOK;
import static projectbritishcouncil.common.util.Identifiers.IMAGE_OK;

/**
 *
 * @author Abdullah
 */
public class ResourceLoader {

    public static void loadResources(CommonInstancesClass cic) throws Exception
    {
        cic.putObject(IMAGE_OK, new ResourceImage("/FXMLScenes/ok.png"));
        cic.putObject(IMAGE_NOTOK, new ResourceImage("/FXMLScenes/not_ok.png"));
    }
    
}
