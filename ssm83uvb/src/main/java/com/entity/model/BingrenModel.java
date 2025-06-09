package com.entity.model;

import com.entity.BingrenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 病人
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public class BingrenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 身高CM
	 */
	
	private Integer shengaocm;
		
	/**
	 * 出生
	 */
	
	private String chusheng;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 体重KG
	 */
	
	private Integer tizhongkg;
		
	/**
	 * 籍贯
	 */
	
	private String jiguan;
		
	/**
	 * 居住地
	 */
	
	private String juzhudi;
		
	/**
	 * 职业
	 */
	
	private String zhiye;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 病人照片
	 */
	
	private String bingrenzhaopian;
				
	
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
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：身高CM
	 */
	 
	public void setShengaocm(Integer shengaocm) {
		this.shengaocm = shengaocm;
	}
	
	/**
	 * 获取：身高CM
	 */
	public Integer getShengaocm() {
		return shengaocm;
	}
				
	
	/**
	 * 设置：出生
	 */
	 
	public void setChusheng(String chusheng) {
		this.chusheng = chusheng;
	}
	
	/**
	 * 获取：出生
	 */
	public String getChusheng() {
		return chusheng;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：体重KG
	 */
	 
	public void setTizhongkg(Integer tizhongkg) {
		this.tizhongkg = tizhongkg;
	}
	
	/**
	 * 获取：体重KG
	 */
	public Integer getTizhongkg() {
		return tizhongkg;
	}
				
	
	/**
	 * 设置：籍贯
	 */
	 
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	
	/**
	 * 获取：籍贯
	 */
	public String getJiguan() {
		return jiguan;
	}
				
	
	/**
	 * 设置：居住地
	 */
	 
	public void setJuzhudi(String juzhudi) {
		this.juzhudi = juzhudi;
	}
	
	/**
	 * 获取：居住地
	 */
	public String getJuzhudi() {
		return juzhudi;
	}
				
	
	/**
	 * 设置：职业
	 */
	 
	public void setZhiye(String zhiye) {
		this.zhiye = zhiye;
	}
	
	/**
	 * 获取：职业
	 */
	public String getZhiye() {
		return zhiye;
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
	 * 设置：病人照片
	 */
	 
	public void setBingrenzhaopian(String bingrenzhaopian) {
		this.bingrenzhaopian = bingrenzhaopian;
	}
	
	/**
	 * 获取：病人照片
	 */
	public String getBingrenzhaopian() {
		return bingrenzhaopian;
	}
			
}
