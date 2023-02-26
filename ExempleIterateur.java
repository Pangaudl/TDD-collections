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

    // Test 1 : vérifie que hasNext() renvoie true pour les 9 premières valeurs.
    Iterator<Integer> it1 = nouveau.iterator();
    for (int i = 0; i < 9; i++) {
      assert (it1.hasNext());
      it1.next();
      System.out.println(i + ") true pour les 9 premières valeurs : " + i);
    }
    System.out.println();

    // Test 2 : vérifie que hasNext() renvoie false après le 10ème valeur.
    Iterator<Integer> it2 = nouveau.iterator();
    for (int i = 0; i < 10; i++) {
      it2.next();
    }
    assert (it2.hasNext());
    System.out.println("false pour la 10ème valeur");
    System.out.println();

    for (int i : nouveau) {
      System.out.println(i);
    }
  }

}
