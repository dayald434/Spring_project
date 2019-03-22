<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" version="3.0">
  <display-name>PojectForLogin</display-name>
  <welcome-file-list>
    <welcome-file>Login.jsp</welcome-file>
  </welcome-file-list>
  <servlet>
  <servlet-name>only</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
 <init-param>
 <param-name>contextConfigLocation</param-name>
 <param-value>/WEB-INF/classes/Spring/Spring.xml</param-value>
 </init-param>
 <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
  <servlet-name>only</servlet-name>
 <url-pattern>*.do</url-pattern>
  </servlet-mapping>
</web-app>
