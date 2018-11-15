package com.zhl.wallet.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.zhl.wallet.service.ILinuxService;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
@Component
public class LinuxServiceImpl implements ILinuxService{
    @Override
    public String bmaster(String cmd) {
        InputStream in = null;
        try {
            Process pro = Runtime.getRuntime().exec(new String[]{"sh","-c",
                    cmd});
            int i = pro.waitFor();
            if(i==0) {
                in = pro.getInputStream();
                BufferedReader read = new BufferedReader(new InputStreamReader(in));
                String result = read.readLine();
                if(StringUtils.isEmpty(result)) {
                    return "success";
                }else {
                    return result;
                }
            }else{
                return "error";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
