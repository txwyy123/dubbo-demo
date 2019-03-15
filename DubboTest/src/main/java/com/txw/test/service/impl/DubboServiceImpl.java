package com.txw.test.service.impl;


import com.txw.test.entity.Person;
import com.txw.test.service.DubboService;

/**
 * Created by txwyy123 on 16/5/8.
 */
public class DubboServiceImpl implements DubboService {
    @Override
    public Person getPerson(Integer id) {

        Person person = new Person();
        person.setName("txw");
        person.setAge(22);
        return person;
    }
}
