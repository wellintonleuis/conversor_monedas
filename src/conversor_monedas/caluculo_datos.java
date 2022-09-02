package conversor_monedas;

public class caluculo_datos {
	
	public caluculo_datos() {
		
	}
	
	public int getTipo_calculo() {
		return tipo_calculo;
	}
	public void setTipo_calculo(int tipo_calculo) {
		this.tipo_calculo = tipo_calculo;
	}
	public double getValor_inicial() {
		return valor_inicial;
	}
	public void setValor_inicial(double valor_inicial) {
		this.valor_inicial = valor_inicial;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getResultado() {		
		return resultado;
	}

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
        
	
	public double calcular() {
		// TODO Auto-generated method stub
		if(tipo_calculo == 0 ) { //calcular moneda
                    if(tipo== 0) { // peso a dolar
                        resultado = valor_inicial/53.15;
                    }
                    else if(tipo== 1) {
			//convertir de peso a Euro
                        System.out.println(tipo);
                        resultado = valor_inicial/53.2;
                    }
                    if(tipo== 2) { 
			//convertir de peso RD$ a libra
                        resultado = valor_inicial/62.5;
                    }
                    if(tipo== 3) { 
			//De Pesos A Yen
                        resultado = valor_inicial* 0.39;
                    }
                    if(tipo== 4) { 
			//De Pesos A Won Coreano
                        resultado = valor_inicial*0.04;
                    }
                    if(tipo== 5) { 
			//De Dolar a Pesos
                        resultado = valor_inicial*53.15;
                    }
                    if(tipo== 6) { 
			//De Euro A Pesos
                        resultado = valor_inicial*53.20;
                    }
                    if(tipo== 7) { // cambiar a dolar
			//De Libras A Pesos
                        resultado = valor_inicial*62.5;
                    }
                }else if(tipo_calculo == 1){
                    switch (tipo) {
                        case 0:
                            //de c a f
                            resultado = (valor_inicial * (9/5)) + 32;
                            break;
                        case 1:
                            //de f a c
                            resultado = (valor_inicial - 32 )* (9/5);
                            break;
                        case 2:
                            //de c a k
                            resultado = valor_inicial + 273.15;
                            break;
                        case 3:
                            //de k a c
                            resultado = valor_inicial - 273.15;
                            break;
                        case 4:
                            //de f a k
                            resultado = (valor_inicial - 32) * (5/9) + 273.15;
                            break;
                        case 5:
                            //de k a f
                            resultado = (valor_inicial - 273.15) * (9/5) + 32;
                            break;
                        default:
                            break;
                    }
                
                }
            return resultado;
        }


	private int tipo_calculo;
	private double valor_inicial;
	private int tipo;
	private double resultado;
       
        

}
