<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>JSF - New Customer</title>
	   <meta name="description" content="">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	
	   <link rel="stylesheet" href="css/bootstrap.min.css">
	   <style>
	        body {
	            padding-top: 50px;
	            padding-bottom: 20px;
	        }
	   </style>
	   <link rel="stylesheet" href="css/style.css">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">     
    </head>
	<body>
		<c:import url="/inc/header.jsp"/>
	
		<!-- Conteúdo principal da página -->
		<main class="container">
		<h1>New Customer</h1>
		<hr/>
			<f:view>
				<h:form>
				<div class="form-group">
					<h:outputLabel for="customerId" value="Id:"/>
					<h:inputText id="customerId" styleClass="form-control" value="#{customerManagedBean.customer.id}"/>
				</div>
				<div class="form-group">
					<h:outputLabel value="Name:"/>
					<h:inputText styleClass="form-control" value="#{customerManagedBean.customer.name}"/>
				</div>
				<div class="form-group">
					<h:outputLabel value="Email:"/>
					<h:inputText styleClass="form-control" value="#{customerManagedBean.customer.email}"/>
				</div>
				<div id="actions" class="row">
					<div class="col-md-12">
					<h:commandLink styleClass="btn btn-primary" value="Save" action="#{customerManagedBean.insertCustomerAction}"/>
					<h:commandLink styleClass="btn btn-default" value="Cancel" action="index?faces-redirect=true"/>
					</div>
				</div>
				</h:form>			
			</f:view>
		</main>
		<c:import url="/inc/footer.jsp"/>
	</body>
</html>