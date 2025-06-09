package com.entity.vo;

import com.entity.YishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医生
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public class YishengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 所在医院
	 */
	
	private String suozaiyiyuan;
		
	/**
	 * 所在部门
	 */
	
	private String suozaibumen;
		
	/**
	 * 预约星期段
	 */
	
	private String yuyuexingqiduan;
		
	/**
	 * 预约时间段
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijianduan;
		
	/**
	 * 预约金额
	 */
	
	private Integer yuyuejine;
		
	/**
	 * 医生照片
	 */
	
	private String yishengzhaopian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
				
	
	/**
	 * 设置：所在医院
	 */
	 
	public void setSuozaiyiyuan(String suozaiyiyuan) {
		this.suozaiyiyuan = suozaiyiyuan;
	}
	
	/**
	 * 获取：所在医院
	 */
	public String getSuozaiyiyuan() {
		return suozaiyiyuan;
	}
				
	
	/**
	 * 设置：所在部门
	 */
	 
	public void setSuozaibumen(String suozaibumen) {
		this.suozaibumen = suozaibumen;
	}
	
	/**
	 * 获取：所在部门
	 */
	public String getSuozaibumen() {
		return suozaibumen;
	}
				
	
	/**
	 * 设置：预约星期段
	 */
	 
	public void setYuyuexingqiduan(String yuyuexingqiduan) {
		this.yuyuexingqiduan = yuyuexingqiduan;
	}
	
	/**
	 * 获取：预约星期段
	 */
	public String getYuyuexingqiduan() {
		return yuyuexingqiduan;
	}
				
	
	/**
	 * 设置：预约时间段
	 */
	 
	public void setYuyueshijianduan(Date yuyueshijianduan) {
		this.yuyueshijianduan = yuyueshijianduan;
	}
	
	/**
	 * 获取：预约时间段
	 */
	public Date getYuyueshijianduan() {
		return yuyueshijianduan;
	}
				
	
	/**
	 * 设置：预约金额
	 */
	 
	public void setYuyuejine(Integer yuyuejine) {
		this.yuyuejine = yuyuejine;
	}
	
	/**
	 * 获取：预约金额
	 */
	public Integer getYuyuejine() {
		return yuyuejine;
	}
				
	
	/**
	 * 设置：医生照片
	 */
	 
	public void setYishengzhaopian(String yishengzhaopian) {
		this.yishengzhaopian = yishengzhaopian;
	}
	
	/**
	 * 获取：医生照片
	 */
	public String getYishengzhaopian() {
		return yishengzhaopian;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
