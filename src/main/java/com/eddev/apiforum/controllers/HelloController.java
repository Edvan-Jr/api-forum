package com.eddev.apiforum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // quando usa @Controller e não @RestController, precisa do @ResponseBody. Quando o Rest, não
public class HelloController {

    @RequestMapping("/")
    @ResponseBody // anotação para o Spring não pensar que o retorno é uma página, e querer procurar essa página
    public String hello(){
        return "Hello, world!";
    }
}
