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


import com.dao.BanjiDao;
import com.entity.BanjiEntity;
import com.service.BanjiService;
import com.entity.vo.BanjiVO;
import com.entity.view.BanjiView;

@Service("banjiService")
public class BanjiServiceImpl extends ServiceImpl<BanjiDao, BanjiEntity> implements BanjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjiEntity> page = this.selectPage(
                new Query<BanjiEntity>(params).getPage(),
                new EntityWrapper<BanjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjiEntity> wrapper) {
		  Page<BanjiView> page =new Query<BanjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjiVO> selectListVO(Wrapper<BanjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjiVO selectVO(Wrapper<BanjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjiView> selectListView(Wrapper<BanjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjiView selectView(Wrapper<BanjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
