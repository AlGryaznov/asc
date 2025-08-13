package ru.alishev.spring.lesson10;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson10/application-context.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


        context.close();
    }
}
