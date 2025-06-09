package com.entity.view;

import com.entity.BinglicaijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病例采集
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
@TableName("binglicaiji")
public class BinglicaijiView  extends BinglicaijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BinglicaijiView(){
	}
 
 	public BinglicaijiView(BinglicaijiEntity binglicaijiEntity){
 	try {
			BeanUtils.copyProperties(this, binglicaijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
