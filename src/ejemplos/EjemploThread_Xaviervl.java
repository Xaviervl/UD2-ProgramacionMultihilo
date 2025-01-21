package ejemplos;

public class EjemploThread_Xaviervl extends Thread {
    @Override
    public void run() {
        System.out.println("Hilo corriendo " + Thread.currentThread().getName());
    }
}

class Main2{
    public static void main(String[] args) {
        // creamos un objeto
        EjemploThread_Xaviervl hilo1 = new EjemploThread_Xaviervl();
        hilo1.start();

        EjemploThread_Xaviervl hilo2 = new EjemploThread_Xaviervl();
        hilo2.start();

        System.out.println("Hilo principal " + Thread.currentThread().getName());
    }
}
