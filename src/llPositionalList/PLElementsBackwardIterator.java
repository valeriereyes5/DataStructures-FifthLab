package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PLElementsBackwardIterator<E> implements Iterator {
	private PLIteratorL2F<E> iteartorL2F;
	public PLElementsBackwardIterator(PositionalList<E> list) {
		this.iteartorL2F = new PLIteratorL2F<>(list);
	}
	@Override
	public boolean hasNext() {
		return iteartorL2F.hasNext();
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next()  {

		return  iteartorL2F.next().getElement();
	}
	@Override
	public void remove() throws IllegalStateException {
		iteartorL2F.remove();
	}
}
