public class Main {
    public static void main(String[] args) {
        //Crear un objet miCoche en el main y añadirle una puerta
        Coche miChoche = new Coche();
        miChoche.PonerPuertas();
        //Mostrar el numero de puertas que tiene el objet
        System.out.println(miChoche.puertas);

        //Llamar a la function en el main y darle valores
        int resultado;
        resultado = suma(  4,  2, 5 );
        System.out.println(resultado);
    }
    //Crear una function con tres parametros que sean numeros que se sumen entre si.
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
//Crear una clase coche
class Coche{
    //Dentro de la clase coche, una variable numerica que almacene el numero de puertas que tiene
    public int puertas = 0;
    //Una function que increment el numero de puertas que tiene el coche
    public void PonerPuertas(){
        this.puertas++;
    }
}