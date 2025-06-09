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


import com.dao.ShangchuanhesuanjiancebaogaoDao;
import com.entity.ShangchuanhesuanjiancebaogaoEntity;
import com.service.ShangchuanhesuanjiancebaogaoService;
import com.entity.vo.ShangchuanhesuanjiancebaogaoVO;
import com.entity.view.ShangchuanhesuanjiancebaogaoView;

@Service("shangchuanhesuanjiancebaogaoService")
public class ShangchuanhesuanjiancebaogaoServiceImpl extends ServiceImpl<ShangchuanhesuanjiancebaogaoDao, ShangchuanhesuanjiancebaogaoEntity> implements ShangchuanhesuanjiancebaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchuanhesuanjiancebaogaoEntity> page = this.selectPage(
                new Query<ShangchuanhesuanjiancebaogaoEntity>(params).getPage(),
                new EntityWrapper<ShangchuanhesuanjiancebaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper) {
		  Page<ShangchuanhesuanjiancebaogaoView> page =new Query<ShangchuanhesuanjiancebaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchuanhesuanjiancebaogaoVO> selectListVO(Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchuanhesuanjiancebaogaoVO selectVO(Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchuanhesuanjiancebaogaoView> selectListView(Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchuanhesuanjiancebaogaoView selectView(Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
