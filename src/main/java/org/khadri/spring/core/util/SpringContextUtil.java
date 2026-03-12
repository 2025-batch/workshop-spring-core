package org.khadri.spring.core.util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtil {
    private static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("beans.xml");
    }
    public static ApplicationContext getContext() {
        return context;
    }
}
