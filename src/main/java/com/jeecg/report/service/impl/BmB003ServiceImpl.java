package com.jeecg.report.service.impl;
import com.jeecg.report.service.BmB003ServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.report.entity.BmB003Entity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("bmB003Service")
@Transactional
public class BmB003ServiceImpl extends CommonServiceImpl implements BmB003ServiceI {

	
 	public void delete(BmB003Entity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(BmB003Entity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(BmB003Entity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(BmB003Entity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(BmB003Entity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(BmB003Entity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(BmB003Entity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("create_name", t.getCreateName());
		map.put("create_by", t.getCreateBy());
		map.put("create_date", t.getCreateDate());
		map.put("update_name", t.getUpdateName());
		map.put("update_by", t.getUpdateBy());
		map.put("update_date", t.getUpdateDate());
		map.put("sys_org_code", t.getSysOrgCode());
		map.put("sys_company_code", t.getSysCompanyCode());
		map.put("bpm_status", t.getBpmStatus());
		map.put("bm", t.getBm());
		map.put("mc", t.getMc());
		map.put("dz", t.getDz());
		map.put("wuyf", t.getWuyf());
		map.put("wbmj", t.getWbmj());
		map.put("gjyf", t.getGjyf());
		map.put("gjmf", t.getGjmf());
		map.put("lys", t.getLys());
		map.put("cy", t.getCy());
		map.put("gjdmc", t.getGjdmc());
		map.put("gjdbm", t.getGjdbm());
		map.put("wygsbm", t.getWygsbm());
		map.put("wygsmc", t.getWygsmc());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,BmB003Entity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{sys_org_code}",String.valueOf(t.getSysOrgCode()));
 		sql  = sql.replace("#{sys_company_code}",String.valueOf(t.getSysCompanyCode()));
 		sql  = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
 		sql  = sql.replace("#{bm}",String.valueOf(t.getBm()));
 		sql  = sql.replace("#{mc}",String.valueOf(t.getMc()));
 		sql  = sql.replace("#{dz}",String.valueOf(t.getDz()));
 		sql  = sql.replace("#{wuyf}",String.valueOf(t.getWuyf()));
 		sql  = sql.replace("#{wbmj}",String.valueOf(t.getWbmj()));
 		sql  = sql.replace("#{gjyf}",String.valueOf(t.getGjyf()));
 		sql  = sql.replace("#{gjmf}",String.valueOf(t.getGjmf()));
 		sql  = sql.replace("#{lys}",String.valueOf(t.getLys()));
 		sql  = sql.replace("#{cy}",String.valueOf(t.getCy()));
 		sql  = sql.replace("#{gjdmc}",String.valueOf(t.getGjdmc()));
 		sql  = sql.replace("#{gjdbm}",String.valueOf(t.getGjdbm()));
 		sql  = sql.replace("#{wygsbm}",String.valueOf(t.getWygsbm()));
 		sql  = sql.replace("#{wygsmc}",String.valueOf(t.getWygsmc()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("bm_b003",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}