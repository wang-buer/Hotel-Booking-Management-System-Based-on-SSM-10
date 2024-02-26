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


import com.dao.JiudianhuodongDao;
import com.entity.JiudianhuodongEntity;
import com.service.JiudianhuodongService;
import com.entity.vo.JiudianhuodongVO;
import com.entity.view.JiudianhuodongView;

@Service("jiudianhuodongService")
public class JiudianhuodongServiceImpl extends ServiceImpl<JiudianhuodongDao, JiudianhuodongEntity> implements JiudianhuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianhuodongEntity> page = this.selectPage(
                new Query<JiudianhuodongEntity>(params).getPage(),
                new EntityWrapper<JiudianhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianhuodongEntity> wrapper) {
		  Page<JiudianhuodongView> page =new Query<JiudianhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianhuodongVO> selectListVO(Wrapper<JiudianhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianhuodongVO selectVO(Wrapper<JiudianhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianhuodongView> selectListView(Wrapper<JiudianhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianhuodongView selectView(Wrapper<JiudianhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
