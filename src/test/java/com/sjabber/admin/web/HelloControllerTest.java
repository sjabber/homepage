package com.sjabber.admin.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) //Note 스프링부트 테스트와 JUnit 사이에 연결자 역할을 수행한다.
@WebMvcTest(controllers = HelloController.class)
// Web(Spring MVC)에 집중할수 있는 어노테이션, 여기선 컨트롤러만 사용하기 때문에 선언한다.
// Note @Controller, @ControllerAdvice를 사용가능하며
//  @Service, @Component, @Repository 등은 사용이 불가능
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 빈을 주입받는다.
    private MockMvc mvc;
    // 웹 API 를 테스트할 때 사용한다.
    // 스프링 MVC 테스트의 시작점
    // 이 클래스를 통해 HTTP GET, POST 등에대한 API 테스트를 할 수 있다.

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}