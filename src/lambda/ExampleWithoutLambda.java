package lambda;

public class ExampleWithoutLambda {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        drawable.draw();
    }
}

/*
* Implementation of Interface without using lambda expression.
* Implementation of Interface using Anonymous Class
* Output will be :- Drawing 10
 */
