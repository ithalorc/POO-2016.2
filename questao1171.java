import java.util.Scanner;

public class questao1171 {

    public static void main (String[]args) {
        
        Scanner quant = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        int [] x = new int[20];
        int count = 0, aux;
        int quantidade = quant.nextInt();
        
        for(int i = 0; i < quantidade; i++){
            x[count] = teclado.nextInt();
            count++;
        }
/*
        System.out.printf("lido: ");
        for (int i = 0; i < quantidade; i++)
            System.out.printf("%d ", x[i]);
        System.out.println();
*/

//        for (int i = 0; i < count; i++)
//            System.out.println(x[i]);
        
        for (int i = 0; i < count; i++){
            for (int j = i+1; j < count; j++){
                if(x[j] < x[i]){
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }
        
        for (int i = 0; i < count; i++)
            System.out.println(x[i]);
    
        int i = 0;

        while(i < count){
            aux = 1;
            for (int j = i+1; j <= count; j++){
                if(x[i] == x[j])
                    aux++;
                else{
                    System.out.println(x[i]+" aparece "+aux+" vez(es).");
                    i = j;
                    j = count + 1;
                }
            }
        }
    }
}
