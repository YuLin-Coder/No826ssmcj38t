package com.entity.view;

import com.entity.KechengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 11:42:10
 */
@TableName("kechengchengji")
public class KechengchengjiView  extends KechengchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengchengjiView(){
	}
 
 	public KechengchengjiView(KechengchengjiEntity kechengchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, kechengchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
