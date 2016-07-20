package com.liujun.dao.t.impl;

import com.liujun.dao.HibernateDao;
import com.liujun.dao.t.IResumeDao;
import com.liujun.entity.Resume;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/7/20 0020.
 */
@Repository
public class ResumeDaoImpl extends HibernateDao<Resume, Long> implements IResumeDao {
}
