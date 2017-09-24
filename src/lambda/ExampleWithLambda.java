package lambda;

public class ExampleWithLambda {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable = () -> {
            System.out.println("Drawing " + width);
        };
        drawable.draw();
    }
}
