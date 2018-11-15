package com.zhl.wallet.controller;

import com.zhl.wallet.service.ILinuxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spark")
public class SparkController {
    @Autowired
    private ILinuxService linuxService;
    @GetMapping("bmaster/{cmd}")
    public Object bmaster(@PathVariable("cmd") String cmd){
        return this.linuxService.bmaster(cmd);
    }
}
