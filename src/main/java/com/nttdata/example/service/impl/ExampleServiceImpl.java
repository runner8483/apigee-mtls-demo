package com.nttdata.example.service.impl;

import com.nttdata.example.model.ExampleModel;
import com.nttdata.example.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleModel constructExample(Integer option) {
        ExampleModel model = new ExampleModel();
        switch (option) {
            case 1:
                model.setParameter("Greeting");
                model.setValue("Hello world");
                break;
            case 2:
                model.setParameter("Fired");
                model.setValue("Bye world");
                break;
            default:
                log.warn("Number {} does not an option", option);
        }
        return model;
    }

}