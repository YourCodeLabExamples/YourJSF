<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>JSF - Customer List</title>
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
		<h1>List of Customers</h1>
		<hr/>
		<f:view>
			<h:form styleClass="form-inline">
			<div id="actions" class="search">
				<div class="col-md-12">
					<h:outputLabel for="searchName" value="Name:"/>
					<h:inputText id="searchName" styleClass="form-control mb-4 mr-sm-4 mb-sm-0" value="#{customerManagedBean.customer.name}"/>
					<h:commandButton styleClass="btn btn-primary" value="Search" action="#{customerManagedBean.searchByNameAction}"/>
					<h:commandLink styleClass="btn btn-primary" value="New Customer" action="newCustomer?faces-redirect=true"/>
				</div>
			</div>
			</h:form>
			<h:form>
				<h:dataTable styleClass="table table-striped" var="c" value="#{customerManagedBean.listCustomer}">
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Id"/>
						</f:facet>
						<h:outputText value="#{c.id}"/>		    	
					</h:column>    
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Name"/>
						</f:facet>
				    	<h:outputText value="#{c.name}"/>
					</h:column>    
					<h:column>
						<f:facet name="header">
							<h:outputLabel value="Email"/>
						</f:facet>
				    	<h:outputText value="#{c.email}"/>
					</h:column>
					<h:column>
						<h:commandLink value="View" action="showCustomer?faces-redirect=true">
							<f:setPropertyActionListener target="#{customerManagedBean.customer}" value="#{c}" />
						</h:commandLink>		    	
					</h:column>       
				</h:dataTable>
			</h:form>
		</f:view>
		<c:import url="/inc/footer.jsp"/>
	</body>
</html>
