package org.example.designpatterns.prototype;

public class Main {

    public static void main(String[] args) {
        PrototypePatternChild child = new PrototypePatternChild("Ingress");
        PrototypePatternChild child1 = child.copy();

        System.out.println(child.name);
        System.out.println(child1.name);

    }
}
