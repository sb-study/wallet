package com.zhl.wallet.service.impl;

import com.zhl.wallet.entity.Pool;
import com.zhl.wallet.mapper.IPoolMapper;
import com.zhl.wallet.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private IPoolMapper poolMapper;
    @Override
    public Object get(String code){
        return this.poolMapper.get(code);
    }

    @Transactional
    @Override
    public int insert(Pool pool) {
        return poolMapper.insert(pool);
    }

    @Override
    public List<Pool> lists() {
        return this.poolMapper.lists();
    }
}
