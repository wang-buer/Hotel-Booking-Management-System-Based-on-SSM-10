package com.dao;

import com.entity.JiudianshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianshangpinVO;
import com.entity.view.JiudianshangpinView;


/**
 * 酒店商品
 * 
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
public interface JiudianshangpinDao extends BaseMapper<JiudianshangpinEntity> {
	
	List<JiudianshangpinVO> selectListVO(@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);
	
	JiudianshangpinVO selectVO(@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);
	
	List<JiudianshangpinView> selectListView(@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);

	List<JiudianshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);
	
	JiudianshangpinView selectView(@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);
	
}
