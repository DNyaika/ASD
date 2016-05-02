package composite;

public class Main {
	public static void main(String[] args) {
		HtmlDocument document = new HtmlComponent("<html>");
		HtmlDocument documentClose = new HtmlComponent("</html>");
		HtmlDocument body = new HtmlComponent("<body>");
		HtmlDocument bodyClose = new HtmlComponent("</body>");
		HtmlDocument table = new HtmlComponent("<table>");
		HtmlDocument tableClose = new HtmlComponent("</table>");
		HtmlDocument tr = new HtmlComponent("<tr>");
		HtmlDocument trCllose = new HtmlComponent("</tr>");
		tr.add(new HtmlElement("<td>", "Eve"));
		tr.add(new HtmlElement("</td>", ""));
		tr.add(new HtmlElement("<td>", "Jackson"));
		tr.add(new HtmlElement("</td>", ""));
		tr.add(new HtmlElement("<td>", "Jackson"));
		tr.add(new HtmlElement("</td>", ""));
		table.add(tr);
		table.add(trCllose);
		table.add(tableClose);
		body.add(table);
		body.add(bodyClose);
		document.add(body);
		document.add(documentClose);

		document.print();
	}

}
