// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Vehiculo {
    String marca;
    String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar(){
        System.out.println("El vehiculo " + marca + " esta acelerando.");
    }
}

class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public void bocina() {
        System.out.println("El auto " + marca + " esta tocando la bocina.");
    }
}

class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public void bocina() {
        System.out.println("La moto " + marca + " esta tocando la bocina.");
    }
}

public class Main {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Kawasaki", "Ninja");
        
        miMoto.acelerar();
        
        miMoto.bocina();
    }
}