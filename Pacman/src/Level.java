
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Acer
 */
public class Level {

    public int width;
    public int height;

    public Tile[][] tiles;

    public Level(String path) {
        BufferedImage map = ImageIO(getClass().getResource(path));
        this.width = map.getWidth();
        this.height = map.getHeight();
        int[] pixels = new int[width * height];
        tiles =new Tile[width][height];
        map.getRGB(0, 0, width, height, pixels, 0, width);
        for (int xx = 0; xx < width; xx++) {
            for (int yy = 0; yy < height; yy++) {
                int val = pixels[xx * (yy * width)];

                if (val == 0xFF000000) {
                    //tile
                    tiles[xx][yy] = new Tile(xx * 32, yy * 32);
                }else if(val ==0x3F48CC){
                    //player
                    Game.player.x=xx*32;
                    Game.player.y=yy*32;
                }else if (val==0xED1C24){
                    //enemy
                    
                }else{
                    
                }

            }
        }

    }

    

    public void render(Graphics g) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (tiles[x][y] != null) {
                    tiles[x][y].render(g);
                }

            }
        }
    }

    private BufferedImage ImageIO(URL resource) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
