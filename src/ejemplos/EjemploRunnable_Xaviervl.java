package ejemplos;
/*
Hilos:
1.- Implementar Runnable
2.- Extendido de Thread
 */
public class EjemploRunnable implements Runnable {

    @Override
    public void run() {
        // aqui dentro va el codigo que quieres que ejecute el hilo
        System.out.println("Hilo corriendo " + Thread.currentThread().getName());
    }
}

// creo la clase para ejecutar los hilos
class Main{
    public static void main(String[] args) {
        // para lanzar un hilo
        // 1.- Crea un objeto de la clase que implementa Runnable
        EjemploRunnable task1 = new EjemploRunnable();
        // 2.- Creamos el objeto Thread pasandole en el constructor la tarea task
        Thread hilo1 = new Thread(task1);
        Thread hilo2 = new Thread(task1, "Hilo negro");
        // lanzamos el hilo con el metodo start
        hilo1.start();
        hilo2.start();

        // y siempre anda por detras el hilo main
        System.out.println("El main es este (hilo principal) " + Thread.currentThread().getName());
    }
}