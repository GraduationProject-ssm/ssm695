package com.entity.model;

import com.entity.ZhuanjiaOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 专家挂号订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuanjiaOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 号
     */
    private String zhuanjiaOrderUuidNumber;


    /**
     * 专家
     */
    private Integer zhuanjiaId;


    /**
     * 患者
     */
    private Integer huanzheId;


    /**
     * 挂号日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date guahaoTime;


    /**
     * 时间段
     */
    private Integer shijianduanTypes;


    /**
     * 预约状态
     */
    private Integer zhuanjiaOrderYuyueTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：号
	 */
    public String getZhuanjiaOrderUuidNumber() {
        return zhuanjiaOrderUuidNumber;
    }


    /**
	 * 设置：号
	 */
    public void setZhuanjiaOrderUuidNumber(String zhuanjiaOrderUuidNumber) {
        this.zhuanjiaOrderUuidNumber = zhuanjiaOrderUuidNumber;
    }
    /**
	 * 获取：专家
	 */
    public Integer getZhuanjiaId() {
        return zhuanjiaId;
    }


    /**
	 * 设置：专家
	 */
    public void setZhuanjiaId(Integer zhuanjiaId) {
        this.zhuanjiaId = zhuanjiaId;
    }
    /**
	 * 获取：患者
	 */
    public Integer getHuanzheId() {
        return huanzheId;
    }


    /**
	 * 设置：患者
	 */
    public void setHuanzheId(Integer huanzheId) {
        this.huanzheId = huanzheId;
    }
    /**
	 * 获取：挂号日期
	 */
    public Date getGuahaoTime() {
        return guahaoTime;
    }


    /**
	 * 设置：挂号日期
	 */
    public void setGuahaoTime(Date guahaoTime) {
        this.guahaoTime = guahaoTime;
    }
    /**
	 * 获取：时间段
	 */
    public Integer getShijianduanTypes() {
        return shijianduanTypes;
    }


    /**
	 * 设置：时间段
	 */
    public void setShijianduanTypes(Integer shijianduanTypes) {
        this.shijianduanTypes = shijianduanTypes;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getZhuanjiaOrderYuyueTypes() {
        return zhuanjiaOrderYuyueTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setZhuanjiaOrderYuyueTypes(Integer zhuanjiaOrderYuyueTypes) {
        this.zhuanjiaOrderYuyueTypes = zhuanjiaOrderYuyueTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
