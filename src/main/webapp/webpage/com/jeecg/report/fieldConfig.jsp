<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<head>
    <link href="${webRoot}/plug-in-ui/hplus/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${webRoot}/plug-in/ace/css/bootstrap-duallistbox.css" rel="stylesheet">
    <script src="${webRoot}/plug-in-ui/hplus/js/jquery.min.js?v=2.1.4"></script>
    <script src="${webRoot}/plug-in/bootstrap/js/bootstrap.min.js"></script>
    <script src="${webRoot}/plug-in/ace/js/jquery.bootstrap-duallistbox.js"></script>
    <style>
        .col-md-6 {
            width: 50%;
            float: left;
        }
        /*.ui_content {
            width: 100%;
        }*/
    </style>
</head>
<body>
    <div>
        <form id="demoform" action="#" method="post">
            <select multiple="multiple" size="20" name="duallistbox_demo1[]" class="demo">
                <%--<option value="option1">Option 1</option>
                <option value="option2">Option 2</option>
                <option value="option3" selected="selected">Option 3</option>
                <option value="option4">Option 4</option>
                <option value="option5">Option 5</option>
                <option value="option6" selected="selected">Option 6</option>
                <option value="option7">Option 7</option>
                <option value="option8">Option 8</option>
                <option value="option9">Option 9</option>
                <option value="option0">Option 10</option>--%>
            </select>
            <br>
            <button type="submit" class="btn btn-default btn-block">Submit data</button>
        </form>
    </div>
    <script>
        $(function () {
            $(".ui_content").css("display", "block");
            getTableColumn();
        });
        var demo1 = $('.demo').bootstrapDualListbox();
        $("#demoform").submit(function() {
            /*alert($('[name="duallistbox_demo1[]"]').val());
            return false;*/
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/bmB003Controller.do?updateFieldConfig",
                data: {
                    ids: $('[name="duallistbox_demo1[]"]').val()
                },
                dataType: "json",
                success: function(data){
                    getTableColumn();
                }
            });
        });
        function getTableColumn() {
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/bmB003Controller.do?getTableColumn",
                dataType: "json",
                success: function(data){
                    for(var i=0; i<data.attributes.field.length; i++) {
                        if(data.attributes.field[i].state==1) {
                            demo1.append("<option value='"+data.attributes.field[i].id+"'>"
                                +data.attributes.field[i].tableDesc+"-"+data.attributes.field[i].fieldDesc+"</option>");
                        }
                        else {
                            demo1.append("<option value='"+data.attributes.field[i].id+"' selected='selected'>"
                                +data.attributes.field[i].tableDesc+"-"+data.attributes.field[i].fieldDesc+"</option>");
                        }
                    }
                    demo1.bootstrapDualListbox('refresh');
                }
            });
        }
    </script>
</body>
