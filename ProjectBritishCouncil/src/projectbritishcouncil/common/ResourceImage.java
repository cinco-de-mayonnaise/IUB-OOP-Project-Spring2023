/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 *
 * @author Abdullah
 */
// only reserved for static icons/banners that need to be loaded for FXML scenes.
public class ResourceImage
{
    protected Image Img;
    protected String Url;

    public ResourceImage(String url)
    {
        this.Url = url;
        this.Img = new Image(url);
    }

    public Image getImg() {
        return Img;
    }

    public String getUrl() {
        return Url;
    }
}
