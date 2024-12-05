
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Tile extends Rectangle{
    
    public Tile(int x, int y){
        setBounds(x,y,32,32);
    }
    
    public void render(Graphics g){
        g.setColor(new Color(63, 72, 204));
        g.fillRect(x, y, width, height);
    }
}
