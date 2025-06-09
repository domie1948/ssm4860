package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病人治疗状况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
@TableName("bingrenzhiliaozhuangkuang")
public class BingrenzhiliaozhuangkuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingrenzhiliaozhuangkuangEntity() {
		
	}
	
	public BingrenzhiliaozhuangkuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
