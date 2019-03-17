package com.surpass.dream.web.controller.task.impl;

import com.surpass.dream.web.controller.task.TaskController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by li on 2019/3/17.
 */
@Controller
@RequestMapping(value = "/surpass/dream/web/task", method = {RequestMethod.POST, RequestMethod.GET})
public class TaskControllerImpl implements TaskController {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "hello world!";
    }
}
