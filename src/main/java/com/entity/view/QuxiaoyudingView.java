package com.entity.view;

import com.entity.QuxiaoyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 取消预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 12:54:34
 */
@TableName("quxiaoyuding")
public class QuxiaoyudingView  extends QuxiaoyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaoyudingView(){
	}
 
 	public QuxiaoyudingView(QuxiaoyudingEntity quxiaoyudingEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaoyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
