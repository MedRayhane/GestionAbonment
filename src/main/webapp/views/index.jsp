<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq" %>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<jq:head/>
</head>
<body>
<s:url namespace="/" action="produits" var="lien"></s:url>
<s:a href="%{lien}">produits</s:a>
</body>
</html>