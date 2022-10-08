import java.util.Scanner;

public class list1_q8 
{
    public static void main(String[] args) throws Exception
    {
        double hora, salariohora, salariomes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite as horas trabalhadas no mês: ");
        hora = teclado.nextDouble();
        System.out.print("Digite o salário ganho por hora: ");
        salariohora = teclado.nextDouble();

        salariomes = hora*salariohora;
        System.out.println("O salário ganho no mês foi de: " +salariomes);
        teclado.close();
    } 

}
