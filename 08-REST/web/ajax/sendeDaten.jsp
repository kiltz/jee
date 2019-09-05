<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h2>Daten senden</h2>
<div id="message" class="dunkelblau">${message}</div>
  
<form method="post" id="form">
	<table>
		<tr>
			<td>Ein Text</td>
			<td><input type="text" name="text"/></td>
		</tr>
		<tr>
			<td>Eine Ganzzahl</td>
			<td><input type="text" name="zahl" /></td>
		</tr>
		<tr>
			<td>Eine Gleitzahl</td>
			<td><input type="text" name="gleitZahl" /></td>
		</tr>
		<tr>
			<td>Ein Datum</td>
			<td><input type="text" name="datum"  /></td>
		</tr>
		<tr>
			<td>Ein Array</td>
			<td><input type="checkbox" value="Eins" name="einArray" /> Eins 
				<input type="checkbox" value="Zwei" name="einArray" /> Zwei 
				<input type="checkbox" value="Drei"	name="einArray" /> Drei
			</td>
		</tr>
		<tr>
			<td>Eine Liste</td>
			<td><select name="eineListe" size="3" multiple="true">
					<option value="Eins">Eins</option>
					<option value="Zwei">Zwei</option>
					<option value="Drei">Drei</option>
				</select></td>
		</tr>
		<tr>
			<td>Ein Boolean</td>
			<td><input type="checkbox" name="wahrOderFalsch" /> Klick mich</td>
		</tr>
	</table>
	<p>
		<input type="submit" value="Submit"/>
	</p>
</form>
<script type="text/javascript">
	$(document).ready(function() {
		
		$("#form").submit(function() {
			
			$.post(
					$(this).attr("action"), 
					$(this).serialize(), 
					function(html) {
				MvcUtil.zeigInhalt("dunkelblau", html);
			});
			return false;
		});
	});
</script>
