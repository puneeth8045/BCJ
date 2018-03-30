package jsp_servlet._web_45_inf._views;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __createticket extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/WEB-INF/views/CreateTicket.jsp", 1504556488824L ,"12.2.1.2.0","America/Chicago")) return true;
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

    private static java.lang.String  _wl_block0 ="\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<title>Create Ticket</title>\r\n<meta charset=\"utf-8\">\r\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n<link rel=\"stylesheet\"\r\n\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n<script\r\n\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n<script\r\n\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n<script type=\"text/javascript\">\r\n\tfunction change() {\r\n\t\tvar val = document.getElementById(\'Category\').value;\r\n\t\tvar xhttp = new XMLHttpRequest();\r\n\t\txhttp.onreadystatechange = function() {\r\n\t\t\tif (xhttp.readyState == 4 && xhttp.status == 200) {\r\n\t\t\t\tdocument.getElementById(\'SubCategory\').innerHTML = xhttp.responseText;\r\n\t\t\t}\r\n\t\t};\r\n\t\txhttp.open(\"POST\", \"SubCategory?valajax=\" + val, true);\r\n\t\txhttp.send();\r\n\t}\r\n</script>\r\n<style type=\"text/css\">\r\nfooter {\r\n\tposition: absolute;\r\n\tbottom: 0;\r\n\twidth: 100%;\r\n\t   height: 60px;\r\n\tbackground-color: #555;\r\n\tcolor: white;\r\n\tpadding: 15px;\r\n}\r\n</style>\r\n</head>\r\n<body>\r\n\t<nav class=\"navbar navbar-inverse\">\r\n\t<div class=\"container-fluid\">\r\n\t\t<div class=\"navbar-header\">\r\n\t\t\t<a class=\"navbar-brand\" href=\"#\">WebSiteName</a>\r\n\t\t</div>\r\n\t\t<ul class=\"nav navbar-nav\">\r\n\t\t\t<li class=\"active\"><a href=\"TicketManagement\">Home</a></li>\r\n\t\t\t<li><a href=\"TicketManagement\">Ticket Management</a></li>\r\n\t\t\t<li><a href=\"#\">Contact Us</a></li>\r\n\t\t</ul>\r\n\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n\t\t\t<li><a href=\"LogOut\"><span\r\n\t\t\t\t\tclass=\"glyphicon glyphicon-log-out\"></span> LogOut</a></li>\r\n\t\t</ul>\r\n\t</div>\r\n\t</nav>\r\n\r\n\t<form modelAttribute=\"Ticket\" action=\"CreateTicketProcess\"\r\n\t\tmethod=\"post\" class=\"form-horizontal\" >\r\n\t\t<div class=\"container\">\r\n\t\t\t<div class=\"jumbotron\">\r\n\t\t\t\t<h2>Create Ticket</h2>\r\n\t\t\t</div>\r\n\r\n\t\t\t<div class=\"form-group\">\r\n\t\t\t\t<fieldset>\r\n\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"Category\">Category:</label>\r\n\t\t\t\t\t<div class=\"col-sm-3\">\r\n\t\t\t\t\t\t<select class=\"form-control\" id=\"Category\" name=\"Category\"\r\n\t\t\t\t\t\t\tonchange=\"change()\">\r\n\t\t\t\t\t\t\t<option>-------------------------------</option>\r\n\t\t\t\t\t\t\t ";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</fieldset>\r\n\t\t\t</div>\r\n\r\n\t\t\t<div class=\"form-group\">\r\n\t\t\t\t<fieldset>\r\n\t\t\t\t\t<label class=\"control-label col-sm-2\" for=\"SubCategory\">SubCategory:</label>\r\n\t\t\t\t\t<div class=\"col-sm-3\">\r\n\t\t\t\t\t\t<select class=\"form-control\" id=\"SubCategory\" name=\"SubCategory\">\r\n\t\t\t\t\t\t<option>-------------------------------</option>\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</fieldset>\r\n\t\t\t</div>\r\n\t\t\t<div class=\"form-group\">\r\n\t\t\t\t<label class=\"control-label col-sm-2\" for=\"subject\">Subject:</label>\r\n\t\t\t\t<div class=\"col-sm-7\">\r\n\t\t\t\t\t<input class=\"form-control\" id=\"subject\" name=\"subject\" type=\"text\">\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t\t<div class=\"form-group\">\r\n\t\t\t\t<label class=\"control-label col-sm-2\" for=\"description\">Description:</label>\r\n\t\t\t\t<div class=\"col-sm-7\">\r\n\t\t\t\t\t<textarea class=\"form-control\" rows=\"5\" id=\"Description\"\r\n\t\t\t\t\t\tname=\"Description\"></textarea>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\r\n\t\t\t<!-- </div> -->\r\n\t\t\t<div class=\"container\">\r\n\t\t\t\t<input type=\"submit\" class=\"btn btn-info\" name=\"Create Ticket\"\r\n\t\t\t\t\tvalue=\"Create Ticket\">\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t</form>\r\n\r\n\t\t<footer class=\"container-fluid bg-4 text-center\">\r\n\t\t<p>Ektha Solutions</p>\r\n\t\t</footer> \r\n</body>\r\n</html>";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

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
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${category}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block1Bytes, _wl_block1);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${ticketSubCategory}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block2Bytes, _wl_block2);
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
