package com.crudoperation.crud;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi{
    class ResponseData{
        boolean sucess;
        String messege;

        ResponseData(boolean sucess,String messege){
            this.sucess = sucess;
            this.messege = messege;

        }

    }
    public ResponseData Response(){
        ResponseData d1 = new ResponseData(true,"Hello World");
        return d1;

    } 
    @GetMapping("/welcome")
    public ResponseData HelloWorldApi(){
        ResponseData data = Response();
        return data;
    }
}


