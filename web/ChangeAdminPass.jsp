<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Continue</title>
    </head>
    <body>
               <%!
         OracleConnection oconn;
        OracleStatement ost;
        OraclePreparedStatement ost1;
        OracleResultSet ors;
                %>
                
                <%
                    try {
                        String key = request.getParameter("adkey");
                 String password = request.getParameter("adpass");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Asus-Vivobook-14:1521:orcl","inmate","project");
            ost = (OracleStatement) oconn.createStatement();
            String q = "select * from admin where key = '"+key+"'";
            ors = (OracleResultSet)ost.executeQuery(q);
                int count = 0;
                while (ors.next()){
                    count++;
                }
                if (count > 0){
                    String p = "update admin set password = ? where key = ?";
                    ost1 =(OraclePreparedStatement) oconn.prepareStatement(p);
                    ost1.setString(1, password);
                    ost1.setString(2, key);
                    ost1.executeUpdate();
                    response.sendRedirect("http://localhost:8080/InMate/AdminPassSuccess");

                } else {
                    response.sendRedirect("http://localhost:8080/InMate/AdminPassFailed");
                }
                oconn.close();
            } catch (SQLException ex){out.println(ex.getMessage().toString());}
            %>
    </body>
</html>
