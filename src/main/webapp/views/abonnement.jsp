<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Abonnement</title>
<jq:head />
<link rel="stylsheet" type="text/css" href="css/style.css">
<script type="text/javascript">
	function getSubForm(type) {
		$.get("getSubForm?type=" + type, function(data) {
			$("#subform").html(data);

		});
	}
</script>
</head>
<body>
	<div>
		<s:form method="post" action="save">
			<s:textfield name="idAbonnement" label="Abonnement"></s:textfield>
			<jq:datepicker name="dateAbonnement" label="date"></jq:datepicker>
			<s:textfield name="solde" label="solde"></s:textfield>
			<s:checkbox name="actif" label="actif"></s:checkbox>
			<s:select list="typeAB" name="type" label="type Abonnements"
				onchange="getSubForm(this.value)"></s:select>
			<tbody id="subform"></tbody>
			<s:submit value="Save"></s:submit>
		</s:form>
	</div>
	<div>
		<table class="table1">
			<tr>
				<td>ID</td>
				<td>Date AB</td>
				<td>actif</td>
				<td>Type AB</td>
				<td>Solde</td>
				<td>Fidelo</td>
				<td>Debit</td>
			</tr>
			<s:iterator value="abs">
				<tr>
					<td><s:property value="idAbonnement" /></td>
					<td><s:property value="dateAbonnement" /></td>
					<td><s:property value="actif" /></td>
					<td><s:property value="solde" /></td>
					<td><s:property value="class.simpleName" /></td>
					<td><s:property value="fidleo" /></td>
					<td><s:property value="debit" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>