package com.nobody;

import com.nobody.config.UserServiceImplConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Test
    void test() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(UserServiceImplConfig.class);
    }

}
