package com.dao;

import com.entity.KechengchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengchengjiVO;
import com.entity.view.KechengchengjiView;


/**
 * 课程成绩
 * 
 * @author 
 * @email 
 * @date 2021-03-30 11:42:10
 */
public interface KechengchengjiDao extends BaseMapper<KechengchengjiEntity> {
	
	List<KechengchengjiVO> selectListVO(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
	KechengchengjiVO selectVO(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
	List<KechengchengjiView> selectListView(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);

	List<KechengchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
	KechengchengjiView selectView(@Param("ew") Wrapper<KechengchengjiEntity> wrapper);
	
}
