package conversor_monedas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class v_moneda extends JFrame {

    public JComboBox getMonedas() {
        return monedas;
    }

    public void setMonedas(JComboBox monedas) {
        this.monedas = monedas;
    }

    public JButton getButon_convertir() {
        return buton_convertir;
    }

    public void setButon_convertir(JButton buton_convertir) {
        this.buton_convertir = buton_convertir;
    }
    
    private JLabel titulo;
    private JComboBox monedas;
    private JButton buton_convertir;
    private JLabel titulo_v;

    public JTextField getValor_combertir() {
        return valor_combertir;
    }

    public void setValor_combertir(JTextField valor_combertir) {
        this.valor_combertir = valor_combertir;
    }
    private JTextField valor_combertir;
	public v_moneda() {
		
		setTitle("Moneda");
		setBounds(500,200,500,200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel lamina_m = new JPanel();
		lamina_moneda moneda = new lamina_moneda();
		lamina_m.add(moneda);
		add(lamina_m);
		

	}
	
	
class lamina_moneda extends JPanel{
	
	public lamina_moneda() {
                setLayout(new BorderLayout());
		titulo = new JLabel("Eliga la moneda que desea convertir tu dinero");
		titulo.setFont(new Font("Serif", Font.PLAIN, 18));
		add(titulo, BorderLayout.NORTH);
		monedas = new JComboBox();
		monedas.addItem("De Pesos A Dolar");
		monedas.addItem("De Pesos A Euro");
		monedas.addItem("De Pesos A Libras");
		monedas.addItem("De Pesos A Yen");
		monedas.addItem("De Pesos A Won Coreano");
		monedas.addItem("De Dolar A Pesos");
		monedas.addItem("De Euro A Pesos");
		monedas.addItem("De Libras A Pesos");
		add(monedas, BorderLayout.NORTH);
                titulo_v = new JLabel("Cantidad");
		titulo_v.setFont(new Font("Serif", Font.PLAIN, 18));
                titulo_v.setBorder(new EmptyBorder(10,10,10,10));
                add(titulo_v, BorderLayout.WEST);
                valor_combertir = new JTextField("");
                valor_combertir.setBorder(new EmptyBorder(10,10,10,10));
                add(valor_combertir, BorderLayout.CENTER);
		buton_convertir = new JButton("Convertir");
		JPanel l_b = new JPanel();
		l_b.setBorder(new EmptyBorder(10,50,50,50));
		l_b.add(buton_convertir);
                JButton salir = new JButton("Salir");
                l_b.add(salir);
                salir.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                    
                });
		add(l_b, BorderLayout.SOUTH);
                buton_convertir.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(valor_combertir.getText().isEmpty()){
                           JOptionPane.showMessageDialog(null,"Por favor digite el valor a combertir","Error",0); 
                        }
                        //JOptionPane.showMessageDialog(null, cantidad);
                        int tipoConvertir = monedas.getSelectedIndex();
                        
                        double resul;
                        caluculo_datos puente = new caluculo_datos();
                        puente.setTipo_calculo(0);
                        puente.setTipo(tipoConvertir);
                        try{
                            double cantidad = Double.parseDouble(valor_combertir.getText().trim().replace(",", "."));
                            puente.setValor_inicial(cantidad);
                            resul = Math.round((puente.calcular()*100.0)/100.0);
                            puente.setResultado(resul);
                            JOptionPane.showMessageDialog(null, puente.getResultado());
                        }catch(NumberFormatException err){
                            valor_combertir.setText("");
                            JOptionPane.showMessageDialog(null,"Debe digital valores numericos!!","Error",0);
                        }
                        
                        
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                    
                });
            
            

	}

		
    }
	
}