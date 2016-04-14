<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link rel=stylsheet type="text/css" href="css/style.css" />
</head>
<body>
	<div>
		<s:form action="save" method="post">
			<s:textfield label="REF" name="produit.ref"></s:textfield>
			<s:textfield label="DEs" name="produit.designation"></s:textfield>
			<s:textfield label="prix" name="produit.prix"></s:textfield>
			<s:textfield label="quantite" name="produit.quantite"></s:textfield>
			<s:hidden name="editmode" ></s:hidden>
			<s:checkbox label="promo" name="produit.promo"></s:checkbox>
			<s:submit value="save"></s:submit>
		</s:form>
	</div>
	<div>
		<table class="table1">
			<tr>
				<th>REF</th>
				<th>DES</th>
				<th>PRIX</th>
				<th>prix</th>
				<th>QUANTITIE</th>
				<th>promo</th>
			</tr>
			<s:iterator value="produits">
				<tr>
					<td><s:property value="ref"></s:property> <s:property
							value="designation"></s:property> <s:property value="quantite"></s:property>
						<s:property value="prix"></s:property> <s:property value="promo"></s:property>
					</td>
					<s:url namespace="/" action="delete" var="lien1">
						<s:param name="ref">
							<s:property value="ref"></s:property>
						</s:param>
					</s:url>
						<s:url namespace="/" action="edit" var="lien2">
						<s:param name="ref">
							<s:property value="ref"></s:property>
						</s:param>
					</s:url>
					<td><s:a href="%{lien1}">Supprimmer</s:a></td>
					<td><s:a href="%{lien2}">EDIT</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>