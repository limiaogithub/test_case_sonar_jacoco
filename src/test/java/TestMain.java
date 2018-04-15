import cn.TestClass;
import org.testng.annotations.Test;

public class TestMain {

    @Test
    public void test() {
        TestClass testClass = new TestClass();
        testClass.test("lilei");
        testClass.test("hanmeimei");
    }
}
