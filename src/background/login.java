/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package background;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Rizki Ananda
 */
public class login extends JPanel {
    private Image login;
    public login(){
        login = new ImageIcon(getClass().getResource("/Gambar/login.png")).getImage();
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(login, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
