package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianshangpinView;


/**
 * 酒店商品
 *
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
public interface JiudianshangpinService extends IService<JiudianshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianshangpinVO> selectListVO(Wrapper<JiudianshangpinEntity> wrapper);
   	
   	JiudianshangpinVO selectVO(@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);
   	
   	List<JiudianshangpinView> selectListView(Wrapper<JiudianshangpinEntity> wrapper);
   	
   	JiudianshangpinView selectView(@Param("ew") Wrapper<JiudianshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianshangpinEntity> wrapper);
   	
}

