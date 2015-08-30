package Logica;
import java.util.Random;

public class juego{
	private static final int largo=5;
    public static void main(String args[]){
        String adiv = crearNum(); 
        boolean win = false, valida;
        String entrada = "";
        int intentos = 1;
        
        System.out.println("Se ha generado un numero de "+largo+" cifras, intente adivinarlo!!");
        System.out.println("Presione Q para terminar con el programa");
        while (!win) {
            valida = false;
            while(!valida){
                entrada=Teclado.LeerCadena();
                valida = esEntradaValida(entrada);
                if(!valida)
                    System.out.println("La entrada no es valida. \nRecuerde: 5 digitos diferentes");
                }
            if ((entrada.charAt(0) != 'q') && (entrada.charAt(0) != 'Q')) {
                int bien = cantBien(entrada,adiv);
                if (bien < largo){  
                    if (bien>0) {
                        System.out.print(bien+"B");
                    }
                    int reg = cantReg(entrada,adiv);
                    if (reg>0){
                        System.out.print(reg+"R");
                    }
                    if (bien+reg<largo){
                        System.out.print(largo-bien-reg+"M");
                    }
                    intentos++;
                    System.out.println("");
                }else{ 
                    win = true;
                    System.out.println("===============================================");
                    System.out.println("FELICITACIONES HA CONSEGUIDO AVIDINAR EL NUMERO");
                    System.out.println("CANTIDAD DE INTENTOS: "+intentos);
                    System.out.println("==============================================="); 
                }
            }else{
                System.out.println("===============================");
                System.out.println("JUEGO FINALIZADO POR EL USUARIO");
                System.out.println("===============================");
                win = true;
            }
        }
        
    
       
    }
    
    public static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            // s is not numeric
            return false;
        }
    };

    public static boolean esEntradaValida (String ent) {
        boolean bool;
        boolean[] a;
        byte rec=0;
        if (ent.charAt(0)!='q' && ent.charAt(0)!='Q'){
            if ((!isNumeric(ent)) || (ent.length()!=largo))
                bool = false;
            else{
                a = new boolean[10];
                for(byte i=0;i<largo;i++){
                   a[i]=false;
                }
             
                do{
                    if(!a[Integer.parseInt(""+ent.charAt(rec))]){
                        a[Integer.parseInt(""+ent.charAt(rec))]=true;
                    }
                    rec++;
                }while(rec<largo && !a[Integer.parseInt(""+ent.charAt(rec))]);
                bool= rec==largo;
            }
        }else
            bool=true;
        return bool;
    }
    public static int cantBien (String ingreso, String numero) {
        int contador = 0;
        for (int i = 0; i < largo; i++) {
           if (ingreso.charAt(i) == numero.charAt(i)) {
                contador++;
           } 
        }
        return contador;
    }
    
    public static int cantReg (String ingreso, String numero) {
        int contador = 0;
        for (int j=0; j < largo; j++) {
            for (int k=0; k < largo; k++) {
                if(ingreso.charAt(k) == numero.charAt(j)) {
                    contador++;
                }
            }
        }
        return (contador-cantBien(ingreso,numero));
    }
        
             
    
    public static String crearNum (){
        Random ran=new Random();
        boolean esta=false;
        byte[] numeroAux = new byte[largo];
        byte numero=0, digito=0, digitoComparador;
        String Devolucion="";
        
        //grabo los nuevo digitos, al mismo tiempo los comparo
        while(digito!=largo){
            numero=(byte)ran.nextInt(10);
            digitoComparador=digito;
            while(!esta&&digitoComparador>0){
                digitoComparador--;
                if(numeroAux[digitoComparador]==numero){
                    esta=true;
                }
            }
            if(!esta){
                numeroAux[digito]=numero;
                digito++;
            }else{
                esta=false;
            }
        }
        
        //transformo mi arreglo de byte al numero a devolver
        for(int i=0;i!=largo;i++){
            Devolucion=Devolucion+numeroAux[i];
        }
        
        //retorno devolucion
        return Devolucion;
        
    }
    
}