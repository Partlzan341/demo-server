package com.example.demo.Service.Impl;

import com.example.demo.Domain.Entity.EmailMessage;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(EmailMessage emailMessage) throws UnirestException {
        String API_KEY = "0d16dd172644c9a73b0076c62a1aa002-32a0fef1-89f20540";
        String YOUR_DOMAIN_NAME = "sandboxa7b6dd1a801c4086899a930143195348.mailgun.org";


        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + YOUR_DOMAIN_NAME + "/messages")
                .basicAuth("api", API_KEY)
                .queryString("from", "Excited User kill252510@gmail.com")
                .queryString("to", emailMessage.getTo())
                .queryString("subject", emailMessage.getSubject())
                .queryString("text", emailMessage.getBody())
                .asJson();
        System.out.println(request.getBody());
        System.out.println(request.getStatus());
    }
}
