package com.duynn.todoweb.hello;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class SayHelloController {
    private MessageSource messageSource;

    public SayHelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @RequestMapping("/hello-world")
    public String helloworld(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default message", locale);
    }
}
