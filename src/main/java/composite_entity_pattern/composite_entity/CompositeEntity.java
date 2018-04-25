package composite_entity_pattern.composite_entity;

import composite_entity_pattern.coase_grained_object.CoaseGrainedObject;
import composite_entity_pattern.dependent_objects.DependentObject1;
import composite_entity_pattern.dependent_objects.DependentObject2;

public class CompositeEntity {
    private CoaseGrainedObject  cgo = new CoaseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1,data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
