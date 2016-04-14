<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq"%>
<s:if test="%{type=='GSM'}">
<s:textfield name="fidelio" label="fidelio"></s:textfield>
</s:if>
<s:elseif test="%{type=='INTERNET'}" >
<s:textfield name="debit" label="debit"></s:textfield>
</s:elseif>