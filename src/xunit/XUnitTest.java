package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        new TestCaseTest("testTemplateMethod").run();
        new TestCaseTest("testFailedResultFormatting").run();
        new TestCaseTest("testFailedResult").run();
        new TestCaseTest("testResult").run();
    }
}
