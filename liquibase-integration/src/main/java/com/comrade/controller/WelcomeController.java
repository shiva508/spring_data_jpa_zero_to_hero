package com.comrade.controller;

import com.comrade.model.DataRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @PostMapping("/need")
    public String ddadadad(@RequestBody DataRequest dataRequest){
        return dataRequest.getValue();
    }
}
