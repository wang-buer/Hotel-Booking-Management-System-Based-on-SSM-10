package com.entity.view;

import com.entity.JiudianhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
@TableName("jiudianhuodong")
public class JiudianhuodongView  extends JiudianhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudianhuodongView(){
	}
 
 	public JiudianhuodongView(JiudianhuodongEntity jiudianhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, jiudianhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
