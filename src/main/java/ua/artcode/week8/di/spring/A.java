package ua.artcode.week8.di.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    public A() {
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
