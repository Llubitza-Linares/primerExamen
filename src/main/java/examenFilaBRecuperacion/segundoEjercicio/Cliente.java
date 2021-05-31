package examenFilaBRecuperacion.segundoEjercicio;

public class Cliente {

    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setTamano("6 pulg");
        celular.setPeso("60");
        celular.setCamara(new Camara( "10",  "5 mp"));
        celular.setImei("10001");
        celular.setOrigen("Bolivia");

        Celular celular1=(Celular) celular.clone();
        celular1.setModelo("A10");
        celular1.setTamano("7 pulg");
        celular1.setPeso("80");
        celular1.setCamara(new Camara( "5", "3 mp"));
        celular1.setImei("10002");
        celular1.setOrigen("Bolivia");

        Celular celular2=(Celular) celular.clone();
        celular2.setModelo("S10");
        celular2.setTamano("6 pulg");
        celular2.setPeso("70");
        celular2.setCamara(new Camara( "20",  "5 mp"));
        celular2.setImei("10002");
        celular2.setOrigen("Colombia");

        Celular celular3=(Celular) celular.clone();
        celular3.setModelo("A50");
        celular3.setTamano("8 pulg");
        celular3.setPeso("60");
        celular3.setCamara(new Camara("10",  "8 mp"));
        celular3.setImei("10003");
        celular3.setOrigen("Bolivia");

        Celular celular4=(Celular) celular.clone();
        celular4.setModelo("A30S");
        celular4.setTamano("5 pulg");
        celular4.setPeso("80");
        celular4.setCamara(new Camara( "8",  "5 mp"));
        celular4.setImei("10002");
        celular4.setOrigen("Bolivia");

        Celular celular5=(Celular) celular.clone();
        celular5.setModelo("A51");
        celular5.setTamano("5 pulg");
        celular5.setPeso("60");
        celular5.setCamara(new Camara("15", "10 mp"));
        celular5.setImei("10003");
        celular5.setOrigen("Peru");

        celular1.showInformation();
        celular2.showInformation();
        celular3.showInformation();
        celular4.showInformation();
        celular5.showInformation();
    }
}
