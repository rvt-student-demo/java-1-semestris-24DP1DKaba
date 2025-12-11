package rvt;

public class Box {
    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    // Access methods
    public double length() {
        return this.length;
    }

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public static Box biggerBox(Box oldBox) {
        return new Box(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    public static Box smallerBox(Box oldBox) {
        return new Box(
            0.75 * oldBox.width(),
            0.75 * oldBox.height(),
            0.75 * oldBox.length()
        );
    }

    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width() &&
               this.height < outsideBox.height() &&
               this.length < outsideBox.length();
    }
}