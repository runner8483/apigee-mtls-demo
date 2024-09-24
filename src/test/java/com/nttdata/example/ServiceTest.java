package com.nttdata.example;

import com.nttdata.example.service.impl.ExampleServiceImpl;
import com.nttdata.example.model.ExampleModel;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ServiceTest {

    @InjectMocks
    private ExampleServiceImpl service;

    private ExampleModel model;

    @BeforeEach
    public void beforeEach() {
        model = new ExampleModel();
    }

    @ParameterizedTest
    @CsvSource(value = {"Greeting:Hello world:1", "Fired:Bye world:2"}, delimiter = ':')
    void constructExampleScenarios(String parameter, String value, Integer option) {
        model.setParameter(parameter);
        model.setValue(value);

        ExampleModel response = service.constructExample(option);
        Assert.assertNotNull(response);
        Assert.assertEquals(response, model);
    }

}