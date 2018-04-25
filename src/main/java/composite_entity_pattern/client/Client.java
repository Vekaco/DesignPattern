package composite_entity_pattern.client;

import composite_entity_pattern.composite_entity.CompositeEntity;

public class Client {
    private CompositeEntity entity = new CompositeEntity();

    public void setData(String data1, String data2){
        entity.setData(data1, data2);
    }

    public void printData() {
        for(String str:entity.getData()) {
            System.out.println(str);
        }
    }
}
