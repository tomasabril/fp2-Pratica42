package utfpr.dainf.if62c.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * por Tomás Abril
 */


public class Pratica42
{
    public static void main(String[] args) {
	Circulo cir = new Circulo(1);
	Elipse eli = new Elipse(1,2);
	
	System.out.println("perimetro circulo: " + cir.getPerimetro());
	System.out.println("area circulo: " + cir.getArea());
	System.out.println("perimetro elipse: " + eli.getPerimetro());
	System.out.println("area elipse: " + eli.getPerimetro());
    }
}
