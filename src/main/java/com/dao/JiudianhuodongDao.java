package com.dao;

import com.entity.JiudianhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianhuodongVO;
import com.entity.view.JiudianhuodongView;


/**
 * 酒店活动
 * 
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
public interface JiudianhuodongDao extends BaseMapper<JiudianhuodongEntity> {
	
	List<JiudianhuodongVO> selectListVO(@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);
	
	JiudianhuodongVO selectVO(@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);
	
	List<JiudianhuodongView> selectListView(@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);

	List<JiudianhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);
	
	JiudianhuodongView selectView(@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);
	
}
