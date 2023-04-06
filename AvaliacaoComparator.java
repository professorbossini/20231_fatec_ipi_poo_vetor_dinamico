import java.util.Comparator;

public class AvaliacaoComparator implements Comparator <Musica> {

  @Override
  public int compare(Musica m1, Musica m2) {
    return 
      m1.getAvaliacao() < m2.getAvaliacao() ? 
      1 : 
      m1.getAvaliacao() == m2.getAvaliacao() ? 
      0 : 
      -1;  
  }
}
