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


import com.dao.KechengchengjiDao;
import com.entity.KechengchengjiEntity;
import com.service.KechengchengjiService;
import com.entity.vo.KechengchengjiVO;
import com.entity.view.KechengchengjiView;

@Service("kechengchengjiService")
public class KechengchengjiServiceImpl extends ServiceImpl<KechengchengjiDao, KechengchengjiEntity> implements KechengchengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengchengjiEntity> page = this.selectPage(
                new Query<KechengchengjiEntity>(params).getPage(),
                new EntityWrapper<KechengchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengchengjiEntity> wrapper) {
		  Page<KechengchengjiView> page =new Query<KechengchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengchengjiVO> selectListVO(Wrapper<KechengchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengchengjiVO selectVO(Wrapper<KechengchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengchengjiView> selectListView(Wrapper<KechengchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengchengjiView selectView(Wrapper<KechengchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
