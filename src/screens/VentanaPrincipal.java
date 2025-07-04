package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {
    public JDesktopPane desktop; //Escritorio dentro de Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu JMenuCarreras;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;

    public VentanaPrincipal(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();

    }

    private void initComponents() {
        //DesktopPane - escritotio
        desktop = new JDesktopPane();
        this.add(desktop);
        //Barar de Menu
        jMenuBar = new JMenuBar();
        this.add(jMenuBar);
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        //Elementos de menu: Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar...");
        //Elementos de menu: ver alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todo los laumnos...");

        //Menu carreraras
        JMenuCarreras = new JMenu();
        JMenuCarreras.setText("Carreras");
        //Elementos de menu: Ver carreras
        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las carreras...");
        //Elemntos de menu : Insertar carrera
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar...");


        //Agregar menuItem a menu 
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);

        JMenuCarreras.add(jMenuItemVerCarreras);
        JMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(JMenuCarreras);
        this.setJMenuBar(jMenuBar);
        pack();

    }

}
