package com.entity.view;

import com.entity.XueshengxuankeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生选课
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 11:42:10
 */
@TableName("xueshengxuanke")
public class XueshengxuankeView  extends XueshengxuankeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxuankeView(){
	}
 
 	public XueshengxuankeView(XueshengxuankeEntity xueshengxuankeEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxuankeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
