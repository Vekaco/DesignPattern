package filter_pattern.entity_classes;

public class Person {

    private String name;
    private String gender;
    private String meritialStatus;

    public Person(String name, String gender, String meritialStatus){
        this.name = name;
        this.gender = gender;
        this.meritialStatus = meritialStatus;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMeritialStatus() {
        return meritialStatus;
    }

    public String toString(){
        return "{ Name:" + name + ", gender:" + gender + ", meritialStatus:" + meritialStatus +"}";
    }
}
