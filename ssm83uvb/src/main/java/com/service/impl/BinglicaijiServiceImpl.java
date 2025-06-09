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


import com.dao.BinglicaijiDao;
import com.entity.BinglicaijiEntity;
import com.service.BinglicaijiService;
import com.entity.vo.BinglicaijiVO;
import com.entity.view.BinglicaijiView;

@Service("binglicaijiService")
public class BinglicaijiServiceImpl extends ServiceImpl<BinglicaijiDao, BinglicaijiEntity> implements BinglicaijiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglicaijiEntity> page = this.selectPage(
                new Query<BinglicaijiEntity>(params).getPage(),
                new EntityWrapper<BinglicaijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglicaijiEntity> wrapper) {
		  Page<BinglicaijiView> page =new Query<BinglicaijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BinglicaijiVO> selectListVO(Wrapper<BinglicaijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BinglicaijiVO selectVO(Wrapper<BinglicaijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BinglicaijiView> selectListView(Wrapper<BinglicaijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglicaijiView selectView(Wrapper<BinglicaijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
