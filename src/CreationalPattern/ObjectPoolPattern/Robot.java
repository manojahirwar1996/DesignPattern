package CreationalPattern.ObjectPoolPattern;



import CreationalPattern.PrototypePattern.Components;

import java.util.List;

public class Robot implements Cloneable {
    private int id;
    private List<String> feature;
    private CreationalPattern.PrototypePattern.Components components;

    public Robot(int id, List<String> feature, CreationalPattern.PrototypePattern.Components components) {
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

    public CreationalPattern.PrototypePattern.Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public CreationalPattern.PrototypePattern.Robot clone(){
        try {
            return (CreationalPattern.PrototypePattern.Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
