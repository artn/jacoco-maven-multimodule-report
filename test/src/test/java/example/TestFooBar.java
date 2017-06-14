package example;


import org.junit.Test;

public class TestFooBar {

    @Test
    public void test() {
        new Foo().calculate(12);
        new Bar().calculate(16);
    }
}
