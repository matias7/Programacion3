package estructuras;

public class ArbolBinario 
{
	protected Object content;
	protected ArbolBinario leftChild;
	protected ArbolBinario rightChild;

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
		if (this != null){
			if (this.content != content) { //PRE-CONDITION: this.content && content has the same class
				if (content < this.content){
					this.leftChild.insert(content);
				}
				else {
					this.rightChild.insert(content);
				}
			}
		}
	}

	// public boolean delete (Object content);

	// public int getHeight();

	// public void printPostOrder();
	// public void printPreOrder();
	// public void printInOrder();

	// public List getLongestBranch();
	// public List getFrontera();
	// public List getElemAtLevel(int i);

	// public Object getMaxElem();
}