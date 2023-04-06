import java.util.Comparator;
public class TituloAvaliacaoComparator implements Comparator <Musica>{
  @Override
  public int compare(Musica m1, Musica m2) {
    boolean saoIguais = m1.compareTo(m2) == 0;
    if(saoIguais){
      // return 
      // m1.getAvaliacao() < m2.getAvaliacao() ? 
      // 1 : 
      // m1.getAvaliacao() == m2.getAvaliacao() ? 
      // 0 : 
      // -1;
      return new AvaliacaoComparator().compare(m1, m2); 
    }
    return m1.compareTo(m2);  
  }
  
}
