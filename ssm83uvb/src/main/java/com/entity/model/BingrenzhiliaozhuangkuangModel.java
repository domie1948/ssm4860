package com.entity.model;

import com.entity.BingrenzhiliaozhuangkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 病人治疗状况
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public class BingrenzhiliaozhuangkuangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 当前状况
	 */
	
	private String dangqianzhuangkuang;
		
	/**
	 * 治疗状态
	 */
	
	private String zhiliaozhuangtai;
		
	/**
	 * 主治医生
	 */
	
	private String zhuzhiyisheng;
		
	/**
	 * 诊断结果
	 */
	
	private String zhenduanjieguo;
		
	/**
	 * 心理状况
	 */
	
	private String xinlizhuangkuang;
		
	/**
	 * 护理状况
	 */
	
	private String hulizhuangkuang;
		
	/**
	 * 病人满意度
	 */
	
	private String bingrenmanyidu;
				
	
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
	 * 设置：当前状况
	 */
	 
	public void setDangqianzhuangkuang(String dangqianzhuangkuang) {
		this.dangqianzhuangkuang = dangqianzhuangkuang;
	}
	
	/**
	 * 获取：当前状况
	 */
	public String getDangqianzhuangkuang() {
		return dangqianzhuangkuang;
	}
				
	
	/**
	 * 设置：治疗状态
	 */
	 
	public void setZhiliaozhuangtai(String zhiliaozhuangtai) {
		this.zhiliaozhuangtai = zhiliaozhuangtai;
	}
	
	/**
	 * 获取：治疗状态
	 */
	public String getZhiliaozhuangtai() {
		return zhiliaozhuangtai;
	}
				
	
	/**
	 * 设置：主治医生
	 */
	 
	public void setZhuzhiyisheng(String zhuzhiyisheng) {
		this.zhuzhiyisheng = zhuzhiyisheng;
	}
	
	/**
	 * 获取：主治医生
	 */
	public String getZhuzhiyisheng() {
		return zhuzhiyisheng;
	}
				
	
	/**
	 * 设置：诊断结果
	 */
	 
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
				
	
	/**
	 * 设置：心理状况
	 */
	 
	public void setXinlizhuangkuang(String xinlizhuangkuang) {
		this.xinlizhuangkuang = xinlizhuangkuang;
	}
	
	/**
	 * 获取：心理状况
	 */
	public String getXinlizhuangkuang() {
		return xinlizhuangkuang;
	}
				
	
	/**
	 * 设置：护理状况
	 */
	 
	public void setHulizhuangkuang(String hulizhuangkuang) {
		this.hulizhuangkuang = hulizhuangkuang;
	}
	
	/**
	 * 获取：护理状况
	 */
	public String getHulizhuangkuang() {
		return hulizhuangkuang;
	}
				
	
	/**
	 * 设置：病人满意度
	 */
	 
	public void setBingrenmanyidu(String bingrenmanyidu) {
		this.bingrenmanyidu = bingrenmanyidu;
	}
	
	/**
	 * 获取：病人满意度
	 */
	public String getBingrenmanyidu() {
		return bingrenmanyidu;
	}
			
}
