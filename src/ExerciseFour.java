import java.util.Scanner;

public class ExerciseFour {
    public static Scanner sc =new Scanner(System.in);//Se crea el lector
    public static void main(String[] args){

        //llamamos a cada funcion ala funcion principal para ejecurtalos en orden
        condicional();
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        menu();
    }
    public static void condicional(){

        System.out.println("Sr.User ingrese un numero:");//se pide un dato al usuario
        int num = sc.nextInt();//se almacena el numero directamente con nextInt()
        sc.close();//cerramos el scanner para ahorrar recursos

        if(num == 0)//Hacemos la primera comparacion de verificar si el numero ingresado es = 0
        {
            System.out.println("El numero es cero");//si se cumple la condicion mostrara este mensaje en pantalla
        }
        else if(num > 0)//Si la primera condicion no se cumple, entrara a la segunda condicion donde compare si es > 0
        {
            System.out.println("El numero es positivo");//si se cumple la condicion mostrara este mensaje en pantalla
        }
        else//Si ninguna de las condiciones anteriores se cumple, por logica entrara a la ultima condicion
        {
            System.out.println("El numero es negativo");//si se cumple la condicion mostrara este mensaje en pantalla
        }
    }
    public static void bucleWhile(){

        System.out.println("Inicio del bucle while ");
        int contador = 3;//iniciamos una variable contador desde 3

        while(contador > 0)//creamos un bucle donde dice "contador > 0"
        {
            System.out.println(contador);//imprimimos por pantalla contador
            contador--;//contador va decrementar hasta que la condicion se cumpla
        }
    }
    public static void bucleDoWhile(){

        System.out.println("Inicio del bucle Do while ");
        int contador = 3;//hacemos los mismos pasos que en whila
        do{
            System.out.println(contador);
            contador--;
        }while(contador > 0);

    }
    public  static void bucleFor(){

        System.out.println("Inicio del bucle for/para ");

        for(int contador = 0; contador <= 3;contador++)//contador inicializa en 0 hasta que llegue a 3
        {
            System.out.println(contador);//y imprimir en pantalla el porceso
        }
    }
    public static void menu(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Inicio del menu");
        String estacion = sc.nextLine();//Declaramos una variable con la estacion que quisieramos que mostrara en pantalla
        sc.close();//cerramos el scanner para ahorrar recursos
        switch (estacion)//creamos el switch y llamamos la variable estacion
        {
            //hacemos los casos con el nombre de la estaciones.
            case "primavera" -> System.out.println("Sr.User la estacion es verano");
            case "verano" -> System.out.println("Sr.User la estacion es verano");
            case "otoño" -> System.out.println("Sr.User la estacion es Otoño");
            case "invierno" -> System.out.println("Sr.User la estacion es Invierno");
            default -> System.out.println("Sr.User estacion invalida");
        }
    }
}
