package org.example.designpatterns.prototype;

public class PrototypePatternChild extends PrototypePattern {

    public String name;

    public PrototypePatternChild(String name) {
        this.name = name;
    }

    public PrototypePatternChild copy() {
        PrototypePatternChild child = new PrototypePatternChild(name);
        return child;
    }

}
