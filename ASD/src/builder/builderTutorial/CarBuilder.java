package builder.builderTutorial;

import builder.builderTutorial.model.Car;

public interface CarBuilder {
public String makeEnginee(String enginee);
public String paint(String paint);
public String makeTyre();
public void makeCar();
public Car getCar();
}
