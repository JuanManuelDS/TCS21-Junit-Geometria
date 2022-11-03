package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.*;

class GeometriaTest {
	
	Geometria geometria = new Geometria();
	
	@Test
	public void testFiguraCuadrado() {
		geometria = new Geometria(1);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "cuadrado";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraCirculo() {
		geometria = new Geometria(2);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Circulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraTriangulo() {
		geometria = new Geometria(3);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Triangulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraRectangulo() {
		geometria = new Geometria(4);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Rectangulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraPentagono() {
		geometria = new Geometria(5);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Pentagono";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraRombo() {
		geometria = new Geometria(6);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraRomboide() {
		geometria = new Geometria(7);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Romboide";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraTrapecio() {
		geometria = new Geometria(8);
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Trapecio";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFiguraDefault() {
		String resultado = geometria.figura(geometria.getId());
		String esperado = "Default";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testGetNom() {
		String resultado = geometria.getNom();
		String esperado = "Default";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testToString() {
		String resultado = geometria.toString();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testSetArea() {
		double esperado = 16;
		geometria.setArea(esperado);
		double resultado = geometria.getArea();
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	public void testAreaCuadrado() {
		int resultado = geometria.areacuadrado(4);
		int esperado = 16;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geometria.areaCirculo(4);
		double esperado = 50.2656;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaTriangulo() {
		int resultado = geometria.areatriangulo(4, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaRectangulo() {
		int resultado = geometria.arearectangulo(4, 2);
		int esperado = 8;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaPentagono() {
		int resultado = geometria.areapentagono(4, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaRombo() {
		int resultado = geometria.arearombo(4, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaRomboide() {
		int resultado = geometria.arearomboide(4, 4);
		int esperado = 16;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreaTrapecio() {
		int resultado = geometria.areatrapecio(4, 10, 2);
		int esperado = 14;
		assertEquals(resultado, esperado);
	}

}
