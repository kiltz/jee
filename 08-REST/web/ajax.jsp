<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Ajax-Spielwiese</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/formate.css"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/toolz.js" />"></script>
<script type="text/javascript">
	function ajaxPur() {

		//1. Objekt erzeugen
		if (window.ActiveXObject) // IE
		{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		} else {
			xmlHttp = new XMLHttpRequest();
		}
		//2. Wurde Objekt erzeugt?
		if (!xmlHttp) {
			alert("Kann keinen Request erzeugen!")
		} else {
			// Request konfigurieren
			xmlHttp.open("GET", "services/ajax/meldung.html", true);

			// welche Funktion soll aufgerufen werden, wenn der Aufruf beendet ist?
			xmlHttp.onreadystatechange = new Function("", "aenderText(xmlHttp)");
			;

			// und los...
			xmlHttp.send("");

		}
	}
	function aenderText(xmlHttp) {

		if (xmlHttp.readyState == 4) {
			txt = xmlHttp.responseText;

			element = document.getElementById('Inhalt');
			element.innerHTML = txt;
		}
	}
</script>
</head>
<body>
	<div id="layoutMenue">
		<img src="<c:url value="/resources/image/logo.gif"/>" />
		<ul>
			<li><a href="javascript:ajaxPur()">Ajax Pur</a></li>
			<li><a class="ajaxLink"
				href="<c:url value="services/ajax/meldung.html"/>">Eine Meldung</a></li>
			<li><a class="ajaxLink" href="<c:url value="services/json"/>">Ein
					Objekt in XML</a></li>
			<li><a class="ajaxJasonLink"
				href="<c:url value="services/json"/>">Ein Objekt in JSON</a></li>
		</ul>
	</div>

	<div id="layoutOben">
		<h2>Ajax-Spielwiese</h2>
	</div>
	<div id="layoutInhalt">
		<div id="Inhalt"></div>
		Eine kleine Sammlung von AJAX-Beispielen.

		<h2>Daten senden</h2>
		<div id="message" class="dunkelblau">${message}</div>

		<form method="post" id="form" action="services/ajax/form">
			<table>
				<tr>
					<td>Ein Text</td>
					<td><input type="text" name="text" /></td>
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
					<td>Ein Array</td>
					<td><input type="checkbox" value="Eins" name="einArray" />
						Eins <input type="checkbox" value="Zwei" name="einArray" /> Zwei
						<input type="checkbox" value="Drei" name="einArray" /> Drei</td>
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
					<td><input type="checkbox" name="wahrOderFalsch" /> Klick
						mich</td>
				</tr>
			</table>
			<p>
				<input type="submit" value="Submit" />
			</p>
		</form>
		<span id="zahlSpan"></span>
		<form name="formi">
		<textarea rows="5" cols="30" name="ausgabe"></textarea>
		</form>
		<script type="text/javascript">
			$(document).ready(
					function() {

						$("#form").submit(
								function() {
									alert($(this).serialize())
									$.post($(this).attr("action"), 
											$(this).serialize(), function(html) {
										
										MvcUtil.zeigInhalt("dunkelblau", html);
									});
									return false;
								});
					});
		</script>

	</div>
	<script type="text/javascript">
		$("a.ajaxLink").click(function() {
			var link = $(this);
			$.ajax({
				url : link.attr("href"),
				dataType : "text",
				success : function(text) {
					MvcUtil.zeigInhalt("dunkelblau", MvcUtil.xmlencode(text));
				},
				error : function(xhr) {
					MvcUtil.zeigInhalt("rot", xhr.responseText);
				}
			});
			return false;
		});
		$("a.ajaxJasonLink").click(function() {
			var url = "<c:url value="/services/json"/>";
			$.getJSON(url, function(data) {
			       var txt = "";
			       console.log("Zahl: "+data.zahl);
			       $("#zahlSpan").html("<b>"+data.zahl+"</b>");
			       $.each(data, function(key, val) {
			           txt += key + ": " + val + "\n";
			       });
			       document.formi.ausgabe.value = txt;
			});
			return false;
		});
	</script>
</body>
</html>