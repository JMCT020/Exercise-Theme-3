public class Main {
    public static void main(String[] args) {
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades
        //la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente = new Cliente();
        cliente.nombre = "Jose manuel";
        cliente.edad = 20;
        cliente.telefono = "7644678763";
        cliente.credito = 30;
        System.out.println(cliente.nombre + " " + cliente.edad + " " + cliente.telefono + " " + cliente.credito);
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
//Crear una clase Person Con las siguientes variables: edad, nombre, telefono
class Person{
    int edad;
    String nombre;
    String telefono;
}
// crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Person{
    int credito;
}
//haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
class Trabajador extends Person{
    int salario;
}
