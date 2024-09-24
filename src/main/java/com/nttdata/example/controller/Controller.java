package com.nttdata.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    /**
     * Communication is an example API
     * @param option
     * @return
     */
    @GetMapping(path = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testmtls() {
        String response = "Hello, secure world with mTLS!";
        log.info("API response -- {}", response);
        return response;
    }

}