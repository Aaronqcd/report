<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<head>
    <link href="${webRoot}/plug-in-ui/hplus/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${webRoot}/plug-in/ace/css/bootstrap-duallistbox.css" rel="stylesheet">
    <script src="${webRoot}/plug-in-ui/hplus/js/jquery.min.js?v=2.1.4"></script>
    <script src="${webRoot}/plug-in/bootstrap/js/bootstrap.min.js"></script>
    <script src="${webRoot}/plug-in/ace/js/jquery.bootstrap-duallistbox.js"></script>
</head>
<body>
    <div>
        <form id="demoform" action="#" method="post">
            <select multiple="multiple" size="10" name="duallistbox_demo1[]">
                <option value="option1">Option 1</option>
                <option value="option2">Option 2</option>
                <option value="option3" selected="selected">Option 3</option>
                <option value="option4">Option 4</option>
                <option value="option5">Option 5</option>
                <option value="option6" selected="selected">Option 6</option>
                <option value="option7">Option 7</option>
                <option value="option8">Option 8</option>
                <option value="option9">Option 9</option>
                <option value="option0">Option 10</option>
            </select>
            <br>
            <button type="submit" class="btn btn-default btn-block">Submit data</button>
        </form>
    </div>
    <script>
        var demo1 = $('select[name="duallistbox_demo1[]"]').bootstrapDualListbox();
        $("#demoform").submit(function() {
            alert($('[name="duallistbox_demo1[]"]').val());
            return false;
        });
    </script>
</body>
