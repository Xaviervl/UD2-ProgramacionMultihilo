package ejemplos.sincronizacion.compartirdatos;

public class Main {
    public static void main(String[] args) {
        // Creamos un contador y dos hilos
        Contador contador = new Contador();
        MyThread hilo1 = new MyThread(contador);
        MyThread hilo2 = new MyThread(contador);

        // iniciamos los hilos y esperamos que cada uno termine con .join
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            System.out.println("Error al iniciar el hilo1" + e.getMessage());
            Thread.currentThread().interrupt();
        }
        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Error al iniciar el hilo2" + e.getMessage());
        }
        System.out.println("Contador: " + contador.getValor());
    }
}
