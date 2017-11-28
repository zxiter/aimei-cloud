package com.union.aimei.provider.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.union.aimei.provider.user.mapper.MemberMapper;
import com.union.aimei.provider.user.model.Member;
import com.union.aimei.provider.user.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDemoServiceImpl implements UserDemoService {

    @Autowired(required = false)
    MemberMapper memberMapper;

    @Override
    public Member findOne(Long id) {

        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<Member> findList() {

        PageHelper.startPage(1, 10);
        List<Member> members = memberMapper.selectByExample(null);
        PageInfo<Member> memberPageInfo = new PageInfo<>(members);
        return memberPageInfo;
    }
}
