package proxy_pattern.proxy_class;

import proxy_pattern.entity_class.RealImage;
import proxy_pattern.interfaces.Image;

public class ImageProxy implements Image{

    private RealImage realImage;


    public void display() {

        if(realImage == null) {
            realImage = new RealImage();
        }

        realImage.display();

    }
}
