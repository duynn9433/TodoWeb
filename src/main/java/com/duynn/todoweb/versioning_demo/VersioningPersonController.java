package com.duynn.todoweb.versioning_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("v1/person")
    public PersonV1 get1stPerson(){
        return new PersonV1("duynn");
    }

    @GetMapping("v2/person")
    public PersonV2 get2ndPerson(){
        return new PersonV2(new Name("nguyen","duy"));
    }
    @GetMapping(path = "person", params = {"version=1"})
    public PersonV1 get1stPersonReqParam(){
        return new PersonV1("duynn");
    }

    @GetMapping(path = "person", params = {"version=2"})
    public PersonV2 get2ndPersonReqParam(){
        return new PersonV2(new Name("nguyen","duy"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader() {
        return new PersonV1("duynn");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader() {
        return new PersonV2(new Name("nguyen","duy"));
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader() {
        return new PersonV1("duynn");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader() {
        return new PersonV2(new Name("nguyen","duy"));
    }
}
