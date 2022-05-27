package com.gulimall.coupon.dao;

import com.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fang
 * @email fang@test.com
 * @date 2022-05-27 22:35:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
