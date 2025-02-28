package oops.classes.enums;

import lombok.Getter;

@Getter
public enum Planets {
    MERCURY(1, 57_910_000, 3.30e23),
    VENUS(2, 108_160_000, 4.87e24),
    EARTH(3, 149_600_000, 5.97e24),
    MARS(4, 227_940_000, 6.42e23),
    JUPITER(5, 778_330_000, 1.90e27),
    SATURN(6, 1_424_600_000, 5.68e26),
    URANUS(7, 2_873_550_000L, 8.68e25),
    NEPTUNE(8, 4_498_250_000L, 1.02e26);

    private final int orderInSolarSystem;
    private final long distanceFromSun;
    private final double mass;

    Planets(int orderInSolarSystem, long distanceFromSun, double mass) {
        this.orderInSolarSystem = orderInSolarSystem;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "orderInSolarSystem=" + orderInSolarSystem +
                ", distanceFromSun=" + distanceFromSun +
                ", mass=" + mass +
                '}';
    }
}

class TestClass {
    public static void main(String[] args) {
        System.out.println(Planets.EARTH);
        System.out.println(Planets.valueOf("EARTH"));
    }
}