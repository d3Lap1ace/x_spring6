package com.springmvc.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 10:19 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
@RequestMapping("file")
public class FileController {
    @PostMapping("upload")
    public String upload(String nickName, MultipartFile headPicture, @RequestParam("backgroundPicture")MultipartFile bgpic){
        System.out.println(nickName);

        String filename = headPicture.getOriginalFilename();
        System.out.println("filename = " + filename);
        long size = headPicture.getSize();
        System.out.println("size = " + size);
        return "jieshou success";
    }
    @Autowired
    private ServletContext servletContext;
    @RequestMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        InputStream ips = servletContext.getResourceAsStream("/imgs/xx.png");
        response.setHeader("content-disposition","attachment;filename-xx.png");
        ServletOutputStream outputStream = response.getOutputStream();
    }
}
