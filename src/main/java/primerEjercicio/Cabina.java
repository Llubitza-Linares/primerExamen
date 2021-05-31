package primerEjercicio;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Cabina {
    private static Cabina instance = null;
    private Map<String, Vehiculo>matriculacion=new HashMap<>();
    private Map<String, Integer> monto= new HashMap<>();
    private List<String> vehiculo = new LinkedList<>();
    private Cabina(){

    }

    public static synchronized void Instance(){
        if (instance==null)
           instance = new Cabina();

    }

    public static synchronized Cabina getInstance(){
        if(instance ==null)
            Instance();
        return instance;
    }

    public synchronized void pagar(Vehiculo v, int monto) {
        if (!vehiculo.contains(v.placa)) {
            this.monto.put(v.placa, monto);
            vehiculo.add(v.placa);
        } else {
            this.monto.put(v.placa, monto + this.monto.get(v.placa));
        }
        matriculacion.put(v.placa, v);
    }

    public synchronized void show(){
        for (String s: vehiculo){
            matriculacion.get(s).show();
            System.out.println("Monto"+monto.get(s));
        }
    }
}
