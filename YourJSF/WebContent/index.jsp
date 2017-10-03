<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JSF - Customer List</title>
	</head>
	<body>
		<f:view>
			<h:form>
				<h:outputLabel value="Name:"/>
				<h:inputText value="#{customerManagedBean.customer.name}"/>
				<h:commandButton value="Search" action="#{customerManagedBean.searchByNameAction}"/>
				<h:commandLink value="New Customer" action="newCustomer?faces-redirect=true"/>
				
				<h:dataTable var="c" value="#{customerManagedBean.listCustomer}">
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
	</body>
</html>
