package CorregidoTarea4;

import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Circle {
	int direccion=(positionX%10)+1;
	Color colorhoriz;
public WallJump(){
	size = 100;
	aceleracion=0.5f;
	colorhoriz = Color.RED;
}

public void DetectarPared(){
if(positionX+size > 800)
{
Rebotar();
CambiarColor();
}
}


public void Rebotar(){

	if(positionX-size<0){
		velocityX = 1f;
		direccion=direccion*-1;
		
	}else if(positionX+size>=800){
		velocityX=0.1f;
		direccion=direccion*-1;
		
	}
}
public void CambiarColor()
{
colorhoriz = Color.ORANGE;
}
@Override
public void Draw (Graphics g){	
g.setColor(colorhoriz);
g.fillOval(positionX,positionY,size,size);
}


}
