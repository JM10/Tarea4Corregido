package CorregidoTarea4;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float gravity,aceleracion;
	public float jumpImpulse;

	public Circle()
	{
	size = 200;
	gravity = 0.2f;
	aceleracion=0.2f;
	aceleracion=0.2f;
	}
	public void Update()
	{
	AplicarGravedad();
	DetectarSuelo();
	ActualizarPosicion();
	}

	public void Update1(){
		aplicarAceleracion();
		DetectarPared();
		ActualizarPosicion();

	}
	public void ActualizarPosicion()
	{
	positionX = (int)velocityX;
	positionY = (int)velocityY;
	}
	public void DetectarSuelo()
	{
	if(positionY+size > 600)
	System.out.println("Detecte Suelo");
	}

	public void DetectarPared(){
		if(positionX+size > 800)
			System.out.println("Detecte Pared");
	}
	public void AplicarGravedad()
	{
	velocityY += gravity;

	}

	public void aplicarAceleracion(){
		velocityX+= aceleracion;
	}
	public void Draw (Graphics g){	
	g.setColor(Color.GREEN);
	g.fillOval(positionX,positionY,size,size);
	}

}
