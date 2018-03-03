package com.jeecg.report.service;
import com.jeecg.report.entity.BmB003Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BmB003ServiceI extends CommonService{
	
 	public void delete(BmB003Entity entity) throws Exception;
 	
 	public Serializable save(BmB003Entity entity) throws Exception;
 	
 	public void saveOrUpdate(BmB003Entity entity) throws Exception;
 	
}
