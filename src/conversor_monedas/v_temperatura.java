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
import javax.swing.JTextArea;

public class v_temperatura extends JFrame{
    private JLabel titulo;
    private JLabel titulo_v;
    private JComboBox temperatura;
    private JButton buton_convertir;
    private JTextField valor_combertir;
    

    public JTextField getValor_combertir() {
        return valor_combertir;
    }

    public void setValor_combertir(JTextField valor_combertir) {
        this.valor_combertir = valor_combertir;
    }

    public JTextArea getResultado() {
        return resultado;
    }

    public void setResultado(JTextArea resultado) {
        this.resultado = resultado;
    }
    private JTextArea resultado;
  

    public JComboBox getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(JComboBox temperatura) {
        this.temperatura = temperatura;
    }

    public JButton getButon_convertir() {
        return buton_convertir;
    }

    public void setButon_convertir(JButton buton_convertir) {
        this.buton_convertir = buton_convertir;
    }
public v_temperatura() {
		setVisible(true);
		setTitle("Temperatura");
		setBounds(500,200,400,200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel lamina_m = new JPanel();
		lamina_temperatuara temperatura = new lamina_temperatuara();
		lamina_m.add(temperatura);
		add(lamina_m);
		
	}
	
	
class lamina_temperatuara extends JPanel{
	
	public lamina_temperatuara() {
		setLayout(new BorderLayout());
		titulo = new JLabel("Elija el tipo temperatura que desea convertir");
		titulo.setFont(new Font("Serif", Font.PLAIN, 18));
		add(titulo, BorderLayout.NORTH);
		temperatura = new JComboBox();
                temperatura.addItem("Celsius a Fahrenheit");
		temperatura.addItem("Fahrenheit a Celsius");
		temperatura.addItem("Celsius a kelvin");
                temperatura.addItem("kelvin a Celsius");
                temperatura.addItem("Fahrenheit a kelvin");
                temperatura.addItem("kelvin a Fahrenheit");
                temperatura.setBorder(new EmptyBorder(10,10,10,10));
		add(temperatura, BorderLayout.NORTH);
                titulo_v = new JLabel("valor");
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
                        v_moneda v = new v_moneda();
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
                        int tipoConvertir = temperatura.getSelectedIndex();
                        
                        double resul;
                        caluculo_datos puente = new caluculo_datos();
                        puente.setTipo_calculo(0);
                        puente.setTipo(tipoConvertir);
                        try{
                            double cantidad = Double.parseDouble(valor_combertir.getText().trim().replace(",", "."));
                            puente.setValor_inicial(cantidad);
                            resul = puente.calcular();
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
