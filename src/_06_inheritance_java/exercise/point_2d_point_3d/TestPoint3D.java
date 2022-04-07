package _06_inheritance_java.exercise.point_2d_point_3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3d = new Point3D();
        System.out.println(Arrays.toString(point3d.getXYZ()));
        point3d.setXYZ(1,2,3);
        System.out.println(Arrays.toString(point3d.getXYZ()));

    }
}
