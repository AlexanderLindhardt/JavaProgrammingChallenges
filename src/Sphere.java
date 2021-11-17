public class Sphere {
    private int diameter;

    public Sphere(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = (double) this.diameter / 2;
        return 4*Math.PI*Math.pow(radius, 3) / 3;
    }

    public double getSurfaceArea() {
        double radius = (double) this.diameter / 2;

        return 4*Math.PI*Math.pow(radius, 2);
    }
}
