package com.ageservice;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "getAge")

public class AgeService implements com.generated.ageservice.AgeService {

    @WebMethod
    public String getAge(Integer naissance) {

        return "Votre âge est de " + (2017-naissance) + "ans";
    }
}

