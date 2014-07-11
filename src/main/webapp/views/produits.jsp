
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>produits</title>
</head>
<body>

	<div>
		<s:form action="save" method="post">
			<s:textfield key="reference.label" name="produit.reference"></s:textfield>
			<s:textfield label="Quantite" name="produit.quantite"></s:textfield>
			<s:hidden    name="editMode"></s:hidden>
			<s:submit    value="save"></s:submit>
		</s:form>
	</div>

	<div>
		<table>
			<tr>
				<th>reference</th>
				<th>quantite</th>
				<th>prix</th>
			</tr>
			<s:iterator value="produits">
				<tr>
					<td><s:property value="reference" /></td>
					<td><s:property value="quantite" /></td>
					<td><s:property value="prix" /></td>
					<s:url namespace="/" action="delete" var="lien1">
						<s:param name="ref">
							<s:property value="reference" />
						</s:param>
					</s:url>	
					<s:url namespace="/" action="edit" var="lien2">
						<s:param name="ref">
							<s:property value="reference" />
						</s:param>
					</s:url>
					<td><s:a href="%{lien1}">Sup </s:a></td>
					<td><s:a href="%{lien2}">Edt </s:a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>