package _06_inheritance_java.exercise.moveable_point;

import java.util.Arrays;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveable = new MoveablePoint();
        System.out.println(Arrays.toString(new MoveablePoint[]{moveable}));
    }
}
