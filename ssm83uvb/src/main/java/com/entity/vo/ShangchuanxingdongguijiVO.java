package com.entity.vo;

import com.entity.ShangchuanxingdongguijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 上传行动轨迹
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public class ShangchuanxingdongguijiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 上传出行报告
	 */
	
	private String shangchuanchuxingbaogao;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：上传出行报告
	 */
	 
	public void setShangchuanchuxingbaogao(String shangchuanchuxingbaogao) {
		this.shangchuanchuxingbaogao = shangchuanchuxingbaogao;
	}
	
	/**
	 * 获取：上传出行报告
	 */
	public String getShangchuanchuxingbaogao() {
		return shangchuanchuxingbaogao;
	}
			
}
