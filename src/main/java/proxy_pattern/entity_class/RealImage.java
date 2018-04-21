package proxy_pattern.entity_class;

import proxy_pattern.interfaces.Image;

public class RealImage implements Image{

    public RealImage() {
       loadImage();
    }

    public void display() {
        System.out.println("Display Image...");
    }

    private void loadImage(){
        System.out.println("Loading Image from disk...");
    }
}
