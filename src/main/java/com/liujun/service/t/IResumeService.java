package com.liujun.service.t;

import com.liujun.entity.Resume;

/**
 * Created by Administrator on 2016/7/20 0020.
 */
public interface IResumeService {
    Resume getById(long id);

    void u(Resume resume);

    Resume add(Resume resume);
}
