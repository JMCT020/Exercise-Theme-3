public class Main {
    public static void main(String[] args) {
        //crear objeto de persona en el main
        Persona persona = new Persona();
        //Utilizar los gets y sets para darle valores a las propiedades
        persona.setNombre("Jose");
        persona.setApellido("Contreras");
        persona.setEdad(20);
        persona.setTelefono(4794826);
        //Atencion a esta linea
        String nombre = persona.getNombre();
        System.out.println(nombre);
        String apellido = persona.getApellido();
        System.out.println(apellido);
        int edad = persona.getEdad();
        System.out.println(edad);
        int telefono = persona.getTelefono();
        System.out.println(telefono);
        //Crear un objet miCoche en el main y añadirle una puerta
        Coche miChoche = new Coche();
        miChoche.PonerPuertas();
        //Mostrar el numero de puertas que tiene el objet
        System.out.println("El numero de puertas es: " + miChoche.puertas);
        //Llamar a la function en el main y darle valores prueba
        int resultado;
        resultado = suma(  4,  2, 5 );
        System.out.println("La suma de los numeros es: " + resultado);
    }
    //Crear una function con tres parametros que sean numeros que se sumen entre si.
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
//Crear una clase coche
class Coche{
    //Dentro de la clase coche, una variable numerica que almacene el numero de puertas que tiene
    public int puertas = 4;
    //Una function que increment el numero de puertas que tiene el coche
    public void PonerPuertas(){
        this.puertas++;
    }
}
//crear clase persona
class Persona{
    //crear variables privadas
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;

    //Crear gets y sets de cada propiedad
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

