package cn.tuyucheng.taketoday.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareExample {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            MyBeanName myBeanName = context.getBean(MyBeanName.class);
            MyBeanFactory myBeanFactory = context.getBean(MyBeanFactory.class);
            myBeanFactory.getMyBeanName();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}