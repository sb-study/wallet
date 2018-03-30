package com.zhl.wallet.service;

import com.zhl.wallet.entity.Pool;

import java.util.List;

public interface DemoService {
    Object get(String code);
    int insert(Pool pool);
    List<Pool> lists();
}
