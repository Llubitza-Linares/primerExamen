package segundoEjercicio;

public class Cliente {
    public static void main (String [] argumento) {

        Televisor televisor = new Televisor();

        televisor.setBluetooth("true");
        televisor.setResolucion("50");
        televisor.setPulgadas("80");
        televisor.setPuertoUSB("true");
        televisor.setSistemaOperativo("android");
        televisor.setVersionDelSO("11.0");
        televisor.setPuertoHdmi("true");
        televisor.setControlRemoto("true");
        televisor.setSerialDelTelevisor("");

        Televisor televisor1= (Televisor) televisor.clone();
        televisor1.setSerialDelTelevisor("1000000001");

        Televisor televisor2= (Televisor) televisor.clone();
        televisor2.setSerialDelTelevisor("1000000002");

        Televisor televisor3= (Televisor) televisor.clone();
        televisor3.setSerialDelTelevisor("1000000003");

        Televisor televisor4= (Televisor) televisor.clone();
        televisor4.setSerialDelTelevisor("1000000004");

        Televisor televisor5= (Televisor) televisor.clone();
        televisor5.setSerialDelTelevisor("1000000005");

        televisor1.showInformation();
        televisor2.showInformation();
        televisor3.showInformation();
        televisor4.showInformation();
        televisor5.showInformation();
    }
}