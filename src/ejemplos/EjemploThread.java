package ejemplos;

public class EjemploThread extends Thread {
    // si quisieras personalizar el nombre del hilo tendrías que añadirlo como atributo y pasarlo en el constructor

    @Override
    public void run() {
        // Print the name of the thread and a message
        System.out.println("Nombre del hilo: [" + Thread.currentThread().getName() + "]");
        // Print the priority of the current thread
        System.out.println( "  Prioridad del hilo [ " + Thread.currentThread().getName() + "] : [" + Thread.currentThread().getPriority() + "]");
        // Print the name of the thread group to which the current thread belongs
        System.out.println("Grupo al que pertenece el hilo ["+ Thread.currentThread().getName() + "] : " + Thread.currentThread().getThreadGroup().getName());
        // Hilos activos
        System.out.println("Hilos activos: " + Thread.activeCount());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        // Using different constructors of Thread class
        // Constructor: Thread()
        EjemploThread hilo1 = new EjemploThread();
        hilo1.start();

        // Constructor: Thread(String name)
        EjemploThread hilo2 = new EjemploThread();
        hilo2.start();

        System.out.println("Y el main: " + Thread.currentThread().getName());
    }
}