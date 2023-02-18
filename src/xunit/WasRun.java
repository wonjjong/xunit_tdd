package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetup;
    public String log;

    @Override
    public void setUp() {
        wasSetup = true;
        log = "setUp";
    }

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        wasRun = true;
        log += " testMethod";
    }


}
