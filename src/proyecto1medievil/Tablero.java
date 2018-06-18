package proyecto1medievil;

import javax.swing.*;
import java.awt.*;

public class Tablero {
    
    int tamcas=0;
    JPanel fondo=null;
    int[][] vecl;
    JLabel[][] vecg;
    public int[][] pos;
    public static int[] x;
    public static int[] y;
    private int tambloquex = 0;
    private int tambloquey = 0;   
    public Personaje per;
    public Principal prueba;
    static int xx,yy;
    int tip= 1;
    
    public Tablero(int tam,JPanel panel){
   
        this.tamcas=tam;
        this.fondo=panel;
        llenar();  
    }
    
    public void llenar(){
    
        tambloquex = 600/tamcas;
        tambloquey = 600/tamcas;
        vecl = new int[tamcas][tamcas];
        vecg = new JLabel[tamcas][tamcas];
        int dper = (int)(tamcas*tamcas*.10);
        int cper = (int)(tamcas*tamcas*.05);
        
        per = new Personaje();
        pos = new int[3][3];
        x = new int[3];
        y = new int [3];
        
       
        
        for(int i=0;i<tamcas;i++){
            for(int j=0;j<tamcas;j++){
                vecl[i][j]=0; 
            }
        }
        
        for(int k=0;k<dper;k++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --k;
            }else{
                vecl[xx][yy]=7;
            }
        }
        
        for(int z=0;z<cper;z++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --z;
            }else{
                vecl[xx][yy]=8;
            }
        }
        
        for(int m=0;m<1;m++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --m;
            }else{
                vecl[xx][yy]=1;
            }
        }
        
        for(int c=0;c<1;c++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --c;
            }else{
                vecl[xx][yy]=2;
            }
        }
        
        for(int p=0;p<1;p++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --p;
            }else{
                vecl[xx][yy]=3;
            }
        }
        
        for(int M=0;M<1;M++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --M;
            }else{
                vecl[xx][yy]=4;
            }
        }
        
        for(int C=0;C<1;C++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --C;
            }else{
                vecl[xx][yy]=5;
            }
        }
        
        for(int P=0;P<1;P++){
            xx=(int)(Math.random()*tamcas);
           yy=(int)(Math.random()*tamcas);
            if(vecl[xx][yy]!=0){
                --P;
            }else{
                vecl[xx][yy]=6;
            }
        }
        
        for(int ui=0;ui<tamcas;ui++){
            for(int uj=0;uj<tamcas;uj++){
                if(vecl[ui][uj]==1){
                    pos[0][0]=vecl[ui][uj];
                    x[0]=ui;
                    y[0]=uj;
                }
                
                if(vecl[ui][uj]==2){
                    pos[0][0]=vecl[ui][uj];
                    x[1]=ui;
                    y[1]=uj;
                }
                
                if(vecl[ui][uj]==3){
                    pos[0][0]=vecl[ui][uj];
                    x[2]=ui;
                    y[2]=uj;
                }
            }
        }
        repintar();
    }
    
    public void repintar(){
        tip++;
    
        JLabel casilla=null;
        for(int i=0;i<tamcas;i++){
            for(int j=0;j<tamcas;j++){
                
                if(vecl[i][j]==0){
                    casilla = new JLabel();
                }else if(vecl[i][j]==1){
                    per =new Personaje();
                    per.obtenerimagen(tambloquex,tambloquey);
                    casilla = new JLabel(per.obtenerimagen(tambloquex,tambloquey));
                }else if(vecl[i][j]==2){
                    per = new Personaje();
                    per.obtenerimagen2( tambloquey);
                    casilla = new JLabel(per.obtenerimagen2(tambloquey));
                    casilla = new JLabel(per.obtenerimagen2(tambloquey));
                }else if(vecl[i][j]==3){
                    //per = new Personaje();
                    per.obtenerimagen3( tambloquey);
                    casilla=new JLabel(per.obtenerimagen3( tambloquey));  
                    
                }else if(vecl[i][j]==4){
                    per = new Personaje();
                    per.obtenerimagen4(tambloquey);
                    casilla = new JLabel(per.obtenerimagen4(tambloquey)); 
                }else if(vecl[i][j]==5){
                    per = new Personaje();
                    per.obtenerimagen5( tambloquey);
                    casilla = new JLabel(per.obtenerimagen5(tambloquey));                   
                }else if(vecl[i][j]==6){
                    per = new Personaje();
                    per.obtenerimagen6( tambloquey);
                    casilla = new JLabel(per.obtenerimagen6(tambloquey));
                }else if(vecl[i][j]==7){
                    per = new Personaje();
                    per.obtenerimagen7( tambloquey);
                    casilla = new JLabel(per.obtenerimagen7(tambloquey));
                }else if (vecl[i][j] == 8){
                    per = new Personaje();
                    per.obtenerimagen8(tambloquey);
                    casilla = new JLabel(per.obtenerimagen8(tambloquey));
                    
                }
                
                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(Color.black));

                casilla.setBounds(i * tambloquex, j * tambloquey, tambloquex, tambloquey);

                vecg[i][j] = casilla;
                fondo.add(vecg[i][j], BorderLayout.CENTER);
            }
        }
        fondo.repaint();
    }  
}
