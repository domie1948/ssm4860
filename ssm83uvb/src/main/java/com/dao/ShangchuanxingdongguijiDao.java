package com.dao;

import com.entity.ShangchuanxingdongguijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchuanxingdongguijiVO;
import com.entity.view.ShangchuanxingdongguijiView;


/**
 * 上传行动轨迹
 * 
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface ShangchuanxingdongguijiDao extends BaseMapper<ShangchuanxingdongguijiEntity> {
	
	List<ShangchuanxingdongguijiVO> selectListVO(@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);
	
	ShangchuanxingdongguijiVO selectVO(@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);
	
	List<ShangchuanxingdongguijiView> selectListView(@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);

	List<ShangchuanxingdongguijiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);
	
	ShangchuanxingdongguijiView selectView(@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);
	
}
