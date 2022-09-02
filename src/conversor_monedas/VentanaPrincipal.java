/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor_monedas;

import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author wellintonleuis
 */

   
    class VentanaPrincipal extends JFrame{
        
        public VentanaPrincipal() {
		setTitle("Conversor");
		setBounds(400,200,400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel lamina_m = new JPanel();
		LaminaMenu l_m = new LaminaMenu();
		lamina_m.add(l_m);
		add(lamina_m);
                
		
	}
        class LaminaMenu extends JPanel{
        JLabel titulo;
        JComboBox menu;
        JButton salir;
        public LaminaMenu() {
		setLayout(new BorderLayout());
                titulo = new JLabel("Eliga la Opcion que desea realizar");
		titulo.setFont(new Font("Serif", Font.PLAIN, 18));
		add(titulo, BorderLayout.NORTH);
                menu = new JComboBox();
                menu.setBorder(new EmptyBorder(20,10,10,20));
		menu.addItem("Conversor de Monedas");
		menu.addItem("Conversor de Temperatura");
		add(menu, BorderLayout.CENTER);
                menu.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int opcion = menu.getSelectedIndex();
                        //JOptionPane.showMessageDialog(null, opcion);
                        if(opcion == 0){
                            v_moneda menuMoneda = new v_moneda();
                            menuMoneda.setVisible(true);
                        }else{
                            v_temperatura menuTemperatura = new v_temperatura();
                            menuTemperatura.setVisible(true);
                        }
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                    
                });
                
                salir = new JButton("Salir");
		JPanel l_b = new JPanel();
		l_b.setBorder(new EmptyBorder(10,10,10,10));
		l_b.add(salir);
		add(l_b, BorderLayout.SOUTH);
                salir.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                        
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                    
                });
                

	}
        
        
    }
}

    
    