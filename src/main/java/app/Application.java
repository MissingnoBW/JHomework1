package app;

import app.service.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

        Calculator calculator = (Calculator) context.getBean("calculator");

        calculator.readInput(); // Reading input
        calculator.printResult( // Printing result
                calculator.getSum(),
                calculator.getDif(),
                calculator.getMulti(),
                calculator.getDiv() // Dividing by 0 prints "Infinity", no errors
        );
    }
}
