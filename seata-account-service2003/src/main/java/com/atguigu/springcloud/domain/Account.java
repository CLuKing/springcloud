package com.atguigu.springcloud.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * (Account)表实体类
 *
 * @author makejava
 * @since 2024-02-29 01:45:58
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account  {
    private Long id;

    //用户id
    private Long userId;
    //总额度
    private BigDecimal total;
    //已用余额
    private BigDecimal used;
    //剩余可用额度
    private BigDecimal residue;
    
}
