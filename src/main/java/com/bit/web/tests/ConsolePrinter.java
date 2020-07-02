package com.bit.web.tests;

import org.springframework.stereotype.Service;

@Service("cp")
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}