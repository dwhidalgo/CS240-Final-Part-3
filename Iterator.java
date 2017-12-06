/*
	An implentation of an iterator of iterators.
	
	@author Drue Hidalgo
	@version 1.0

*/

public class Iterator<T>
{
	private static DictionaryArray<K,V> L1 = new DictionaryArray<K,V>();
	private static DictionaryArray<K,V> L2 = new DictionaryArray<K,V>();
	private static DictionaryNode<K,V> I1 = new DictionaryNode<K,V>();
	
	public Iterator<T> iteratorOfIterators()
	{
		ArrayList<V> array = new ArrayList<V>();
		Node<K,V> temp;
		for(int i = 0; L1.size > i; i++)
		{
			array.add(L1[i].getValue());
			array.add(L2[i].getValue());
			array.add(temp.getValue());
            temp = temp.getNext();
		}
	}
}