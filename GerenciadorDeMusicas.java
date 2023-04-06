import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//5, 3, 2, 1, 6 => 1, 2, 3, 5, 6
//a, j, b, c => a, b, c, j
//bola, caderno, aluno => aluno, bola, caderno
// (sorry, 10), (one, 7) => 
import javax.swing.JOptionPane;
public class GerenciadorDeMusicas {
  public static void main(String[] args) {
    var musicas = new ArrayList<Musica>();
    musicas.addAll(Arrays.asList(new Musica[]{
      new Musica("One", 10),
      new Musica("One", 5),
      new Musica("Numb", 7)
    }));
    String menu = "0-Sair\n1-Cadastrar música\n2-Avaliar música\n3-Ver a lista ordenada pelo nome\n4-Ver a lista ordenada pela avaliação\n5-Ver a lista ordenada por título e, então, por avaliação";
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(op){
        case 1:{
          String titulo = JOptionPane.showInputDialog("Titulo da musica?");
          Musica m = new Musica(titulo);
          musicas.add(m);
          break;
        }
        case 2:{
          String titulo = JOptionPane.showInputDialog("Titulo da música?");
          int avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avaliacao?"));
          for (int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getTitulo().equals(titulo)){
              musicas.get(i).setAvaliacao(avaliacao);
              JOptionPane.showMessageDialog(null, "Música avaliada!");
              break;  
            }
          }
          break;
        }
        case 3:{
          Collections.sort(musicas);
          JOptionPane.showMessageDialog(null, musicas);
          break;
        }
        case 4:{
          Collections.sort(musicas, new AvaliacaoComparator());
          JOptionPane.showMessageDialog(null, musicas);
          break;
        }
        case 5:{
          Collections.sort(musicas, new TituloAvaliacaoComparator());
          JOptionPane.showMessageDialog(null, musicas);
          break;
        }

      }
    }while (op != 0);
  }
}
