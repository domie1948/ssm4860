package com.entity.model;

import com.entity.BinglicaijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 病例采集
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 22:00:12
 */
public class BinglicaijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
