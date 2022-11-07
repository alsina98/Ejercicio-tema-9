class main{

    public static void main(String[] args) {

        Cliente client = new Cliente();
        
        client.edat = 50;
        client.telefono = "555555555";
        client.nombre = "Julia";
        client.credito = 10000;

        System.out.println(client.edat);
        System.out.println(client.telefono);
        System.out.println(client.nombre);
        System.out.println(client.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edat = 25;
        trabajador.telefono = "444444444";
        trabajador.nombre = "Jordi";
        trabajador.salario = 2500;

        System.out.println(trabajador.edat);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.salario);
    }
}

class Persona{
    int edat;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
