package com.woxing.controller;

import com.woxing.pojo.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/user")
public class UserConterller {

    @RequestMapping("/xx")
    public Object getuser(String id){
        return null;
    }


    @RequestMapping("/faihiu")
    public Object faihiu(){
        ArrayList<Plancht> planchts = new ArrayList<>();
        Plancht plancht = new Plancht();

        plancht.setName("重大公共项目");

        Data data = new Data();
        data.setType("续建");

        stack stack = new stack();
        stack.setType("个数");
        stack.setValue("");
        stack.setUnit("");
        ArrayList<com.woxing.pojo.stack> stacks = new ArrayList<>();
        stacks.add(stack);
        data.setStacks(stacks);

        ArrayList<Data> data1 = new ArrayList<>();
        data1.add(data);

        plancht.setTypes(data1);
        planchts.add(plancht);
        return planchts;
    }
}
