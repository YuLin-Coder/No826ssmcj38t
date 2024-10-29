package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxuankeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxuankeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxuankeView;


/**
 * 学生选课
 *
 * @author 
 * @email 
 * @date 2021-03-30 11:42:10
 */
public interface XueshengxuankeService extends IService<XueshengxuankeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxuankeVO> selectListVO(Wrapper<XueshengxuankeEntity> wrapper);
   	
   	XueshengxuankeVO selectVO(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);
   	
   	List<XueshengxuankeView> selectListView(Wrapper<XueshengxuankeEntity> wrapper);
   	
   	XueshengxuankeView selectView(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxuankeEntity> wrapper);
   	
}

