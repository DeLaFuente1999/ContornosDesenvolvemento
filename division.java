import java.util.Scanner;
public class division {
    public static void main(String[] args) {
       
        Scanner teclado= new Scanner(System.in);
        dividir();
    }
    
     public static void dividir(){
     Scanner teclado = new Scanner(System.in);
     float num1,num2,divide;
     
        System.out.println("Ingrese Primer Numero:");
        num1= teclado.nextInt();
        System.out.println("Ingrese Segundo Numero:");
        num2= teclado.nextInt();
        divide= num1/num2;
        
        System.out.println("La Division es:" + divide);
}
}