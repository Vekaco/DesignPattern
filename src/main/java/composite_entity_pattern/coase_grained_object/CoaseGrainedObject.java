package composite_entity_pattern.coase_grained_object;

import composite_entity_pattern.dependent_objects.DependentObject1;
import composite_entity_pattern.dependent_objects.DependentObject2;

public class CoaseGrainedObject {

    private DependentObject1 dependentObject1 = new DependentObject1();
    private DependentObject2 dependentObject2 = new DependentObject2();

    public void setData(String data1, String data2) {
        dependentObject1.setData(data1);
        dependentObject2.setData(data2);
    }

    public String[] getData(){
        return new String[] {dependentObject1.getData(), dependentObject2.getData()};
    }
}
