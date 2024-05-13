package com.springmvc.exceptionhandlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 13/5/2024 16:26 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    private Map Npdata = new HashMap();
    private Map Adata = new HashMap();

    @ExceptionHandler(NullPointerException.class)
    public Map handlerNUllPointer(Exception e){
        System.out.println(e.getMessage());
        Npdata.put("code",405);
        return Npdata;
    }


    @ExceptionHandler(ArithmeticException.class)
    public Map handlerArithmetic(Exception e){
        System.out.println(e.getMessage());
        Adata.put("code",406);
        return Adata;
    }

}
