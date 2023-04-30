package Lecture3.Ex3.Napitok;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
