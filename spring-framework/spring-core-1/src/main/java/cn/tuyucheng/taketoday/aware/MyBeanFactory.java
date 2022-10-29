package cn.tuyucheng.taketoday.aware;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

@Slf4j
public class MyBeanFactory implements BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(@NotNull BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void getMyBeanName() {
        MyBeanName myBeanName = beanFactory.getBean(MyBeanName.class);
        log.info("{}", myBeanName);
        log.info("Is myCustomBeanName a singleton bean： {}", beanFactory.isSingleton("myCustomBeanName"));
    }
}