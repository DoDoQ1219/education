package com.education.core.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.education.business.service.system.SystemDictValueService;
import com.education.common.base.BaseController;
import com.education.common.constants.CacheKey;
import com.education.common.model.PageInfo;
import com.education.common.utils.Result;
import com.education.model.entity.SystemDictValue;
import com.education.model.request.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;


/**
 * 字典值管理接口
 * @author zengjintao
 * @version 1.0
 * @create_at 2020/11/16 10:26
 */
@RestController
@RequestMapping("/api/dictValue")
public class DictValueController extends BaseController {

    @Autowired
    private SystemDictValueService systemDictValueService;

    /**
     * 字典类型值列表
     * @param dictId
     * @return
     */
    @GetMapping("selectByDictId")
    public Result<PageInfo<SystemDictValue>> selectByDictId(PageParam pageParam, Integer dictId) {
        LambdaQueryWrapper<SystemDictValue> queryWrapper = Wrappers.<SystemDictValue>lambdaQuery()
                .eq(SystemDictValue::getSystemDictId, dictId);
        return Result.success(systemDictValueService.selectPage(pageParam, queryWrapper));
    }

    /**
     * 根据类型获取字典值列表
     * @param dictType
     * @return
     */
    @GetMapping("selectByDictType")
    @Cacheable(cacheNames = CacheKey.SYSTEM_DICT_VALUE, key = "#dictType")
    public Result selectByDictType(String dictType) {
        return Result.success(systemDictValueService.selectByDictType(dictType));
    }

    /**
     * 添加或修改字典类型值
     * @param systemDictValue
     * @return
     */
    @PostMapping
    @CacheEvict(cacheNames = CacheKey.SYSTEM_DICT_VALUE, allEntries = true)
    public Result saveOrUpdate(@RequestBody SystemDictValue systemDictValue) {
        systemDictValueService.saveOrUpdate(systemDictValue);
        return Result.success();
    }

    /**
     * 删除字典类型值
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    @CacheEvict(cacheNames = CacheKey.SYSTEM_DICT_VALUE, allEntries = true)
    public Result deleteById(@PathVariable Integer id) {
        systemDictValueService.removeById(id);
        return Result.success();
    }
}
