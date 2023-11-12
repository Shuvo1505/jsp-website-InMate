package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>InMate | Login</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!--===============================================================================================-->\t\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"assets/user.png\"/>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("<!--===============================================================================================-->\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login_user.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("        <script src=\"js/alert.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("<style>\r\n");
      out.write("            .decor {\r\n");
      out.write("                border-radius: 6px;\r\n");
      out.write("                background: grey;\r\n");
      out.write("                width: 50%;\r\n");
      out.write("                height: 30%;\r\n");
      out.write("                color: yellow;\r\n");
      out.write("                font-style: italic;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                cursor: default;\r\n");
      out.write("            }\r\n");
      out.write("                .fp-submit {\r\n");
      out.write("               display: inline-block;\r\n");
      out.write("               background: #b75924;\r\n");
      out.write("               color: #fff;\r\n");
      out.write("               border-bottom: none;\r\n");
      out.write("               border: 2px solid #b75924;\r\n");
      out.write("               width: auto;\r\n");
      out.write("               font-size: 16px;\r\n");
      out.write("               transition: all 0.5s;\r\n");
      out.write("               padding: 15px 39px;\r\n");
      out.write("               border-radius: 5px;\r\n");
      out.write("               -moz-border-radius: 5px;\r\n");
      out.write("               -webkit-border-radius: 5px;\r\n");
      out.write("               -o-border-radius: 5px;\r\n");
      out.write("               -ms-border-radius: 5px;\r\n");
      out.write("               margin-top: 25px;\r\n");
      out.write("               cursor: pointer; \r\n");
      out.write("               }\r\n");
      out.write("               .fp-submit:hover{\r\n");
      out.write("                    background: transparent;\r\n");
      out.write("                    color: #b75924;\r\n");
      out.write("                    border: 2px solid #b75924;\r\n");
      out.write("               }\r\n");
      out.write("               .buttdis{\r\n");
      out.write("                    font-family: Montserrat-Bold;\r\n");
      out.write("                    font-size: 15px;\r\n");
      out.write("                    line-height: 1.5;\r\n");
      out.write("                    color: #fff;\r\n");
      out.write("                    text-transform: uppercase;\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                    height: 50px;\r\n");
      out.write("                    border-radius: 25px;\r\n");
      out.write("                    background: grey;\r\n");
      out.write("                    display: -webkit-box;\r\n");
      out.write("                    display: -webkit-flex;\r\n");
      out.write("                    display: -moz-box;\r\n");
      out.write("                    display: -ms-flexbox;\r\n");
      out.write("                    display: flex;\r\n");
      out.write("                    justify-content: center;\r\n");
      out.write("                    align-items: center;\r\n");
      out.write("                    padding: 0 25px;\r\n");
      out.write("                    -webkit-transition: all 0.4s;\r\n");
      out.write("                    -o-transition: all 0.4s;\r\n");
      out.write("                    -moz-transition: all 0.4s;\r\n");
      out.write("                    transition: all 0.4s;\r\n");
      out.write("               }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url('adback.png')\">\r\n");
      out.write("   <script>\r\n");
      out.write("        function loadHome(){\r\n");
      out.write("            window.open('homepage.jsp',\"_self\")\r\n");
      out.write("        }\r\n");
      out.write("                        document.addEventListener('contextmenu',\r\n");
      out.write("                event => event.preventDefault());\r\n");
      out.write("                window.history.forward();\r\n");
      out.write(" </script>\r\n");
      out.write("         ");

            String raws = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            int length = 6;
                for (int i=0;i<length;i++){
                    int index = random.nextInt(raws.length());
                    char randomChar = raws.charAt(index);
                    sb.append(randomChar);
                }
                    String CODE = sb.toString();
        
      out.write("\r\n");
      out.write("\t<div class=\"limiter\">\r\n");
      out.write("\t\t<div class=\"container-login100\">\r\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\r\n");
      out.write("\t\t\t\t<div class=\"login100-pic js-tilt\" data-tilt style='margin-top: -40px'>\r\n");
      out.write("\t\t\t\t\t<img src=\"assets/user.png\" alt=\"IMG\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("                            <form class=\"login100-form validate-form\" action=\"http://localhost:8080/InMate/Requestsess\" onsubmit=\"return checkValid()\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title\" style='margin-top: -134px'>\r\n");
      out.write("\t\t\t\t\t\tMember Login\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\r\n");
      out.write("                                            <input class=\"input100\" type=\"email\" name=\"logemail\" id=\"logemail\" placeholder=\"Email\" maxlength=\"40\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Password is required\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"password\" name=\"logpassword\" id=\"logpassword\" \r\n");
      out.write("                                                       placeholder=\"Password\" maxlength='16'>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    &nbsp;\r\n");
      out.write("\t\t\t\t\t         <div style=\"display: flex\">\r\n");
      out.write("                                           <b style=\"margin-top: 5px;font-size: 14px\">Verification Code:</b>\r\n");
      out.write("                                             &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                                        <input id=\"vercodem\" class=\"decor\" value=\"");
      out.print(CODE);
      out.write("\" style='text-align: center'/>                                                  \r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        &nbsp;\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" id=\"vercode\" \r\n");
      out.write("                                                       placeholder=\"Enter Verification Code\" maxlength='6'>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-shield\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"login100-form-btn\" id=\"sublog\">\r\n");
      out.write("\t\t\t\t\t\t\tLogin\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center p-t-12\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\" id=\"ab\">\r\n");
      out.write("\t\t\t\t\t\t\tForgot\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"txt2\" href=\"javascript:forgotPass()\" name=\"forgotpass\" id=\"forgotpass\">\r\n");
      out.write("\t\t\t\t\t\t\tUsername / Password?\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center p-t-136\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"txt2\" href=\"http://localhost:8080/InMate/registration.jsp\" id=\"crea\">\r\n");
      out.write("\t\t\t\t\t\t\tCreate your Account\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("                                            &nbsp;&nbsp;\r\n");
      out.write("                                            \t<span class=\"txt1\" id=\"cd\">\r\n");
      out.write("\t\t\t\t\t\t\tor \r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("                                            &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a class=\"txt2\" href=\"javascript:accessUp()\" name=\"adlogin\" id=\"adlogin\">\r\n");
      out.write("\t\t\t\t\t\t\tlogin as admin\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!--===============================================================================================-->\t\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"vendor/tilt/tilt.jquery.min.js\"></script>\r\n");
      out.write("\t<script >\r\n");
      out.write("\t\t$('.js-tilt').tilt({\r\n");
      out.write("\t\t\tscale: 1.1\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("          function checkValid(){\r\n");
      out.write("              if (document.getElementById('logemail').value === \"\" || \r\n");
      out.write("                      document.getElementById('logpassword').value === \"\"){\r\n");
      out.write("                  Swal.fire({\r\n");
      out.write("                    icon: 'error',\r\n");
      out.write("                    title: 'Oops...',\r\n");
      out.write("                    text: 'Username or Password can\\'t be empty !'\r\n");
      out.write("                    })\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else if (document.getElementById('vercode').value === \"\"){\r\n");
      out.write("                      Swal.fire({\r\n");
      out.write("                        text: 'Please enter verification code !',\r\n");
      out.write("                        confirmButtonText: 'Dismiss'\r\n");
      out.write("                      })\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else if (document.getElementById('vercode').value !== \r\n");
      out.write("                        document.getElementById('vercodem').value){\r\n");
      out.write("                    Swal.fire({\r\n");
      out.write("                    icon: 'error',\r\n");
      out.write("                    title: 'Oops...',\r\n");
      out.write("                    text: 'Please enter correct verification code !'\r\n");
      out.write("                    })\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"sublog\").disabled = true;\r\n");
      out.write("                    document.getElementById(\"sublog\").setAttribute(\"class\",\"buttdis\");\r\n");
      out.write("                    document.getElementById(\"sublog\").style.cursor = \"not-allowed\";\r\n");
      out.write("                    document.getElementById(\"forgotpass\").textContent = \"\";\r\n");
      out.write("                    document.getElementById(\"crea\").textContent = \"\";\r\n");
      out.write("                    document.getElementById(\"adlogin\").textContent = \"\";\r\n");
      out.write("                    document.getElementById(\"ab\").textContent = \"\";\r\n");
      out.write("                    document.getElementById(\"cd\").textContent = \"\";\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("          }\r\n");
      out.write("                 function forgotPass(){\r\n");
      out.write("                        Swal.fire({\r\n");
      out.write("                        title: 'Password Updation',\r\n");
      out.write("                        html:\r\n");
      out.write("                            '<form method=\"POST\" action=\"http://localhost:8080/InMate/PasswordSess\" onsubmit=\"return updateValid()\" class=\"register-form\" id=\"login-form\"><br>' +\r\n");
      out.write("                            '<div class=\"wrap-input100\"><input class=\"input100\" type=\"email\" id=\"veremail\" name=\"veremail\" placeholder=\"Enter E-mail Address\" maxlength=\"40\" required=\"true\"><span class=\"focus-input100\"></span><span class=\"symbol-input100\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span></div>' +\r\n");
      out.write("                            '<div class=\"wrap-input100\"><input class=\"input100\" type=\"password\" name=\"verpassword\" id=\"verpassword\" placeholder=\"Enter New Password\" minlength=\"8\" maxlength=\"16\" pattern=\"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,16}$\" title=\"Password must contain uppercase character, lowercase character, special character as well as having minimum 8 characters long\" onkeydown=\"dismissValid()\" required=\"true\"><span class=\"focus-input100\"></span><span class=\"symbol-input100\"><i class=\"fa fa-lock\" aria-hidden=\"true\"></i></span></div>' +\r\n");
      out.write("                            '<div class=\"wrap-input100\"><input class=\"input100\" type=\"password\" name=\"veropassword\" id=\"veropassword\" placeholder=\"Confirm New Password\" required=\"true\" onkeydown=\"dismissValid()\"><span class=\"focus-input100\"></span><span class=\"symbol-input100\"><i class=\"fa fa-lock\" aria-hidden=\"true\"></i></span></div>' +\r\n");
      out.write("                            '<div class=\"container-login100-form-btn\" style=\"margin-top: -20px\"><button class=\"fp-submit\">Change Password</button></form></div><form action=\"login.jsp\"><button class=\"fp-submit\">Cancel</button></form>&nbsp;' +\r\n");
      out.write("                            '<br>'+\r\n");
      out.write("                            '<p id=\"error_st1\" style=\"color: red\"></p>' +\r\n");
      out.write("                            '<p id=\"error_st2\" style=\"color: red\"></p>' ,\r\n");
      out.write("                            showCancelButton: false,\r\n");
      out.write("                            showConfirmButton: false,\r\n");
      out.write("                            allowOutsideClick: false\r\n");
      out.write("                })\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          function updateValid(){\r\n");
      out.write("              let a = document.getElementById('verpassword').value;\r\n");
      out.write("              let b = document.getElementById('veropassword').value;\r\n");
      out.write("              let c = document.getElementById('error_st1');\r\n");
      out.write("              let d = document.getElementById('error_st2');\r\n");
      out.write("                if (a !== b ){\r\n");
      out.write("                    c.textContent = \"Confirmation password didn\\'t match.\";\r\n");
      out.write("                    d.textContent = \"Please try again !\";\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("          }\r\n");
      out.write("          function dismissValid(){\r\n");
      out.write("              let e = document.getElementById('error_st1');\r\n");
      out.write("              let f = document.getElementById('error_st2');\r\n");
      out.write("                    e.textContent = \"\";\r\n");
      out.write("                    f.textContent = \"\";\r\n");
      out.write("          }\r\n");
      out.write("          function accessUp(){\r\n");
      out.write("              window.open(\"http://localhost:8080/InMate/admin.jsp\",\"_self\");\r\n");
      out.write("          }\r\n");
      out.write("        document.getElementById(\"vercodem\").addEventListener(\"mousedown\", function(event){\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("    });\r\n");
      out.write("        </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
