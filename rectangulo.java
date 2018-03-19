import javax.swing.*;
public class rectangulo
{
	private double ancho=1.0;
	private double longitud=1.0;
        double leer;
	JScrollPane cuadro;
	JTextArea texto;

	public rectangulo()
	{
		cuadro= new JScrollPane(texto=new JTextArea(10,25));
	}

	public void leerdatos()
	{
		ancho=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del ancho"));
		longitud=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la longitud"));
	}

	public void perimetro()
	{
		if(ancho>=1.0 && ancho<=20.0 && longitud>=1.0 && longitud<=20.0)
		{
		  texto.append("El perimetro del rectangulo es "+ (ancho+longitud)+"\n\n");	
		}
		else
		{
			texto.append("Los valores exceden el limite de valores que ancho\n"
                                + " y longitud deben registrar\n\n");
		}
              JOptionPane.showMessageDialog(null, cuadro);
	}

	public void area()
	{
		if(ancho>=1.0 && ancho<=20.0 && longitud>=1.0 && longitud<=20.0)
		{
		  texto.append("El area del rectangulo es "+ (ancho*longitud));	
		}
		else
		{
			texto.append("Los valores exceden el limite de valores que ancho \n"
                                + "y longitud deben registrar\n\n");
		}
                JOptionPane.showMessageDialog(null, cuadro);
	}
	
	public static void main(String[] args)
	{
		rectangulo rec1=new rectangulo();
		rec1.leerdatos();
		rec1.perimetro();
		rec1.area();
		//hola
                
	}
}
