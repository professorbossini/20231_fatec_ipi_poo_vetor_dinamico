public class Musica {
  private String titulo;
  private int avaliacao;
  
  Musica (String titulo){
    this.titulo = titulo;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  public String getTitulo() {
    return titulo;
  }
}
