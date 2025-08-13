package ru.alishev.spring.lesson11;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson11/application-context.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


        context.close();
    }
}
