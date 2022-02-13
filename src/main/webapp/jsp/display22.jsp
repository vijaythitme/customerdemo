<style>

table,td,tr,th
{
	border : 1px solid green;
	border-collapse : collapse;
	
}

td
{
	
	text-align : center;
	padding : 10px;
	
}

th
{
	color:red;
}

h1
{
	color:green;
}
table
{
	margin-left:180px;
}

</style>

${user.uname}<br> 
${list}

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>


<body>

<h1 align="center">List of names</h1>
<br>

<table>

				<tr>
							<th>  name    </th>
							
							<th>  size    </th>
							
				</tr>
				
				<!-- string is a  reference pointing to String class objects from list-->
				
				<jstl:forEach var="string" items="${list}">
				
						<tr>
							<td>  ${string}    </td>
							
							<td>  ${string.length()}    </td>
							
						</tr>
						
				</jstl:forEach>
</table>
