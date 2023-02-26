import java.util.Iterator;

public class ExempleIterateur implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			
			private int i = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i < 10;
			}

			@Override
			public Integer next() {
				int valeur = i++; 
				return valeur * valeur;
			}
		};
	}

	public static void main(String[] args) {
		ExempleIterateur nouveau = new ExempleIterateur();
		for(int i : nouveau) {
			System.out.println(i);
		}
	}
	
}
