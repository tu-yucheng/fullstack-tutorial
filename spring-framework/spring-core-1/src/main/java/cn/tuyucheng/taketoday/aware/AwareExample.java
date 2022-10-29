package cn.tuyucheng.taketoday.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AwareExample {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            context.getBean(MyBeanName.class);
            MyBeanFactory myBeanFactory = context.getBean(MyBeanFactory.class);
            myBeanFactory.getMyBeanName();
        } catch (BeansException e) {
            log.error("context", e);
        }
    }
}