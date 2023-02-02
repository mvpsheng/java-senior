package chap7;

/**
 * FileName: PlaceSetting
 * author: gxs
 * Date: 2022/3/14  17:34
 */
class Plate {
    Plate(int i) {
        System.out.println("Plate constructor");
    }
}
class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}
class Custom {
    Custom(int i) {
        System.out.println("Custom constructor");
    }
}
public class PlaceSetting extends Custom {
    private DinnerPlate pl;
    PlaceSetting(int i) {
        super(i + 1);
        pl = new DinnerPlate(i + 2);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting ps = new PlaceSetting(1);
    }
}
