package com.zhl.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pool {
    private String code;
    private Integer type;
    private Date date;
    private Integer plus;
    private String name;
}
