import java.util.Random;
public class TesteRedimensionamento {
  public static void main(String[] args)  throws Exception{
    //70% adicionar um elemento
    //30% remover um elemento
    Random gerador = new Random();
    VetorDinamico v = new VetorDinamico();
    while (true){
      double oQueFazer = gerador.nextDouble();
      if(oQueFazer <= 0.55){
        int n = gerador.nextInt(1, 11);
        System.out.println("Adicionar...");
        v.adicionar(n);
      }
      else{
        System.out.println("Remover...");
        v.remover();
      }
      v.exibir();
      System.out.println("**********************************");
      Thread.sleep(8000);
    }
  }
}
