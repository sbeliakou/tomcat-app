package org.server;



import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Date;
import java.sql.*;
import org.json.*;


@WebServlet(urlPatterns = {"/"})
public class ChatServlet extends HttpServlet {

    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.addHeader("Access-Control-Allow_Methods", "*");
        response.setContentType("text/html");
        response.getWriter().print(
            "<html>" + 
            "<head>" +
                "<title>Docker Lab</title>" + 
                "<link href='favicon.ico' rel='icon' type='image/x-icon' />" +
                "<link href='favicon.ico' rel='shortcut icon' type='image/x-icon' />" +
                "<link rel='stylesheet' href='https://kit-free.fontawesome.com/releases/latest/css/free.min.css' media='all'>" + 
                "<link rel='icon' type='image/png' href='https://cdn.icon-icons.com/icons2/1380/PNG/512/vcsconflicting_93497.png'>" + 
                "<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Ubuntu:300' >" + 
                "<style>" + 
                ".main {" + 
                    "text-align: center;" + 
                    "font-family: 'Ubuntu', sans-serif;" + 
                "}" + 
                "h4 {" + 
                    "font-size: 1.7em;" + 
                    "margin-top: 0;" + 
                    "margin-bottom: 0.5em;" + 
                "}" + 
                "hr.style-one {" + 
                    "border: 0;" + 
                    "height: 1px;" + 
                    "background: #7f7f7f;" + 
                    "background-image: -webkit-linear-gradient(left, #ccc, #7f7f7f, #ccc);" + 
                    "background-image: -moz-linear-gradient(left, #ccc, #7f7f7f, #ccc);" + 
                    "background-image: -ms-linear-gradient(left, #ccc, #7f7f7f, #ccc);" + 
                    "background-image: -o-linear-gradient(left, #ccc, #7f7f7f, #ccc);" + 
                    "width: 550;" + 
                "}" + 
                ".message {" + 
                    "margin-top: 0;" + 
                    "font-size: 1.5em;" + 
                "}" + 
                ".footer {" + 
                    "font-size: 0.8em;" + 
                    "font-family: 'Ubuntu', sans-serif;" + 
                "}" + 
                "</style>" + 
            "</head>" + 
            "<body>" + 
                "<div class='main'>" + 
                "<img style='width:550;' src='https://miro.medium.com/max/3770/1*bgvnY-Ka4kK9P-dagisEBg.png'></img>" +
                "<h4>Java Application Running in Tomcat AS</h4>" + 
                "<p class='message'><i class='far fa-thumbs-up'> </i>\"  It works!\"</p>" + 
                "<hr class='style-one'>" + 
                "<p class='footer'>" + 
                    "Developed by Siarhei Beliakou for <a href='https://github.com/sbeliakou/playpit-labs' target='_blank'><b>playpit-labs</b></a>" + 
                "</p>" + 
                "</div>" + 
            "</body>" + 
            "</html>"
        );


    }

    public void destroy() {
        super.destroy();
    }


}
