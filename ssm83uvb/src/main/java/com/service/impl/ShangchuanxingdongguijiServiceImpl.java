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


import com.dao.ShangchuanxingdongguijiDao;
import com.entity.ShangchuanxingdongguijiEntity;
import com.service.ShangchuanxingdongguijiService;
import com.entity.vo.ShangchuanxingdongguijiVO;
import com.entity.view.ShangchuanxingdongguijiView;

@Service("shangchuanxingdongguijiService")
public class ShangchuanxingdongguijiServiceImpl extends ServiceImpl<ShangchuanxingdongguijiDao, ShangchuanxingdongguijiEntity> implements ShangchuanxingdongguijiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchuanxingdongguijiEntity> page = this.selectPage(
                new Query<ShangchuanxingdongguijiEntity>(params).getPage(),
                new EntityWrapper<ShangchuanxingdongguijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchuanxingdongguijiEntity> wrapper) {
		  Page<ShangchuanxingdongguijiView> page =new Query<ShangchuanxingdongguijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchuanxingdongguijiVO> selectListVO(Wrapper<ShangchuanxingdongguijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchuanxingdongguijiVO selectVO(Wrapper<ShangchuanxingdongguijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchuanxingdongguijiView> selectListView(Wrapper<ShangchuanxingdongguijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchuanxingdongguijiView selectView(Wrapper<ShangchuanxingdongguijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
