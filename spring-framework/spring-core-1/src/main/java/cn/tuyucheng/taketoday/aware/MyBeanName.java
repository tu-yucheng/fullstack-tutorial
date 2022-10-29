package cn.tuyucheng.taketoday.aware;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.BeanNameAware;

@Slf4j
public class MyBeanName implements BeanNameAware {

    @Override
    public void setBeanName(@NotNull String beanName) {
        log.info("beanName: {}", beanName);
    }
}