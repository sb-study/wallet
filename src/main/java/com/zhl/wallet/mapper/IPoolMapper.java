package com.zhl.wallet.mapper;

import com.zhl.wallet.entity.Pool;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPoolMapper {
    @Select("select * from pool where code = #{code}")
    Pool get(String code);

    @Insert("INSERT INTO pool (code,type,date,plus,name) VALUES (#{code},#{type},#{date},#{plus},#{name})")
//    @Options(useGeneratedKeys=true, keyProperty="code", keyColumn="code")//自动获取生成的主键，这里用不上了
    int insert(Pool pool);

    @Select("select * from pool")
    List<Pool> lists();
}
