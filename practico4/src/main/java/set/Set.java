package set;

import java.util.Collection;
import java.util.LinkedList;


public class Set{

	   
		/*
		 * almacena de forma ordenada los elementos del conjunto.
		 */
		private LinkedList<Integer> elements;
		
		
		/*
		 * Cantidad de  elementos presentes en el conjunto
		 */
		private int size;
		 
		
		public Set() {
			elements = new LinkedList<Integer>();
			size = 0;
		}
		
		
		public Set(Collection<Integer> s) {
			this.elements = new LinkedList<Integer>();
			this.size = 0;
			for(Integer e:s) {
				this.add(e); 
			}
		}
		
		public int size() {
			return size;
		}
		
		public boolean isEmpty() {
			return size() == 0;
		}

		/* Intersección entre dos conjuntos
		 * @param s conjunto que se quiere intersecar con el conjunto target
		 * @return intersección entre el conjunto dado y el conjunto target.
		 * @throw IllegalArgumentException cuando el parámetro es null
		 */
		public Set intersect(Set s) throws IllegalArgumentException {
			if(s==null)
				throw new IllegalArgumentException();
			
			Set res = new Set();
		    for (Integer e : elements) {
		        if (s.belongs(e)) {
		            res.add(e);
		        }
		    }
		    return res;
		}
		

		/*Agrega un nuevo elemento al conjunto
		 *@param e elemento que se quiere  agregar al conjunto
		 *@return true si el elemento se agregó al conjunto, false en el caso
		 *en donde e ya pertenece al conjunto
		 *@throw IllegalArgumentException cuando el parámetro es null
		 */
		public boolean add(Integer e) throws IllegalArgumentException {
			if(e==null)
				throw new IllegalArgumentException();
			
			if (belongs(e))
				return false;

			int i = 0;
			while(i<size()){
				if(elements.get(i).compareTo(e)>=0){
					break;
				}
				i++;
			}
			elements.add(i, e);
			size++;
			
			return true;
		}
		
		

		/* Unión entre dos conjuntos
		 * @param s conjunto que se quiere unir al  conjunto target
		 * @return union entre el conjunto dado y el conjunto target.
		 * @throw IllegalArgumentException cuando el parámetro es null
		 */
		public Set union(Set s) throws IllegalArgumentException {
			if(s==null)
				throw new IllegalArgumentException();
			
			Set res = new Set();
	        for (Integer e : this.elements)
	            res.add(e);
	        
	        for (Integer e : s.elements)
	            res.add(e);
	        
	        return res;
		}

			
		
		/* @param o elemento que se busca en el conjunto
		 * @return True si el elemento pertenece al conjunto, false en otro caso
		 * @throw IllegalArgumentException cuando el parámetro es null
		 */
		public boolean belongs(Integer o) throws IllegalArgumentException {
			if(o==null)
				throw new IllegalArgumentException();

			for (int i=1; i< size(); i++){
				if(elements.get(i).equals(o)){
					return true;
				}
			}
			return false;
		}

		


		/*
		 * Borra un elemento del conjunto
		 * @param o elemento que se debe borrar del conjunto
		 * @return true si efectivamente el elemento fue eliminado, false en otro caso
		 * @throw IllegalArgumentException cuando el parámetro es null
		 */
		public boolean remove(Integer o) throws IllegalArgumentException {
			if(o==null)
				throw new IllegalArgumentException();
			if (!belongs(o))
				return false;

			for (int i=0; i<= size(); i++){
				if(elements.get(i).equals(o)){
					elements.remove(i);
					size--;
					return true;
				}
			}
			return false;
		}
	
		/*
		 * Borra todos los elementos del conjunto.
		 */
		public void clear() {
			for(Integer e : elements)
				remove(e);
		}
		
		
		
		/* Metodo que strictlySorted
		 * @return boolean si el set esta ordenado y sin repetidos.
		 */
		private boolean strictlySorted() {
			for (int i = 1; i < elements.size(); i++) {
				if (elements.get(i-1) >= elements.get(i)) {
					return false;
				}
			}
			return true;
		}
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((elements == null) ? 0 : elements.hashCode());
			result = prime * result + size;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Set other = (Set) obj;
			if (elements == null) {
				if (other.elements != null)
					return false;
			} else if (!elements.containsAll(other.elements))
				return false;
			if (size != other.size)
				return false;
			return true;
		}
		
		
	}



