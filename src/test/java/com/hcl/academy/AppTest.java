package com.hcl.academy;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void getHello() {

        System.out.println("#####################");
        System.out.println(System.getenv("TEST_HOST"));
    }
}
