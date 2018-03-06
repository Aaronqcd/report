<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,selector"></t:base>
<style>
    .ui_content {
        width: 100%;
    }
</style>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bmB003List" checkbox="false" pagination="true" fitColumns="false" title="小区信息表" actionUrl="bmB003Controller.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="流程状态"  field="bpmStatus"  hidden="true"  queryMode="single" dictionary="bpm_status" width="120"></t:dgCol>
    <t:dgCol title="编码"  field="bm"   query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="名称"  field="mc"   query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="地址"  field="dz"   query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="物管经营用房"  field="wuyf"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="物管办公用房"  field="wbmj"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="公建用房"  field="gjyf"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="公建用房面积"  field="gjmf"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="楼宇栋数"  field="lys"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="区域"  field="cy"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="归集点名称"  field="gjdmc"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="归集点编码"  field="gjdbm"    queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="物业公司编码"  field="wygsbm"   query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="物业公司名称"  field="wygsmc"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="bmB003Controller.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="bmB003Controller.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="bmB003Controller.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="bmB003Controller.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="bmB003Controller.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
      <t:dgToolBar title="字段配置" icon="icon-gear" funname="fieldConfig"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/report/bmB003List.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 function fieldConfig() {
     $(this).dialog({
         title: '数据列选择器',
         width: 800,
         height: 600,
         closed: false,
         cache: false,
         content:"<iframe scrolling='auto' frameborder='0' src='bmB003Controller.do?fieldConfig' style='width:100%; height:100%;'></iframe>",
         modal: true
     });
     $(this).dialog('open');
 }
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'bmB003Controller.do?upload', "bmB003List");
}

//导出
function ExportXls() {
	JeecgExcelExport("bmB003Controller.do?exportXls","bmB003List");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("bmB003Controller.do?exportXlsByT","bmB003List");
}

 </script>