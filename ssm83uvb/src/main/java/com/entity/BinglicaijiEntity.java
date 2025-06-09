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
 * 病例采集
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
@TableName("binglicaiji")
public class BinglicaijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BinglicaijiEntity() {
		
	}
	
	public BinglicaijiEntity(T t) {
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
	 * 住院号
	 */
					
	private String zhuyuanhao;
	
	/**
	 * 入院时间
	 */
					
	private String ruyuanshijian;
	
	/**
	 * 病程中所出现状况
	 */
					
	private String bingchengzhongsuochuxianzhuangkuang;
	
	/**
	 * 家族聚集发病
	 */
					
	private String jiazujujifabing;
	
	/**
	 * 是否核酸检测
	 */
					
	private String shifouhesuanjiance;
	
	/**
	 * 接触湖北省内人
	 */
					
	private String jiechuhubeishengneiren;
	
	/**
	 * 既往病史
	 */
					
	private String jiwangbingshi;
	
	/**
	 * 病人照片
	 */
					
	private String bingrenzhaopian;
	
	
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
	 * 设置：住院号
	 */
	public void setZhuyuanhao(String zhuyuanhao) {
		this.zhuyuanhao = zhuyuanhao;
	}
	/**
	 * 获取：住院号
	 */
	public String getZhuyuanhao() {
		return zhuyuanhao;
	}
	/**
	 * 设置：入院时间
	 */
	public void setRuyuanshijian(String ruyuanshijian) {
		this.ruyuanshijian = ruyuanshijian;
	}
	/**
	 * 获取：入院时间
	 */
	public String getRuyuanshijian() {
		return ruyuanshijian;
	}
	/**
	 * 设置：病程中所出现状况
	 */
	public void setBingchengzhongsuochuxianzhuangkuang(String bingchengzhongsuochuxianzhuangkuang) {
		this.bingchengzhongsuochuxianzhuangkuang = bingchengzhongsuochuxianzhuangkuang;
	}
	/**
	 * 获取：病程中所出现状况
	 */
	public String getBingchengzhongsuochuxianzhuangkuang() {
		return bingchengzhongsuochuxianzhuangkuang;
	}
	/**
	 * 设置：家族聚集发病
	 */
	public void setJiazujujifabing(String jiazujujifabing) {
		this.jiazujujifabing = jiazujujifabing;
	}
	/**
	 * 获取：家族聚集发病
	 */
	public String getJiazujujifabing() {
		return jiazujujifabing;
	}
	/**
	 * 设置：是否核酸检测
	 */
	public void setShifouhesuanjiance(String shifouhesuanjiance) {
		this.shifouhesuanjiance = shifouhesuanjiance;
	}
	/**
	 * 获取：是否核酸检测
	 */
	public String getShifouhesuanjiance() {
		return shifouhesuanjiance;
	}
	/**
	 * 设置：接触湖北省内人
	 */
	public void setJiechuhubeishengneiren(String jiechuhubeishengneiren) {
		this.jiechuhubeishengneiren = jiechuhubeishengneiren;
	}
	/**
	 * 获取：接触湖北省内人
	 */
	public String getJiechuhubeishengneiren() {
		return jiechuhubeishengneiren;
	}
	/**
	 * 设置：既往病史
	 */
	public void setJiwangbingshi(String jiwangbingshi) {
		this.jiwangbingshi = jiwangbingshi;
	}
	/**
	 * 获取：既往病史
	 */
	public String getJiwangbingshi() {
		return jiwangbingshi;
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
