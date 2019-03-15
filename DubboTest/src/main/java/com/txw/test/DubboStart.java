package com.txw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by txwyy123 on 16/5/8.
 */
public class DubboStart {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");

        context.start();

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟

    }

}
