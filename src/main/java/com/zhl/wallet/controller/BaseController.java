package com.zhl.wallet.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhl.wallet.entity.Pool;
import com.zhl.wallet.mapper.IPoolMapper;
import com.zhl.wallet.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class BaseController {
    @Autowired
    private DemoService service;

    @GetMapping("/get")
    public Object getPool(@RequestParam("code") String code){
        return this.service.get(code);
    }
    @PostMapping("/add")
    public Object add(@RequestBody Pool pool){
        return this.service.insert(pool);
    }
    //分页获取
    @GetMapping("/lists")
    public Object lists(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,2);
        List<Pool> pools =  this.service.lists();
        PageInfo<Pool> page = new PageInfo<>(pools);
        return page.getList();
    }
}
