package pagesPacakge;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Testrunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AutomationPracticeTest.class);
        System.out.println("Result =" + result.wasSuccessful());


    }
}
