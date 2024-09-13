package projectjavadimas.validasi;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Validasi {
    
     public void valAngka(java.awt.event.KeyEvent evt, int a, int b) {

        char karakter = evt.getKeyChar();

        if (!((karakter <= '9') && (karakter >= '0')) || a > b - 1) {
            evt.consume();
        }
        
    }
    

    char beforeUname;

    public void valUname(java.awt.event.KeyEvent evt, int a, int b) {

        char karakter = evt.getKeyChar();
        if (a == 0) {
            beforeUname = KeyEvent.VK_SPACE;
        }

        if (!((karakter > '9') && (karakter < '0') || (karakter >= 'a') && (karakter <= 'z') || (karakter >= 'A') && (karakter <= 'Z') || (karakter == KeyEvent.VK_SPACE)) || a > b - 1 || (beforeUname == KeyEvent.VK_SPACE && karakter == KeyEvent.VK_SPACE)) {
            evt.consume();
        } else {
            beforeUname = karakter;
        }
    }

    public void valPanjang(java.awt.event.KeyEvent evt, int a, int b) {

        if (a > b - 1) {
            evt.consume();
        }
    }

    char before;

    public void valNama(java.awt.event.KeyEvent evt, int a, int b) {

        char karakter = evt.getKeyChar();
        if (a == 0) {
            before = KeyEvent.VK_SPACE;
        }

        if (!((karakter >= 'a') && (karakter <= 'z') || (karakter >= 'A') && (karakter <= 'Z') || (karakter == KeyEvent.VK_SPACE)) || a > b - 1 || (before == KeyEvent.VK_SPACE && karakter == KeyEvent.VK_SPACE)) {
            evt.consume();
        } else {
            before = karakter;
        }
    }
    
    public boolean validasiNama(String s){
        boolean hasil = true;
        char arr[] = s.toCharArray();
        for(int a = 0; a < arr.length; a++){
            hasil = !(arr[a] >= 'a' && arr[a] <= 'z') || !(arr[a] >= 'A' && arr[a] <= 'Z');
        }
        
        return hasil;
    }
    
}
