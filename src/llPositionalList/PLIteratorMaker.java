package llPositionalList;

import java.util.Iterator;

import interfaces.Position;
import interfaces.PositionalList;

public interface PLIteratorMaker<E> { 
		 Iterator<Position<E>> makeIterator(PositionalList<E> pl); 
	}


