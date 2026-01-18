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
        int x =10;
        assert (x / 2) == 5;
    }

    @Test
    public void test4(){
        Calculator cal = new Calculator();
        int result = cal.add(4, 7);
        assert result == 11;
    }

    @Test
    public void test5(){
        Calculator cal = new Calculator();
        boolean result = cal.isEven(6);
        assert result == true;
    }
}
