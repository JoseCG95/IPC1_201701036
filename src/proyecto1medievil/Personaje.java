package proyecto1medievil;

import javax.swing.*;
import java.awt.*;

public class Personaje {
    
    
    public int posponer=0;
    public ImageIcon obtenerimagen(int tamx , int tamy){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/mago.jpg"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    public ImageIcon obtenerimagen2(int tamy){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/caballero.jpg"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    public ImageIcon obtenerimagen3(int tamy){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/princesa.png"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    
    public ImageIcon obtenerimagen4(int tamy){
        
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/mago1.jpg"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    public ImageIcon obtenerimagen5( int tamy){
        
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/caballero1.jpg"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    
    
    public ImageIcon obtenerimagen6( int tamy){
        
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/princesa1.png"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    public ImageIcon obtenerimagen7(int tamy){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/corazon.jpg"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    
    public ImageIcon obtenerimagen8( int tamy){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/bomba.png"));
        Image img = per.getImage();
        Image tamimagen = img.getScaledInstance(150,tamy,Image.SCALE_SMOOTH);
        per = new ImageIcon(tamimagen);
        return per;
    }
    
    
}
