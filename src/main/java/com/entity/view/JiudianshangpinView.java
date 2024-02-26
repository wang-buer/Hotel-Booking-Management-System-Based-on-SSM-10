package com.entity.view;

import com.entity.JiudianshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
@TableName("jiudianshangpin")
public class JiudianshangpinView  extends JiudianshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudianshangpinView(){
	}
 
 	public JiudianshangpinView(JiudianshangpinEntity jiudianshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, jiudianshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
