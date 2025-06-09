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


import com.dao.BingrenzhiliaozhuangkuangDao;
import com.entity.BingrenzhiliaozhuangkuangEntity;
import com.service.BingrenzhiliaozhuangkuangService;
import com.entity.vo.BingrenzhiliaozhuangkuangVO;
import com.entity.view.BingrenzhiliaozhuangkuangView;

@Service("bingrenzhiliaozhuangkuangService")
public class BingrenzhiliaozhuangkuangServiceImpl extends ServiceImpl<BingrenzhiliaozhuangkuangDao, BingrenzhiliaozhuangkuangEntity> implements BingrenzhiliaozhuangkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingrenzhiliaozhuangkuangEntity> page = this.selectPage(
                new Query<BingrenzhiliaozhuangkuangEntity>(params).getPage(),
                new EntityWrapper<BingrenzhiliaozhuangkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper) {
		  Page<BingrenzhiliaozhuangkuangView> page =new Query<BingrenzhiliaozhuangkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingrenzhiliaozhuangkuangVO> selectListVO(Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingrenzhiliaozhuangkuangVO selectVO(Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingrenzhiliaozhuangkuangView> selectListView(Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingrenzhiliaozhuangkuangView selectView(Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
