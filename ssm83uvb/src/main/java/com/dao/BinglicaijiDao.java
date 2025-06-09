package com.dao;

import com.entity.BinglicaijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BinglicaijiVO;
import com.entity.view.BinglicaijiView;


/**
 * 病例采集
 * 
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface BinglicaijiDao extends BaseMapper<BinglicaijiEntity> {
	
	List<BinglicaijiVO> selectListVO(@Param("ew") Wrapper<BinglicaijiEntity> wrapper);
	
	BinglicaijiVO selectVO(@Param("ew") Wrapper<BinglicaijiEntity> wrapper);
	
	List<BinglicaijiView> selectListView(@Param("ew") Wrapper<BinglicaijiEntity> wrapper);

	List<BinglicaijiView> selectListView(Pagination page,@Param("ew") Wrapper<BinglicaijiEntity> wrapper);
	
	BinglicaijiView selectView(@Param("ew") Wrapper<BinglicaijiEntity> wrapper);
	
}
