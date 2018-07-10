package com.jiayun.providercontroller;

import com.jiayun.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LuoYJ on 2018/3/27.
 */
@RestController
public class FirstController {

    //为了能看到启动类中调用.properties()修改端口效果，将服务调用者请求的URL保存起来并返回。添加HttpServletRequest参数
    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId, HttpServletRequest request) {
        Person person = new Person("luoyongjia", personId, 23);
        person.setMessage(request.getRequestURL().toString());
        return person;
    }
}
