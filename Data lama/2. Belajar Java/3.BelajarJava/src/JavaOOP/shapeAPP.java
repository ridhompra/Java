package JavaOOP;

public class shapeAPP {
    public static void main(String[] args) {
    var shape = new shape();
        System.out.println(shape.getCorner());

        var rectangle = new rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }

    }

