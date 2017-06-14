package example;

public class Bar {

    public void calculate(int c) {
        if (c > 10)
            c = c / 2;
        else
            c = c * 2;

        for (int i=0; i<c; i++) {
            if (i < 5) {
                System.out.println("Hello " + i);
            } else {
                System.out.println("Hi " + i);
            }
        }
    }
}
