package com.liujun.controller;

import com.liujun.entity.Experience;
import com.liujun.entity.Resume;
import com.liujun.service.t.IResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/20 0020.
 */

@Controller
public class ResumeAction {
    @Resource
    private IResumeService resumeService;

    @RequestMapping("/t")
    public void t() {
        try {
            System.out.println("t");


//            Resume resume = this.resumeService.getById(17);
//            Experience exp = new Experience();
//            resume.getExpList().add(exp);
//
//            this.resumeService.u(resume);
            Resume resume = new Resume();
            resume = this.resumeService.add(resume);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
