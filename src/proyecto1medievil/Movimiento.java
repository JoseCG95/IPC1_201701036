package proyecto1medievil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Movimiento extends Thread {
    public int cant=0;
    public Tablero tab=null;
    public Movimiento(int cant, Tablero tab){
        this.cant=cant;
        this.tab=tab;  
    }
    
    public boolean comprobarFin(){
        if(tab.per.posponer>=tab.tamcas-1){
          return true;
        }
          return false;
    }
    
    public void moverAbajo(int cant) throws InterruptedException{
    
        if(cant<=0){
            return;
        }
        if(comprobarFin()){
        
            cant=0;
            tab.vecl[tab.tamcas-1][tab.tamcas-1]=0;
            tab.vecg[tab.tamcas-1][tab.tamcas-1].setIcon(null);
            tab.per.posponer=0;
            tab.vecl[0][0]=1;
            tab.repintar();
            return;
        }else{
        
            tab.vecl[tab.per.posponer][tab.per.posponer]=0;
            tab.vecg[tab.per.posponer][tab.per.posponer].setIcon(null);
            tab.repintar();
            tab.per.posponer+=1;
            tab.repintar();
            cant--;
            Thread.sleep(500);
            moverAbajo(cant);
        }
    }
    
    public void run(){
    
        try{
        
            moverAbajo(cant);
        }catch(InterruptedException ex){
        
            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
}
