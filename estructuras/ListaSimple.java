package estructuras;

public class ListaSimple 
{
	protected String content;
	protected ListaSimple next;
	
	public ListaSimple (String content) 
	{
		this.content = content;
		this.next = null;
	}
	
	public boolean hasNext()
	{
		return this.next!=null;
	}
	
	public ListaSimple next() {
		return this.next;
	}
	
	public String getContent()
	{
		return this.content;
	}
	
	public void push(String content)
	{
		if (content != "") {
			ListaSimple sig = this;
			while (sig.hasNext()) {
				sig = sig.next();
			}
			sig.next = new ListaSimple(content);
		}
	}
	public void show()
	{
		ListaSimple aux = this;
		while (aux != null){
			System.out.println(aux.content);
			aux = aux.next;
		}
	}
	
	public boolean exist(String content)
	{
		ListaSimple aux = this;
		while (aux != null) {
			if (aux.content == content) {
				return true;
			}
			aux = aux.next;
		}
		return false;
	}
}
