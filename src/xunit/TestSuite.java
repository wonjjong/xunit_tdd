package xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {
    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends TestCase> testClass) {
        Arrays.stream(testClass.getMethods())
                /* .filter(m -. AnnotationUtils.findAnnotation(m, xunit.annotation.Test.class) != null) 애노테이션 사용, spring-core 라이브러리 필요 */
                .filter(m -> m.getName().startsWith("test"))
                .forEach(m ->
                        {
                            try {
                                add(testClass.getConstructor(String.class).newInstance(m.getName()));
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                );
    }

    public TestSuite() {

    }

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach(t -> {
            t.run(result);
        });
    }
}
