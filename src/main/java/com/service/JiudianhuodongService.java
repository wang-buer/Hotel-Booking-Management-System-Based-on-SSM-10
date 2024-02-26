package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianhuodongView;


/**
 * 酒店活动
 *
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
public interface JiudianhuodongService extends IService<JiudianhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianhuodongVO> selectListVO(Wrapper<JiudianhuodongEntity> wrapper);
   	
   	JiudianhuodongVO selectVO(@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);
   	
   	List<JiudianhuodongView> selectListView(Wrapper<JiudianhuodongEntity> wrapper);
   	
   	JiudianhuodongView selectView(@Param("ew") Wrapper<JiudianhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianhuodongEntity> wrapper);
   	
}

