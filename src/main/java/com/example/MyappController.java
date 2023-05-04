package com.example;

import io.micronaut.http.annotation.*;

@Controller("/myapp")
public class MyappController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}