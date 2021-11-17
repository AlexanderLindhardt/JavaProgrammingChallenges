import static java.lang.System.*;

public class Challenge_4_1 {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(1);
        Sphere s2 = new Sphere(152);
        out.println("s1 volume:" + s1.getVolume());
        out.println("s1 surface:" + s1.getSurfaceArea());
        out.println("s2 volume:" + s2.getVolume());
        out.println("s2 surface:" + s2.getSurfaceArea());

        s1.setDiameter(52);
        out.println("s1 diameter:" + s1.getDiameter());
        out.println("s1 volume:" + s1.getVolume());
        out.println("s1 surface:" + s1.getSurfaceArea());


    }
}
