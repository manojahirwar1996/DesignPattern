package ObjectPoolPattern;



import PrototypePattern.Components;

import java.util.List;

public class Robot implements Cloneable {
    private int id;
    private List<String> feature;
    private PrototypePattern.Components components;

    public Robot(int id, List<String> feature, PrototypePattern.Components components) {
        this.id = id;
        this.feature = feature;
        this.components = components;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFeature() {
        return feature;
    }

    public void setFeature(List<String> feature) {
        this.feature = feature;
    }

    public PrototypePattern.Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public PrototypePattern.Robot clone(){
        try {
            return (PrototypePattern.Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
