package com.nttdata.example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Initial configuration that scan the exception rest library
 */
@Configuration
@ComponentScan(basePackages = {"com.nttdata"})
public class ServiceConfiguration {
}
