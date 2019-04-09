package funcionalidades;

import estructuras.ListaSimple;

public class DiferenciaDeListas {
	
	public DiferenciaDeListas()
	{
		
	}
	
	public ListaSimple diff(ListaSimple l1, ListaSimple l2)
	{
		boolean first = true;
		ListaSimple result = null;
		ListaSimple i = l1;
		while (i != null && l2 != null) {
			if (!l2.exist(i.getContent())) {
				if (first) {
					result = new ListaSimple(i.getContent());
					first = false;
				} else {
					result.push(i.getContent());
				}
			}
			i = i.next();
		}
		return result;
	}
}
