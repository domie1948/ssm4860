package com.dao;

import com.entity.BingrenzhiliaozhuangkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingrenzhiliaozhuangkuangVO;
import com.entity.view.BingrenzhiliaozhuangkuangView;


/**
 * 病人治疗状况
 * 
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface BingrenzhiliaozhuangkuangDao extends BaseMapper<BingrenzhiliaozhuangkuangEntity> {
	
	List<BingrenzhiliaozhuangkuangVO> selectListVO(@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
	
	BingrenzhiliaozhuangkuangVO selectVO(@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
	
	List<BingrenzhiliaozhuangkuangView> selectListView(@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);

	List<BingrenzhiliaozhuangkuangView> selectListView(Pagination page,@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
	
	BingrenzhiliaozhuangkuangView selectView(@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
	
}
