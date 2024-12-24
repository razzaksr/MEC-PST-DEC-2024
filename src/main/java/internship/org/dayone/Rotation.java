package internship.org.dayone;

import java.util.Arrays;

public class Rotation {
    public static void rotateArrayAntiClock(String[] array, int rotation) {
        int size = array.length;// 9
        String[] antiClock = new String[size];
        // (index - rotation+size)%size
        // (0-2+9)%9>> 2
        // (1-2+9)%9>> 1
        // (2-2+9)%9>> 0
        // antiClock = 2 << array 0
        // antiClock = 1 << array 1
        // antiClock = 0 << array 2
        for(int index=0;index<size;index++){
            antiClock[(index - rotation+size)%size] = array[index];
        }
        System.out.println(Arrays.toString(antiClock));
    }
    public static void rotateArrayClock(String[] array, int rotation) {
        int size = array.length;// 9
        String[] clock = new String[size];
        for(int index=0;index<size;index++){
            clock[(index + rotation+size)%size] = array[index];
        }
        System.out.println(Arrays.toString(clock));
    }
    public static void main(String[] args) {
        String[] frameworks={"Node", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        System.out.println(Arrays.toString(frameworks));
        rotateArrayAntiClock(frameworks,2);
        rotateArrayClock(frameworks,2);
    }
}
