package com.dao;

import com.entity.QuxiaoyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaoyudingVO;
import com.entity.view.QuxiaoyudingView;


/**
 * 取消预订
 * 
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
public interface QuxiaoyudingDao extends BaseMapper<QuxiaoyudingEntity> {
	
	List<QuxiaoyudingVO> selectListVO(@Param("ew") Wrapper<QuxiaoyudingEntity> wrapper);
	
	QuxiaoyudingVO selectVO(@Param("ew") Wrapper<QuxiaoyudingEntity> wrapper);
	
	List<QuxiaoyudingView> selectListView(@Param("ew") Wrapper<QuxiaoyudingEntity> wrapper);

	List<QuxiaoyudingView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoyudingEntity> wrapper);
	
	QuxiaoyudingView selectView(@Param("ew") Wrapper<QuxiaoyudingEntity> wrapper);
	
}
