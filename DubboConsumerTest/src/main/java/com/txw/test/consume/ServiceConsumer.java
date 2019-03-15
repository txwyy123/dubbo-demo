package com.txw.test.consume;

import com.txw.test.entity.Person;
import com.txw.test.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by txwyy123 on 17/2/23.
 */

@Component("serviceConsumer")
public class ServiceConsumer {

    @Autowired
    private DubboService dubboService;

    public void consume(){
        Person person = dubboService.getPerson(1);
        System.out.print(person);
    }
}
