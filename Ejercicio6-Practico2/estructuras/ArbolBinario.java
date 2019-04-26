package estructuras;

import java.util.List;

public class ArbolBinario 
{
	protected Object content;
	protected ArbolBinario leftChild;
	protected ArbolBinario rightChild;
	protected int height = 0;
	protected List<Object> frontera;

	public ArbolBinario(Object content) 
	{
		this();
		this.content = content;
	}

	public ArbolBinario()
	{
		this.content = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	public boolean isEmpty()
	{
		return this.content == null;
	}

	public Object getRoot()
	{
		return this.content;
	}

	// public boolean hasElem(Object content);

	public void insert(Object content)
	{
		if (this.content != null) {
			ArbolBinario aux = this;
			insert(aux,content);
		}
		else this.content = content;
	}

	private void insert(ArbolBinario aux, Object content) 
	{
		if (aux != null) {
			if (aux.content.toString().compareTo(content.toString()) > 0) {
				if (aux.leftChild != null) {
					insert(aux.leftChild,content);
				}
				else {
					aux.leftChild = new ArbolBinario(content);
				}
			}
			else if (aux.rightChild != null) {
				insert(aux.rightChild,content);
			}
				else {
					aux.rightChild = new ArbolBinario(content);
				}
		}
	}
	
	public void show()
	{
		ArbolBinario aux = this;
		show(aux);
	}
	
	private void show(ArbolBinario aux) 
	{
		if (aux != null) {
			show(aux.leftChild);
			System.out.println(aux.content);
			show(aux.rightChild);
		}
	}

	// public boolean delete (Object content);

	 public int getHeight()
	 {
		 int actual = 0;
		 ArbolBinario aux = this;
		 getHeight(aux, actual);
		 return this.height;
	 }
	 
	 private void getHeight(ArbolBinario aux, int actual)
	 {
		 if (aux != null) {
			 actual++;
			 if (actual >= this.height) {
				 this.height = actual;
			 }
			 getHeight(aux.leftChild,actual);
			 getHeight(aux.rightChild,actual);
		 }
	 }

	// public void printPostOrder();
	// public void printPreOrder();
	// public void printInOrder();

	// public List getLongestBranch();
	public List<Object> getFrontera()
	{
		ArbolBinario aux = this;
		getFrontera(aux);
		return this.frontera;
	}

	private void getFrontera(ArbolBinario aux) 
	{
		if (aux != null) {
			if (aux.leftChild == null && aux.rightChild == null) {
				this.frontera.add(aux.content);
			}
			else {
				getFrontera(aux.leftChild);
				getFrontera(aux.rightChild);
			}
		}
	}
	
	// public List getElemAtLevel(int i);

	// public Object getMaxElem();
}