package Contenedores;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame{
    
    JPanel panel;
    JButton btnPanel;
    
    public Principal(){
        //Titulo
        setTitle("Jframe Principal");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        btnPanel = new JButton();
        
        add(panel);
    }
    
}
