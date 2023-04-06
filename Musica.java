public class Musica implements Comparable <Musica>{
  private String titulo;
  private int avaliacao;
  
  Musica (String titulo){
    this.titulo = titulo;
  }

  Musica (String titulo, int avaliacao){
    this.titulo = titulo;
    this.avaliacao = avaliacao;
  }


  public int compareTo(Musica m){
    return this.titulo.compareTo(m.titulo);  
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  public int getAvaliacao() {
    return avaliacao;
  }

  public String getTitulo() {
    return titulo;
  }

  // (One, 10)
  //(titulo: One, avaliacao: 10)
  @Override
  public String toString() {
    return String.format(
      "(titulo: %s, avaliacao: %d)",
      titulo,
      avaliacao
    );
  }
}
