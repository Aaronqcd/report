package com.jeecg.report.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 小区信息表
 * @author onlineGenerator
 * @date 2018-03-03 11:11:56
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bm_b003", schema = "")
@SuppressWarnings("serial")
public class BmB003Entity implements java.io.Serializable {
	/**主键*/
	private String id;
	/**创建人名称*/
	private String createName;
	/**创建人登录名称*/
	private String createBy;
	/**创建日期*/
	private Date createDate;
	/**更新人名称*/
	private String updateName;
	/**更新人登录名称*/
	private String updateBy;
	/**更新日期*/
	private Date updateDate;
	/**所属部门*/
	private String sysOrgCode;
	/**所属公司*/
	private String sysCompanyCode;
	/**流程状态*/
	private String bpmStatus;
	/**编码*/
	@Excel(name="编码")
	private String bm;
	/**名称*/
	@Excel(name="名称")
	private String mc;
	/**地址*/
	@Excel(name="地址")
	private String dz;
	/**物管经营用房*/
	@Excel(name="物管经营用房")
	private String wuyf;
	/**物管办公用房*/
	@Excel(name="物管办公用房")
	private String wbmj;
	/**公建用房*/
	@Excel(name="公建用房")
	private String gjyf;
	/**公建用房面积*/
	@Excel(name="公建用房面积")
	private Double gjmf;
	/**楼宇栋数*/
	@Excel(name="楼宇栋数")
	private Integer lys;
	/**区域*/
	@Excel(name="区域")
	private String cy;
	/**归集点名称*/
	@Excel(name="归集点名称")
	private String gjdmc;
	/**归集点编码*/
	@Excel(name="归集点编码")
	private String gjdbm;
	/**物业公司编码*/
	@Excel(name="物业公司编码")
	private String wygsbm;
	/**物业公司名称*/
	@Excel(name="物业公司名称")
	private String wygsmc;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	@Column(name ="CREATE_BY",nullable=true,length=50)
	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */
	@Column(name ="BPM_STATUS",nullable=true,length=32)
	public String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  编码
	 */
	@Column(name ="BM",nullable=true,length=36)
	public String getBm(){
		return this.bm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  编码
	 */
	public void setBm(String bm){
		this.bm = bm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  名称
	 */
	@Column(name ="MC",nullable=true,length=100)
	public String getMc(){
		return this.mc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名称
	 */
	public void setMc(String mc){
		this.mc = mc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  地址
	 */
	@Column(name ="DZ",nullable=true,length=100)
	public String getDz(){
		return this.dz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  地址
	 */
	public void setDz(String dz){
		this.dz = dz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物管经营用房
	 */
	@Column(name ="WUYF",nullable=true,length=32)
	public String getWuyf(){
		return this.wuyf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物管经营用房
	 */
	public void setWuyf(String wuyf){
		this.wuyf = wuyf;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物管办公用房
	 */
	@Column(name ="WBMJ",nullable=true,length=32)
	public String getWbmj(){
		return this.wbmj;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物管办公用房
	 */
	public void setWbmj(String wbmj){
		this.wbmj = wbmj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  公建用房
	 */
	@Column(name ="GJYF",nullable=true,length=32)
	public String getGjyf(){
		return this.gjyf;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  公建用房
	 */
	public void setGjyf(String gjyf){
		this.gjyf = gjyf;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  公建用房面积
	 */
	@Column(name ="GJMF",nullable=true,scale=2,length=10)
	public Double getGjmf(){
		return this.gjmf;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  公建用房面积
	 */
	public void setGjmf(Double gjmf){
		this.gjmf = gjmf;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  楼宇栋数
	 */
	@Column(name ="LYS",nullable=true,length=3)
	public Integer getLys(){
		return this.lys;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  楼宇栋数
	 */
	public void setLys(Integer lys){
		this.lys = lys;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  区域
	 */
	@Column(name ="CY",nullable=true,length=32)
	public String getCy(){
		return this.cy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  区域
	 */
	public void setCy(String cy){
		this.cy = cy;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  归集点名称
	 */
	@Column(name ="GJDMC",nullable=true,length=100)
	public String getGjdmc(){
		return this.gjdmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  归集点名称
	 */
	public void setGjdmc(String gjdmc){
		this.gjdmc = gjdmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  归集点编码
	 */
	@Column(name ="GJDBM",nullable=true,length=36)
	public String getGjdbm(){
		return this.gjdbm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  归集点编码
	 */
	public void setGjdbm(String gjdbm){
		this.gjdbm = gjdbm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物业公司编码
	 */
	@Column(name ="WYGSBM",nullable=true,length=36)
	public String getWygsbm(){
		return this.wygsbm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物业公司编码
	 */
	public void setWygsbm(String wygsbm){
		this.wygsbm = wygsbm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物业公司名称
	 */
	@Column(name ="WYGSMC",nullable=true,length=100)
	public String getWygsmc(){
		return this.wygsmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物业公司名称
	 */
	public void setWygsmc(String wygsmc){
		this.wygsmc = wygsmc;
	}
}
