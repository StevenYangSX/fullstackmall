package com.atguigu.fullstackmall.product.dao;

import com.atguigu.fullstackmall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author steven
 * @email steven@gmail.com
 * @date 2023-05-25 14:32:03
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
