package com.nttdata.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class ExampleModel {

    private String parameter;
    private String value;

}