
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Acer
 */

//Canvas é uma classe que representa uma área retangular que se pode desenhar gráficos
//Runnable é uma interface implementada na class Game, que significa que o jogo pode ser executada como uma thread separada
//KeyListener é outra interface, que lida com os eventos do teclado
public class Game extends Canvas implements Runnable, KeyListener {

    private boolean isRunning = false;

    public static final int width = 640, height = 480;
    public static final String title = "PacMan";

    private Thread thread;

    public static Player player;
    public static Level level;

    public Game() {
        Dimension dimension = new Dimension(Game.width, Game.height);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        addKeyListener(this);
        player = new Player(Game.width / 2, Game.height / 2);
       
            
        
               
        
    }
    
    //Um método sincronizado garante que apenas uma thread pode sexecutar o método de cada vez
    public synchronized void start() {
        if (isRunning) {
            return;
        }
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (isRunning) {
            return;
        }
        isRunning = false;
        try {
            thread.join();//
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void tick() {
        //System.out.println("Working");
        player.tick();
    }

//Este é o método responsável por renderizar os gráficos do jogo    
    private void render() {
        BufferStrategy bs = getBufferStrategy();
        //Caso o buffer seja nulo, cria automaticamente 3 buffers
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();//permite desenhar gráficos na memória associada ao buffer atual
        
        g.setColor(Color.BLACK);//cor de fundo
        g.fillRect(0, 0, Game.width, Game.height);//preenche o retângulo correspondente ao tamanho da janela

        player.render(g);//permite que o jogador seja desenhado
        
        
        g.dispose();//libera os recursos do objeto "Graphics"
        
        bs.show();//Após a renderização estar completa, o método "show" exibe os gráficos desenhados no Buffer
    }

    public void run() {
        requestFocus();//Mantém o foco na janela do jogo
        int fps = 0;//Contador de frames por segundo
        long lastTime = System.nanoTime();//guarda o tempo do inicio do loop em nanosegundos
        double timer = System.currentTimeMillis();//guarda o tempo em milisegundos
        double targetTick = 60.0;//define o máximo de fps
        double delta = 0;//tempo acumulado desde o último tick
        double ns = 1000000000 / targetTick;

        while (isRunning) {
            long now = System.nanoTime();//obtém o tempo atual em nanosegundos
            delta += (now - lastTime) / ns;//calcula o tempo decorrido desde o último loop 
            lastTime = now;

            while (delta >= 1) {
                tick();
                render();
                fps++;
                delta--;
            }
            //Caso tenha passado pelo menos 1seg desde a última impressão...
            if (System.currentTimeMillis() - timer >= 1000) {
                System.out.println(fps);//imprime o número de frames processados no último segundo
                fps = 0;//da reset ao contador de fps
                timer += 1000;

            }

        }
        stop();
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame(); 
        frame.setTitle(Game.title);
        frame.add(game);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        game.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int KeyCode = e.getKeyCode();

        switch (KeyCode) {
            case KeyEvent.VK_RIGHT:
                player.right = true;
                break;
            case KeyEvent.VK_LEFT:
                player.left = true;
                break;
            case KeyEvent.VK_UP:
                player.up = true;
                break;
            case KeyEvent.VK_DOWN:
                player.down = true;
                break;
            default:
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int KeyCode = e.getKeyCode();

        switch (KeyCode) {
            case KeyEvent.VK_RIGHT:
                player.right = false;
                break;
            case KeyEvent.VK_LEFT:
                player.left = false;
                break;
            case KeyEvent.VK_UP:
                player.up = false;
                break;
            case KeyEvent.VK_DOWN:
                player.down = false;
                break;
            default:
                break;
        }

    }


    

}
