import java.util.ArrayList;

import javax.swing.JOptionPane;
public class GerenciadorDeMusicas {
  public static void main(String[] args) {
    var musicas = new ArrayList<Musica>();
    String menu = "0-Sair\n1-Cadastrar música\n2-Avaliar música\n3-Ver a lista ordenada pelo nome\n4-Ver a lista ordenada pela avaliação";
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(op){
        case 1:
          String titulo = JOptionPane.showInputDialog("Titulo da musica?");
          Musica m = new Musica(titulo);
          musicas.add(m);
          break;

      }
    }while (op != 0);
  }
}
