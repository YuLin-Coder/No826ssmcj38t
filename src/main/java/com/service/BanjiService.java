package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiView;


/**
 * 班级
 *
 * @author 
 * @email 
 * @date 2021-03-30 11:42:10
 */
public interface BanjiService extends IService<BanjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjiVO> selectListVO(Wrapper<BanjiEntity> wrapper);
   	
   	BanjiVO selectVO(@Param("ew") Wrapper<BanjiEntity> wrapper);
   	
   	List<BanjiView> selectListView(Wrapper<BanjiEntity> wrapper);
   	
   	BanjiView selectView(@Param("ew") Wrapper<BanjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjiEntity> wrapper);
   	
}

