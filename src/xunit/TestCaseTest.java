package xunit;

//또 다른 테스트를 테스트하는 테스트 클래스
public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    WasRun wasRun;

    @Override
    public void setUp() {
        wasRun = new WasRun("testMethod");
    }
    public void testRunning() {
        Assert.assertEquals(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.log);
        Assert.assertEquals(true, wasRun.wasRun);
    }

    public void testSetup() {
        Assert.assertEquals(false, wasRun.wasSetup);
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.log);
        Assert.assertEquals(true, wasRun.wasSetup);
    }
}
