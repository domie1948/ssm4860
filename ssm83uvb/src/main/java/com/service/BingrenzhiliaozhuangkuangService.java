package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingrenzhiliaozhuangkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingrenzhiliaozhuangkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingrenzhiliaozhuangkuangView;


/**
 * 病人治疗状况
 *
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface BingrenzhiliaozhuangkuangService extends IService<BingrenzhiliaozhuangkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingrenzhiliaozhuangkuangVO> selectListVO(Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
   	
   	BingrenzhiliaozhuangkuangVO selectVO(@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
   	
   	List<BingrenzhiliaozhuangkuangView> selectListView(Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
   	
   	BingrenzhiliaozhuangkuangView selectView(@Param("ew") Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingrenzhiliaozhuangkuangEntity> wrapper);
   	
}

