
package aplicacion.codificacion.aritmetica;

/* Clase que crea el objeto para codificar el mensaje en codificaci�n Aritmetica */
public class Aritmetica {
        StringBuffer mensaje;
        
        float[] prim;
        float[] seg;
        float[] L;
        float[] H;
        
        boolean bandera = false;
        String mensajeAritmetico = "";
        String mensLow = "";
        String mensHigh = "";
        float low = (float) 0;
        float lowAux = (float) 0;
        float high = (float) 0;
        float lowAntes = (float) 0;
        
    public Aritmetica(StringBuffer m, float[] p, float[] s) {
        mensaje=m;
        prim=p;
        seg=s;
    }
    
   
    public String crearMensajeAritmetico() {
        
        
        
        
        /**
         * Hn = (H-L) * Li + L; Jn = (H-L) * Hn + L;
         *
         */
        for (int i = 0; i <= mensaje.length() - 1; i++) {
            if (i == 0) {
                low = prim[(int) mensaje.charAt(i)];
                high = seg[(int) mensaje.charAt(i)];
            } else {
                lowAntes = low;
                low = (high - lowAntes) * prim[(int) mensaje.charAt(i)] + lowAntes;     // Limite Inferior
                high = (high - lowAntes) * seg[(int) mensaje.charAt(i)] + lowAntes;     // Limite Superior
               System.out.println("LOW: "+low);
                System.out.println("HIGH: "+high);
                
            }
        }
        VentanaPrincipal.jLabel_intervaloFinal.setText("[ "+low+", "+high+" )");
        System.out.println("*******INTERVALO FINAL*******["+low+", "+high+" )");
        System.out.println(low);
        lowAux=low;
        while (low != 1) {
            low = low * 2;
            if (low > 1) {
                mensLow = mensLow + "1";
                low = low - 1;
            } else if (low == 1) {
                mensLow = mensLow + "1";
            } else {
                mensLow = mensLow + "0";
            }
            if ((!bandera) && (low != 1)) {
                high = high * 2;
                if (high > 1) {
                    mensHigh = mensHigh + "1";
                    high = high - 1;
                } else if (high == 1) {
                    bandera = true;
                    mensHigh = mensHigh + "1";
                } else {
                    mensHigh = mensHigh + "0";
                }
            }

        }

        if (bandera) {
            mensajeAritmetico = mensHigh;
        } else {
            mensajeAritmetico = mensLow;
        }
        
        mensajeAritmetico="0."+mensajeAritmetico;
        
        return (mensajeAritmetico);
    }
}
