package TrabalhoDeArquitetura;
import java.util.Random;
public class TrabalhoDeArquitetura
{
  public static void main(String[] args)
  {
   
    //Instanciacao da matriz N*M
    long [][] matriz = new long [10000] [10000];
    int Linhas = 1000;
    int Colunas = 500;
    
    //Metodo que gera numeros aleatorios
    Random randomico = new Random();
    
    //Metodo que mostra o tempo do sistema em nanosegundos
    long st1 = System.nanoTime();//Inicio da contagem de tempo
    
    //Criacao da matriz utilizando o método IJ
      for (int i = 0; i < Linhas; i++){
        for (int j = 0; j < Colunas; j++){
          matriz [i][j] = randomico.nextInt(matriz.length);
        }
      }
    
    st1 = System.nanoTime() - st1; //Fim da contagem de tempo
    System.out.println("Tempo em nanossegundos da criacao da primeira matriz = " + st1+ " nanosegundos");
    
    
    st1 = System.nanoTime();//Inicio da contagem de tempo
    
    //Criacao da matriz utilizando o método IJ
    for (int i = 0; i < Linhas; i++){
        for (int j = 0; j < Colunas; j++){
          matriz [j][i] = randomico.nextInt(matriz.length);
        }
      }
    
    st1 = System.nanoTime() - st1;//Fim da contagem de tempo
    System.out.println("tempo em nanossegundos da criacao da segunda matriz = " + st1+ " nanosegundos");
  }
}
