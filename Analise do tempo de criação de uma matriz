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
    long st1 = System.nanoTime();
    
    //Criacao da matriz N*M
      for (int i = 0; i < Linhas; i++){
        for (int j = 0; j < Colunas; j++){
          matriz [i][j] = randomico.nextInt(matriz.length);
        }
      }
    
    st1 = System.nanoTime() - st1; //Calculo do tempo que levou para criar a matriz
    System.out.println("Tempo em nanosegundos da criacao da primeira matriz = " + st1+ " nanosegundos");
    
    
    st1 = System.nanoTime();
    
    for (int i = 0; i < Linhas; i++){
        for (int j = 0; j < Colunas; j++){
          matriz [j][i] = randomico.nextInt(matriz.length);
        }
      }
    
    st1 = System.nanoTime() - st1;
    System.out.println("tempo em nanosegundos da criacao da segunda matriz = " + st1+ " nanosegundos");
  }
}
