package com.txw.test;

import com.txw.test.consume.ServiceConsumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by txwyy123 on 17/2/23.
 */
public class DubboStart {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");

        context.start();

        ServiceConsumer serviceConsumer = (ServiceConsumer) context.getBean("serviceConsumer");
        serviceConsumer.consume();

    }
}
