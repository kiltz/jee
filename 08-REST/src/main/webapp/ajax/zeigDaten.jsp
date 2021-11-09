<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h2>Daten anzeigen</h2>
<ul>
	<li><a href="javascript:holJson(true)">Als Json</a> (<a
		href="javascript:holJson(false)">Als Json-String</a>)</li>
	<li><a href="javascript:holXML('xml')">Als XML</a> (<a
		href="javascript:holXML('text')">Als XML-String</a>)</li>
	<li>Je nach Accept: <a href="javascript:hole('xml')">Als XML</a>
		und <a href="javascript:hole('json')">als JSON</a>
		 <a href="javascript:hole('text')">als Text</a>
	</li>
</ul>
<script type="text/javascript">
	function holJson(mitGetJson) {
		var url = "<c:url value="/ajax/zeigDaten.json"/>";
		if (mitGetJson) {
			$.getJSON(url, function(data) {
			       var txt = "";
			       console.log("Zahl: "+data.zahl);
			       $("#zahlSpan").html("<b>"+data.zahl+"</b>");
			       $.each(data, function(key, val) {
			           txt += key + ": " + val + "\n";
			       });
			       document.formi.ausgabe.value = txt;
			});
		} else {

			$.ajax({
				url : url,
				dataType : "text",
				success : function(text) {
					document.formi.ausgabe.value = text;
				},
				error : function(xhr) {
					document.formi.ausgabe.value = xhr.responseText;
				}
			});
		}

	}
	function holXML(typ) {
		var url = "<c:url value="/ajax/zeigDaten.xml"/>";
		$.ajax({
			url : url,
			dataType : typ,
			success : function(text) {
				document.formi.ausgabe.value = text;
			},
			error : function(xhr) {
				document.formi.ausgabe.value = xhr.responseText;
			}
		});

	}
	function hole(typ) {
		var url = "<c:url value="/ajax/zeigDaten"/>";
			$.ajax({
				url : url,
				dataType : typ,
				success : function(text) {
					document.formi.ausgabe.value = text;
				},
				error : function(xhr) {
					document.formi.ausgabe.value = xhr.responseText;
				}
			});

	}

</script>

<form name="formi">
	<textarea rows="10" cols="80" name="ausgabe"></textarea>
</form>
Zahl: <span id="zahlSpan"></span>