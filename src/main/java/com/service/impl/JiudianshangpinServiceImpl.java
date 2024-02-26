package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiudianshangpinDao;
import com.entity.JiudianshangpinEntity;
import com.service.JiudianshangpinService;
import com.entity.vo.JiudianshangpinVO;
import com.entity.view.JiudianshangpinView;

@Service("jiudianshangpinService")
public class JiudianshangpinServiceImpl extends ServiceImpl<JiudianshangpinDao, JiudianshangpinEntity> implements JiudianshangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianshangpinEntity> page = this.selectPage(
                new Query<JiudianshangpinEntity>(params).getPage(),
                new EntityWrapper<JiudianshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianshangpinEntity> wrapper) {
		  Page<JiudianshangpinView> page =new Query<JiudianshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianshangpinVO> selectListVO(Wrapper<JiudianshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianshangpinVO selectVO(Wrapper<JiudianshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianshangpinView> selectListView(Wrapper<JiudianshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianshangpinView selectView(Wrapper<JiudianshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
