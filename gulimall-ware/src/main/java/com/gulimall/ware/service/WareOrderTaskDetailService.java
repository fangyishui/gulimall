package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.util.PageUtils;
import com.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author fang
 * @email fang@test.com
 * @date 2022-05-27 22:44:14
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

