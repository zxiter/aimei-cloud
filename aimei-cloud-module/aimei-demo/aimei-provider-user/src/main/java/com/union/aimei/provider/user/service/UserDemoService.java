package com.union.aimei.provider.user.service;

import com.github.pagehelper.PageInfo;
import com.union.aimei.provider.user.model.Member;

public interface UserDemoService {


    Member findOne(Long id);

    PageInfo<Member> findList();
}
