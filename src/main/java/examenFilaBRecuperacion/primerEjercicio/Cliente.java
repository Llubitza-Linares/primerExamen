package examenFilaBRecuperacion.primerEjercicio;

public class Cliente {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Pago singleton = Pago.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(1659873);
                e.setNombre("Juan");
                singleton.pagar(e, "8:00", 10540);
                singleton.mostrarInfo();
                System.out.println("*******");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Pago singleton = Pago.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(546541);
                e.setNombre("Alex");
                singleton.pagar(e, "5:00", 1111);
                singleton.mostrarInfo();
                System.out.println("*******");

            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Pago singleton = Pago.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(541874);
                e.setNombre("Adrian");
                singleton.pagar(e, "4:56", 2229);
                singleton.mostrarInfo();
                System.out.println("*******");

            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Pago singleton = Pago.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(796855);
                e.setNombre("Alejandro");
                singleton.pagar(e, "7:00", 107740);
                singleton.mostrarInfo();
                System.out.println("*******");

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
