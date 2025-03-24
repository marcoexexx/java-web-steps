<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="model.Person" %>

<h1>Person | JavaBean</h1>

<hr/>

<!-- page, request, session, or application scope -->

<jsp:useBean id="person" class="model.Person" scope="page"></jsp:useBean>

<jsp:useBean id="person_bean" class="model.Person" scope="session">
  <jsp:setProperty name="person_bean" property="firstName" value="John"/>
  <jsp:setProperty name="person_bean" property="lastName" value="Doe"/>
  <jsp:setProperty name="person_bean" property="age" value="8"/>
</jsp:useBean>

First Name: <jsp:getProperty name="person_bean" property="firstName" /><br/>
First Name From request: <jsp:getProperty name="person" property="firstName" /><br/>
Last Name: <jsp:getProperty name="person_bean" property="lastName" /><br />
Age: <jsp:getProperty name="person_bean" property="age" />
