import org.example.Calculator;
import org.junit.Test;

public class SampleTest {

    @Test
    public void test1(){
        int a = 4;
    }

    @Test
    public void test2(){
        int x = 9;
        assert x % 2 != 0;
    }

    @Test
    public void test3(){
        int x =100;
        assert (x / 2) == 50;
    }

    @Test
    public void test4(){
        Calculator cal = new Calculator();
        int result = cal.add(15, 20);
        assert result == 35;
    }

    @Test
    public void test5(){
        Calculator cal = new Calculator();
        boolean result = cal.isEven(6);
        assert result == true;
    }
}
