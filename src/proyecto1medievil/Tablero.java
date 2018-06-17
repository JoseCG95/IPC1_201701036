package proyecto1medievil;

import javax.swing.*;
import java.awt.*;

public class Tablero {
    
    int tamaño=0;
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
    static int a,b;
    
    public Tablero(int tam,JPanel panel){
        
        this.tamaño=tam;
        this.fondo=panel;
        llenar();  
    }
    
    public void llenar(){
    
        tambloquex = 700/tamaño;
        tambloquey = 700/tamaño;
        vecl = new int[tamaño][tamaño];
        vecg = new JLabel[tamaño][tamaño];
        int diez = (int)(tamaño*tamaño*.10);
        int cinco = (int)(tamaño*tamaño*.05);
        
        per = new Personaje();
        pos = new int[3][3];
        x = new int[3];
        y = new int [3];
        
        int tipojug = 1;
        int count1=0;
        int count2=0;
        
        for(int i=0;i<tamaño;i++){
            for(int j=0;j<tamaño;j++){
                vecl[i][j]=0; 
            }
        }
        
        for(int z=0;z<cinco;z++){
            a=(int)(Math.random()*tamaño);
            b=(int)(Math.random()*tamaño);
            if(vecl[a][b]!=0){
                --z;
            }else{
                vecl[a][b]=7;
            }
        }
        
        for(int ui=0;ui<tamaño;ui++){
            for(int uj=0;uj<tamaño;uj++){
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
    
        JLabel casilla=null;
        for(int i=0;i<tamaño;i++){
            for(int j=0;j<tamaño;j++){
                if(vecl[i][j]==0){
                    casilla = new JLabel();
                }else if(vecl[i][j]==1){
                    per =new Personaje();
                    per.obtenerimagen(tambloquex,tambloquey);
                    casilla = new JLabel(per.obtenerimagen(tambloquex,tambloquey));
                }else if(vecl[i][j]==2){
                    per = new Personaje();
                    casilla = new JLabel(per.obtenerimagen2(tambloquey));
                }else if(vecl[i][j]==3){
                    ImageIcon per1= new ImageIcon(getClass().getResource("/Imagenes/mago.jpg"));
                    casilla=new JLabel();
                    casilla.setIcon(per1);
                }else if(vecl[i][j]==4){
                    per = new Personaje();
                    casilla = new JLabel(per.obtenerimagen6(tambloquey)); 
                }else if(vecl[i][j]==5){
                    per = new Personaje();
                    casilla = new JLabel(per.obtenerimagen7(tambloquey));                   
                }else if(vecl[i][j]==6){
                    per = new Personaje();
                    casilla = new JLabel(per.obtenerimagen8(tambloquey));
                }else if(vecl[i][j]==8){
                    per = new Personaje();
                    casilla = new JLabel(per.obtenerimagen3(tambloquey));
                }else if (vecl[i][j] == 7){
                    prueba = new Prueba();
                    casilla = new JLabel(prueba.obtenerimagen(tambloquey));
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
