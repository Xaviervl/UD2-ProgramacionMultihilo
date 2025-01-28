package ejercicios.ejercicio1;

public class InfoHilo_Xaviervl implements Runnable {
    @Override
    public void run() {
        // Obtenemos el hilo actual
        Thread hiloactual = Thread.currentThread();
        // Mostramos la información del hilo actual
        System.out.println("=== Información del Hilo Actual ===");
        System.out.println("Nombre del hilo: " + hiloactual.getName()); // Mayor prioridad de hillo 10, menosr 1
        System.out.println("Prioridad del hilo: " + hiloactual.getPriority());
        System.out.println("ID del hilo: " + hiloactual.getId());


        // Contamos el número de hilos activos
        int hilosActivos = hiloactual.getThreadGroup().activeCount();
        Thread[] arrayHilosActivos = new Thread[hilosActivos];


        // Obtenemos todos los hilos activos
        int hilosReales = Thread.currentThread().getThreadGroup().enumerate(arrayHilosActivos, true);


        // Mostramos el número total de hilos activos y sus nombres
        System.out.println("\n=== Hilos Activos ===");
        for (int i = 0; i < hilosReales ; i++) {
            System.out.println((i + 1)+ " " + arrayHilosActivos[i].getName());
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // Creamos una instancia de nuestra clase
        // Creamos objeto "tipo" Runnable
        InfoHilo_Xaviervl task1 = new InfoHilo_Xaviervl();

        // Creamos un nuevo hilo con un nombre personalizado
        // Creamos un hilo y le pasamos en el contructor
        Thread hilo1 = new Thread(task1, "Hilo fav" );

        // Establecemos una prioridad personalizada (1-10)
        hilo1.setPriority(8);

        // Iniciamos el hilo
        hilo1.start();
        // Esperamos a que el hilo termine

    }
}