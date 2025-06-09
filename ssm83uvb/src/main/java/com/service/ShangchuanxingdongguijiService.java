package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchuanxingdongguijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchuanxingdongguijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchuanxingdongguijiView;


/**
 * 上传行动轨迹
 *
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface ShangchuanxingdongguijiService extends IService<ShangchuanxingdongguijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchuanxingdongguijiVO> selectListVO(Wrapper<ShangchuanxingdongguijiEntity> wrapper);
   	
   	ShangchuanxingdongguijiVO selectVO(@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);
   	
   	List<ShangchuanxingdongguijiView> selectListView(Wrapper<ShangchuanxingdongguijiEntity> wrapper);
   	
   	ShangchuanxingdongguijiView selectView(@Param("ew") Wrapper<ShangchuanxingdongguijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchuanxingdongguijiEntity> wrapper);
   	
}

