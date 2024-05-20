package com.example.demo.Controllers;

import com.example.demo.Domain.Entity.EmailMessage;
import com.example.demo.Service.Impl.EmailService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @CrossOrigin
    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailMessage emailMessage) throws UnirestException {
        emailService.sendEmail(emailMessage);
        return "Email sent successfully";
    }
}
