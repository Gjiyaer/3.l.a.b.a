package object;

import interfaces.GravityControl;
import interfaces.ForceGravityControl;

public abstract class Rocket implements GravityControl, ForceGravityControl {
    private String name;

    public Rocket(String name) {
        this.name = name;
    }

    @Override
    public void applyGravity() {
        System.out.println("Применение гравитации к ракете " + name);
    }

    @Override
    public void applyForceGravity() {
        System.out.println("Применение силы тяжести к ракете " + name);
    }

    public void launch() {
        System.out.println("Ракета " + name + " взлетает.");
    }

    public void fly() {
        applyGravity(); // Применение гравитации во время полета
        applyForceGravity(); // Применение силы тяжести во время полета
        System.out.println("Ракета " + name + " летит.");
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void ForceGravityControl();
}

