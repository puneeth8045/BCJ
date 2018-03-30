package jsp_servlet._web_45_inf._views;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __employeeview extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(java.lang.Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/WEB-INF/views/EmployeeView.jsp", 1504131253864L ,"12.2.1.2.0","America/Chicago")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "ISO-8859-1".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private static java.lang.String  _wl_block0 ="\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n<title>Employee</title>\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<link rel=\"stylesheet\"\r\n\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n<script\r\n\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n<script\r\n\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n\r\n <link rel=\"stylesheet\"\r\n\thref=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/redmond/jquery-ui.min.css\r\n\t\"> \r\n<link rel=\"stylesheet\"\r\n\thref=\"https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.14.0/css/ui.jqgrid.min.css\r\n\t\">\r\n\r\n<script\r\n\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js\r\n\t\"></script>\r\n<script\r\n\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.14.0/jquery.jqgrid.min.js\"></script>\r\n<script type=\"text/javascript\">\r\n\tjQuery(document).ready(\r\n\t\t\tfunction() {\r\n\t\t\t\tjQuery(\"#list\").jqGrid(\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\turl : \"EmpControl\",\r\n\t\t\t\t\t\t\tdatatype : \"json\",\r\n\t\t\t\t\t\t\tmtype : \'POST\',\r\n\t\t\t\t\t\t\tcolNames : [ \'Id\', \'Ticketreferenceno\', \'Category\',\r\n\t\t\t\t\t\t\t\t\t\'SubCategory\', \'Subject\', \'Description\',\r\n\t\t\t\t\t\t\t\t\t\'Status\', \'Comments\' ],\r\n\t\t\t\t\t\t\tcolModel : [ {\r\n\t\t\t\t\t\t\t\tname : \'id\',\r\n\t\t\t\t\t\t\t\tindex : \'id\',\r\n\t\t\t\t\t\t\t\twidth : 100\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'ticketreferenceno\',\r\n\t\t\t\t\t\t\t\tindex : \'ticketreferenceno\',\r\n\t\t\t\t\t\t\t\twidth : 150,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Category\',\r\n\t\t\t\t\t\t\t\tindex : \'Category\',\r\n\t\t\t\t\t\t\t\twidth : 150,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'SubCategory\',\r\n\t\t\t\t\t\t\t\tindex : \'SubCategory\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'subject\',\r\n\t\t\t\t\t\t\t\tindex : \'subject\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Description\',\r\n\t\t\t\t\t\t\t\tindex : \'Description\',\r\n\t\t\t\t\t\t\t\twidth : 200,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Status\',\r\n\t\t\t\t\t\t\t\tindex : \'Status\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'comments\',\r\n\t\t\t\t\t\t\t\tindex : \'comments\',\r\n\t\t\t\t\t\t\t\twidth : 200,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t} ],\r\n\t\t\t\t\t\t\tpager : \'#pager\',\r\n\t\t\t\t\t\t\trowNum : 10,\r\n\t\t\t\t\t\t\trowList : [ 10, 20, 30 ],\r\n\t\t\t\t\t\t\tsortname : \'invid\',\r\n\t\t\t\t\t\t\tsortorder : \'desc\',\r\n\t\t\t\t\t\t\tviewrecords : true,\r\n\t\t\t\t\t\t\tgridview : true,\r\n\t\t\t\t\t\t\tmultiselect : false,\r\n\t\t\t\t\t\t\tcaption : \'Pending Tickets\',\r\n\t\t\t\t\t\t\tjsonReader : {\r\n\t\t\t\t\t\t\t\trepeatitems : false,\r\n\t\t\t\t\t\t\t},\r\n\t\t\t\t\t\t\tediturl : \"EmpControl\"\r\n\t\t\t\t\t\t});\r\n\t\t\t\tjQuery(\"#list\").jqGrid(\'navGrid\', \'#pager\', {\r\n\t\t\t\t\tedit : true,\r\n\t\t\t\t\tadd : true,\r\n\t\t\t\t\tdel : true,\r\n\t\t\t\t\tsearch : true\r\n\t\t\t\t});\r\n\t\t\t});\r\n</script>\r\n<script type=\"text/javascript\">\r\n\tjQuery(document).ready(\r\n\t\t\tfunction() {\r\n\t\t\t\tjQuery(\"#list1\").jqGrid(\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\turl : \"EmpApprove\",\r\n\t\t\t\t\t\t\tdatatype : \"json\",\r\n\t\t\t\t\t\t\tmtype : \'POST\',\r\n\t\t\t\t\t\t\tcolNames : [ \'Id\', \'Ticketreferenceno\', \'Category\',\r\n\t\t\t\t\t\t\t\t\t\'SubCategory\', \'Subject\', \'Description\',\r\n\t\t\t\t\t\t\t\t\t\'Status\', \'Comments\' ],\r\n\t\t\t\t\t\t\tcolModel : [ {\r\n\t\t\t\t\t\t\t\tname : \'id\',\r\n\t\t\t\t\t\t\t\tindex : \'id\',\r\n\t\t\t\t\t\t\t\twidth : 100\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'ticketreferenceno\',\r\n\t\t\t\t\t\t\t\tindex : \'ticketreferenceno\',\r\n\t\t\t\t\t\t\t\twidth : 150,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Category\',\r\n\t\t\t\t\t\t\t\tindex : \'Category\',\r\n\t\t\t\t\t\t\t\twidth : 150,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'SubCategory\',\r\n\t\t\t\t\t\t\t\tindex : \'SubCategory\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'subject\',\r\n\t\t\t\t\t\t\t\tindex : \'subject\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Description\',\r\n\t\t\t\t\t\t\t\tindex : \'Description\',\r\n\t\t\t\t\t\t\t\twidth : 200,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Status\',\r\n\t\t\t\t\t\t\t\tindex : \'Status\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'comments\',\r\n\t\t\t\t\t\t\t\tindex : \'comments\',\r\n\t\t\t\t\t\t\t\twidth : 200,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t} ],\r\n\t\t\t\t\t\t\tpager : \'#pager1\',\r\n\t\t\t\t\t\t\trowNum : 10,\r\n\t\t\t\t\t\t\trowList : [ 10, 20, 30 ],\r\n\t\t\t\t\t\t\tsortname : \'invid\',\r\n\t\t\t\t\t\t\tsortorder : \'desc\',\r\n\t\t\t\t\t\t\tviewrecords : true,\r\n\t\t\t\t\t\t\tgridview : true,\r\n\t\t\t\t\t\t\tmultiselect : false,\r\n\t\t\t\t\t\t\tcaption : \'Approved Tickets\',\r\n\t\t\t\t\t\t\tjsonReader : {\r\n\t\t\t\t\t\t\t\trepeatitems : false,\r\n\t\t\t\t\t\t\t},\r\n\t\t\t\t\t\t\tediturl : \"EmpApprove\"\r\n\t\t\t\t\t\t});\r\n\t\t\t\tjQuery(\"#list1\").jqGrid(\'navGrid\', \'#pager1\', {\r\n\t\t\t\t\tedit : true,\r\n\t\t\t\t\tadd : true,\r\n\t\t\t\t\tdel : true,\r\n\t\t\t\t\tsearch : true\r\n\t\t\t\t});\r\n\t\t\t});\r\n</script>\r\n<script type=\"text/javascript\">\r\n\tjQuery(document).ready(\r\n\t\t\tfunction() {\r\n\t\t\t\tjQuery(\"#list2\").jqGrid(\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\turl : \"EmpReject\",\r\n\t\t\t\t\t\t\tdatatype : \"json\",\r\n\t\t\t\t\t\t\tmtype : \'POST\',\r\n\t\t\t\t\t\t\tcolNames : [ \'Id\', \'Ticketreferenceno\', \'Category\',\r\n\t\t\t\t\t\t\t\t\t\'SubCategory\', \'Subject\', \'Description\',\r\n\t\t\t\t\t\t\t\t\t\'Status\', \'Comments\' ],\r\n\t\t\t\t\t\t\tcolModel : [ {\r\n\t\t\t\t\t\t\t\tname : \'id\',\r\n\t\t\t\t\t\t\t\tindex : \'id\',\r\n\t\t\t\t\t\t\t\twidth : 100\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'ticketreferenceno\',\r\n\t\t\t\t\t\t\t\tindex : \'ticketreferenceno\',\r\n\t\t\t\t\t\t\t\twidth : 150,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Category\',\r\n\t\t\t\t\t\t\t\tindex : \'Category\',\r\n\t\t\t\t\t\t\t\twidth : 150,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'SubCategory\',\r\n\t\t\t\t\t\t\t\tindex : \'SubCategory\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'subject\',\r\n\t\t\t\t\t\t\t\tindex : \'subject\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Description\',\r\n\t\t\t\t\t\t\t\tindex : \'Description\',\r\n\t\t\t\t\t\t\t\twidth : 200,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'Status\',\r\n\t\t\t\t\t\t\t\tindex : \'Status\',\r\n\t\t\t\t\t\t\t\twidth : 100,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t}, {\r\n\t\t\t\t\t\t\t\tname : \'comments\',\r\n\t\t\t\t\t\t\t\tindex : \'comments\',\r\n\t\t\t\t\t\t\t\twidth : 200,\r\n\t\t\t\t\t\t\t\teditable : false\r\n\t\t\t\t\t\t\t} ],\r\n\t\t\t\t\t\t\tpager : \'#pager2\',\r\n\t\t\t\t\t\t\trowNum : 10,\r\n\t\t\t\t\t\t\trowList : [ 10, 20, 30 ],\r\n\t\t\t\t\t\t\tsortname : \'invid\',\r\n\t\t\t\t\t\t\tsortorder : \'desc\',\r\n\t\t\t\t\t\t\tviewrecords : true,\r\n\t\t\t\t\t\t\tgridview : true,\r\n\t\t\t\t\t\t\tmultiselect : false,\r\n\t\t\t\t\t\t\tcaption : \'Rejected Tickets\',\r\n\t\t\t\t\t\t\tjsonReader : {\r\n\t\t\t\t\t\t\t\trepeatitems : false,\r\n\t\t\t\t\t\t\t},\r\n\t\t\t\t\t\t\tediturl : \"EmpReject\"\r\n\t\t\t\t\t\t});\r\n\t\t\t\tjQuery(\"#list2\").jqGrid(\'navGrid\', \'#pager2\', {\r\n\t\t\t\t\tedit : true,\r\n\t\t\t\t\tadd : true,\r\n\t\t\t\t\tdel : true,\r\n\t\t\t\t\tsearch : true\r\n\t\t\t\t});\r\n\t\t\t});\r\n</script>\r\n\r\n<style type=\"text/css\">\r\nfooter {\r\n\tposition: relative;\r\n\tbottom: 0;\r\n\twidth: 100%;\r\n\t   height: 60px;\r\n\tbackground-color: #555;\r\n\tcolor: white;\r\n\tpadding: 15px;\r\n}\r\n</style>\r\n</head>\r\n<body>\r\n\t<nav class=\"navbar navbar-inverse\">\r\n\t<div class=\"container-fluid\">\r\n\t\t<div class=\"navbar-header\">\r\n\t\t\t<a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\r\n\t\t</div>\r\n\t\t<ul class=\"nav navbar-nav\">\r\n\t\t\t<li class=\"active\"><a href=\"TicketManagement\">Home</a></li>\r\n\t\t\t<li><a href=\"TicketManagement\">Ticket Management</a></li>\r\n\t\t\t<li><a href=\"#\">Contact Us</a></li>\r\n\t\t</ul>\r\n\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n\t\t\t";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\t\t\t<li><a href=\"LogOut\"><span\r\n\t\t\t\t\tclass=\"glyphicon glyphicon-log-out\"></span> LogOut</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t</nav>\r\n\t<div class=\"container\">\r\n\t<div class=\"jumbotron\">\r\n\t\t<h2>Pending Ticket details</h2>\r\n\t</div>\r\n\t<table align=\"center\" id=\"list\">\r\n\t\t<tr>\r\n\t\t\t<td />\r\n\t\t</tr>\r\n\t</table>\r\n\t<div id=\"pager\"></div>\r\n\t<button type=\"button\" class=\"btn btn-info\" id=\"approve\">Approve</button>\r\n\t<button type=\"button\" class=\"btn btn-info\" id=\"reject\">Reject</button>\r\n\t</div>\r\n\t<br>\r\n\t<br>\r\n\t<div class=\"container\">\r\n\t<div class=\"jumbotron\">\r\n\t\t<h2>Approved Ticket details</h2>\r\n\t</div>\r\n\t<table align=\"center\" id=\"list1\">\r\n\t\t<tr>\r\n\t\t\t<td />\r\n\t\t</tr>\r\n\t</table>\r\n\t<div id=\"pager1\"></div>\r\n\t</div>\r\n\t\t<br>\r\n\t<br>\r\n\t<div class=\"container\">\r\n\t<div class=\"jumbotron\">\r\n<h2>Rejected Ticket details</h2>\r\n\t</div>\r\n\t<table align=\"center\" id=\"list2\">\r\n\t\t<tr>\r\n\t\t\t<td />\r\n\t\t</tr>\r\n\t</table>\r\n\t<div id=\"pager2\"></div>\r\n\t</div>\r\n<br>\r\n<br>\r\n\t<footer class=\"container-fluid bg-4 text-center\">\r\n\t<p>Ektha Solutions</p>\r\n\t</footer>\r\n\t<script type=\"text/javascript\">\r\n\t\tjQuery(\"#approve\").click(\r\n\t\t\t\tfunction() {\r\n\t\t\t\t\tvar selRowArr = jQuery(\"#list\").getGridParam(\'selrow\');\r\n\t\t\t\t\tvar comments = prompt(\"Please enter the comments\");\r\n\t\t\t\t\tvar celValue = $(\'#list\').jqGrid(\'getCell\', selRowArr,\r\n\t\t\t\t\t\t\t\'ticketreferenceno\');\r\n\t\t\t\t\tvar xhttp = new XMLHttpRequest();\r\n\t\t\t\t\txhttp.onreadystatechange = function() {\r\n\t\t\t\t\t\tif (this.readyState == 4 && this.status == 200) {\r\n\t\t\t\t\t\t\tjQuery(\"#list\").trigger(\"reloadGrid\");\r\n\t\t\t\t\t\t\tjQuery(\"#list1\").trigger(\"reloadGrid\");\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t};\r\n\t\t\t\t\txhttp.open(\"POST\", \"EmpUpdate?val=\" + celValue\r\n\t\t\t\t\t\t\t+ \"&comments=\" + comments, true);\r\n\t\t\t\t\txhttp.send();\r\n\t\t\t\t});\r\n\t</script>\r\n\t<script type=\"text/javascript\">\r\n\t\tjQuery(\"#reject\").click(\r\n\t\t\t\tfunction() {\r\n\t\t\t\t\tvar selRowArr = jQuery(\"#list\").getGridParam(\'selrow\');\r\n\t\t\t\t\tvar comments = prompt(\"Please enter the comments\");\r\n\t\t\t\t\tvar celValue = $(\'#list\').jqGrid(\'getCell\', selRowArr,\r\n\t\t\t\t\t\t\t\'ticketreferenceno\');\r\n\t\t\t\t\tvar xhttp = new XMLHttpRequest();\r\n\t\t\t\t\txhttp.onreadystatechange = function() {\r\n\t\t\t\t\t\tif (this.readyState == 4 && this.status == 200) {\r\n\t\t\t\t\t\t\tjQuery(\"#list\").trigger(\"reloadGrid\");\r\n\t\t\t\t\t\t\tjQuery(\"#list2\").trigger(\"reloadGrid\");\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t};\r\n\t\t\t\t\txhttp.open(\"POST\", \"EmpgridReject?val=\" + celValue\r\n\t\t\t\t\t\t\t+ \"&comments=\" + comments, true);\r\n\t\t\t\t\txhttp.send();\r\n\t\t\t\t});\r\n\t</script>\r\n</body>\r\n</html>";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    static private weblogic.jsp.internal.jsp.JspFunctionMapper _jspx_fnmap = weblogic.jsp.internal.jsp.JspFunctionMapper.getInstance();

    protected void _jspInit() {
        _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getExpressionInterceptor(getServletConfig());
    }

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        java.lang.Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html; charset=ISO-8859-1");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html; charset=ISO-8859-1");
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);
        } catch (java.lang.Throwable __ee){
            __ee.setStackTrace(weblogic.jsp.internal.jsp.utils.SMAPUtils.loadSMAP(this.getClass()).processStackTrace(__ee.getStackTrace()));
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        } finally {
            javax.servlet.jsp.JspFactory.getDefaultFactory().releasePageContext(pageContext);
        }
    }
}
