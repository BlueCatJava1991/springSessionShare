package com.ikejie.test;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	
	@RequestMapping("/login")
    @ResponseBody
    String login() {
        return "login sucess!";
    }
	/**
	 * 启动项目
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param args
	* @param @throws Exception    设定文件 
	* @return void    返回类型 
	* @throws
	 */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
    
    @RequestMapping(value = "/first", method = RequestMethod.GET)  
    @ResponseBody
    public Map<String, Object> firstResp (HttpServletRequest request){  
        Map<String, Object> map = new HashMap<>();  
        request.getSession().setAttribute("request Url", request.getRequestURL());  
        map.put("request Url", request.getRequestURL());  
        return map;  
    }  
    
    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    @ResponseBody
    public Object sessions (HttpServletRequest request){  
        Map<String, Object> map = new HashMap<>();  
        map.put("sessionId", request.getSession().getId());  
        map.put("message", request.getSession().getAttribute("map"));  
        return map;  
    }  
    
}
