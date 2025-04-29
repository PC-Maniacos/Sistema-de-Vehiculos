
class Vehiculo {
    private String marca;
    private String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void mostrar_detalles(){
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo());
    }
}

class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    public void mostrar_detalles() {
        System.out.println("Auto: " + getMarca() + ", Modelo: " + getModelo());
    }
}

class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    public void mostrar_detalles() {
        System.out.println("Moto: " + getMarca() + ", Modelo: " + getModelo());
    }
}
class calculadora_velocidades{
    public double velocidad_promedio (double a, double b, double t){
        return (a+b)/t;
    }
    public double velocidad_promedio(double a, double b, double c, double t){
        return (a+b+c)/t;
    }
}

public class Vehiculo_clase {
    public static void main(String[] args) {
        Vehiculo v1 = new Moto("Kawasaki", "Ninja");
        Vehiculo v2 = new Auto("Toyota", "Corolla");
        
        v1.mostrar_detalles();
        v2.mostrar_detalles();
        
        calculadora_velocidades calc = new calculadora_velocidades();
        
        System.out.println("Velocidad promedio: " + calc.velocidad_promedio(60, 80, 2));
        System.out.println("Velocidad promedio: " + calc.velocidad_promedio(60, 80, 100, 3));
    }
}