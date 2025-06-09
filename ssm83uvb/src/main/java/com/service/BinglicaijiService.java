package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BinglicaijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BinglicaijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BinglicaijiView;


/**
 * 病例采集
 *
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface BinglicaijiService extends IService<BinglicaijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglicaijiVO> selectListVO(Wrapper<BinglicaijiEntity> wrapper);
   	
   	BinglicaijiVO selectVO(@Param("ew") Wrapper<BinglicaijiEntity> wrapper);
   	
   	List<BinglicaijiView> selectListView(Wrapper<BinglicaijiEntity> wrapper);
   	
   	BinglicaijiView selectView(@Param("ew") Wrapper<BinglicaijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglicaijiEntity> wrapper);
   	
}

