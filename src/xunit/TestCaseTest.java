package xunit;

//또 다른 테스트를 테스트하는 테스트 클래스
public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        wasRun.run();
        Assert.assertEquals("setUp testMethod tearDown", wasRun.log);
    }

}
