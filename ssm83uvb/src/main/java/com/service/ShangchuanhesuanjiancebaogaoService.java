package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchuanhesuanjiancebaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchuanhesuanjiancebaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchuanhesuanjiancebaogaoView;


/**
 * 上传核酸检测报告
 *
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public interface ShangchuanhesuanjiancebaogaoService extends IService<ShangchuanhesuanjiancebaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchuanhesuanjiancebaogaoVO> selectListVO(Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
   	
   	ShangchuanhesuanjiancebaogaoVO selectVO(@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
   	
   	List<ShangchuanhesuanjiancebaogaoView> selectListView(Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
   	
   	ShangchuanhesuanjiancebaogaoView selectView(@Param("ew") Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchuanhesuanjiancebaogaoEntity> wrapper);
   	
}

