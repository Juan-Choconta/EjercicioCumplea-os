
package cumpleaños;
import java.util.*;


public class Cumpleaños {
    
    public static int Elmayor(int Años, Velas[] vectorVelas){
        
        int mayor=0;
        
            for(int i=0;i<Años;i++){
        if(vectorVelas[i].altura>mayor){
            mayor=vectorVelas[i].altura;
        }
    }
            return mayor;
    }
    
    public static int VelasApagadas(int Años, int mayor,Velas[] vectorVelas ){
        
        int cont=0;
        
        for(int i=0;i<vectorVelas.length;i++){
            if(mayor==vectorVelas[i].altura){
                cont++;
            }
            
        }
        return cont;
    }

    public static void main(String[] args) {
         
        Scanner input =new Scanner (System.in);
        Random R=new Random();
        
        
        int Años; 
        
    
        System.out.println("Ingrese la edad: ");
        Años=input.nextInt();
    

   Velas vectorVelas[]=new Velas [Años];
    Persona p= new Persona(Años);
        
    
 
    for(int i=0;i<Años;i++){
        
    int alt=R.nextInt(7) + 1;
    Velas v = new Velas(alt);      
    vectorVelas[i] = v; 
    }
    
    
    int mayor = Elmayor( Años, vectorVelas);
    
        System.out.println("La cantidad de velas apagas es: "+VelasApagadas(Años, mayor,vectorVelas));
    }
    
}
