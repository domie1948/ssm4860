package com.dao;

import com.entity.ShangchuanhesuanjiancebaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchuanhesuanjiancebaogaoVO;
import com.entity.view.ShangchuanhesuanjiancebaogaoView;


/**
 * 上传核酸检测报告
 * 
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface ShangchuanhesuanjiancebaogaoDao extends BaseMapper<ShangchuanhesuanjiancebaogaoEntity> {
	
	List<ShangchuanhesuanjiancebaogaoVO> selectListVO(@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
	
	ShangchuanhesuanjiancebaogaoVO selectVO(@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
	
	List<ShangchuanhesuanjiancebaogaoView> selectListView(@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);

	List<ShangchuanhesuanjiancebaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
	
	ShangchuanhesuanjiancebaogaoView selectView(@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
	
}
