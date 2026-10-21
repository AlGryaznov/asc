package ru.alishev.spring.lesson3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContext {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson3/application-context.xml"
        );


        TestBean bean = context.getBean("testBean", TestBean.class);

        System.out.println(bean.getName());

        context.close();
    }
}
