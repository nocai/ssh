package com.liujun.service.t.impl;

import com.liujun.dao.t.IResumeDao;
import com.liujun.entity.Resume;
import com.liujun.service.t.IResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/20 0020.
 */
@Service
public class ResumeServiceImpl implements IResumeService {
    @Resource
    private IResumeDao resumeDao;


    @Override
    public Resume getById(long id) {
        return this.resumeDao.getById(id);
    }

    @Override
    public void u(Resume resume) {
        System.out.println(resume);
    }

    @Override
    public Resume add(Resume resume) {
        this.resumeDao.save(resume);
        return resume;
    }
}
