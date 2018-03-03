<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>小区信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="bmB003Controller.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${bmB003Page.id }">
					<input id="createName" name="createName" type="hidden" value="${bmB003Page.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${bmB003Page.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${bmB003Page.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${bmB003Page.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${bmB003Page.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${bmB003Page.updateDate }">
					<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${bmB003Page.sysOrgCode }">
					<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${bmB003Page.sysCompanyCode }">
					<input id="bpmStatus" name="bpmStatus" type="hidden" value="${bmB003Page.bpmStatus }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								编码:
							</label>
						</td>
						<td class="value">
						     	 <input id="bm" name="bm" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.bm}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">编码</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="mc" name="mc" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.mc}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								地址:
							</label>
						</td>
						<td class="value">
						     	 <input id="dz" name="dz" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.dz}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">地址</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								物管经营用房:
							</label>
						</td>
						<td class="value">
						     	 <input id="wuyf" name="wuyf" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.wuyf}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">物管经营用房</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								物管办公用房:
							</label>
						</td>
						<td class="value">
						     	 <input id="wbmj" name="wbmj" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.wbmj}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">物管办公用房</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								公建用房:
							</label>
						</td>
						<td class="value">
						     	 <input id="gjyf" name="gjyf" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.gjyf}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">公建用房</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								公建用房面积:
							</label>
						</td>
						<td class="value">
						     	 <input id="gjmf" name="gjmf" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.gjmf}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">公建用房面积</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								楼宇栋数:
							</label>
						</td>
						<td class="value">
						     	 <input id="lys" name="lys" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.lys}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">楼宇栋数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								区域:
							</label>
						</td>
						<td class="value">
						     	 <input id="cy" name="cy" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.cy}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区域</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								归集点名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="gjdmc" name="gjdmc" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.gjdmc}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">归集点名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								归集点编码:
							</label>
						</td>
						<td class="value">
						     	 <input id="gjdbm" name="gjdbm" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.gjdbm}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">归集点编码</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								物业公司编码:
							</label>
						</td>
						<td class="value">
						     	 <input id="wygsbm" name="wygsbm" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.wygsbm}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">物业公司编码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								物业公司名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="wygsmc" name="wygsmc" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${bmB003Page.wygsmc}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">物业公司名称</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/report/bmB003.js"></script>		
