package command_pattern.receivers;

public class Stock {
    private String name = "ABC";
    private int quality = 10;


    public void sell(){
        System.out.println("Sold " + name + " * " + quality);
    }

    public void buy() {
        System.out.println("Buy " + name + " * " + quality);
    }
}
