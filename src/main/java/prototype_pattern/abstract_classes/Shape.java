package prototype_pattern.abstract_classes;

public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    protected abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
