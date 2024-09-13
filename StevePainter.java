import org.code.neighborhood.*;
public class StevePainter extends BackgroundPainter {

  //This method drawSteve is used to call out the other methods in order to draw Steve.
  public void drawSteve(){
    drawHair(24);
    drawFace(70);
    drawEyes();
    drawNose();
    drawBeard();
    goToEnd();
  }


/*  
This method is used drawHair is used to draw the hair of
Steve using a while loop that controls the amount of spaces
the painter can go
*/
  public void drawHair(int spaces){
    setPaint(spaces);
    turnRight();
    move();
    move();
    turnLeft();
    move();
    move();
    while(spaces>16){
      paint("saddleBrown");
      move();
      spaces--;
    }
    turnRight();
    move();
    turnRight();
    move();
    while(spaces>8){
      paint("saddleBrown");
      move();
      spaces--;
    }
    turnLeft();
    move();
    turnLeft();
    move();
    while(spaces>0){
      paint("saddleBrown");
      move();
      spaces--;
    }
  }
/*  
This method is supposed to draw the face of Steve and is similar as drawHair because
it uses a while loop that controls the amount of spaces the painter can go
*/
  public void drawFace(int spaces){
    setPaint(spaces);
    turnRight();
    turnRight();
    move();
    move();
    while(spaces>64){
      paint("tan");
      move();
      spaces--;
    }
    turnLeft();
    move();
    turnLeft();
    while(spaces>56){
      paint("tan");
      move();
      spaces--;
    }
    turnRight();
    move();
    turnRight();
    move();
    while(spaces>48){
      paint("tan");
      move();
      spaces--;
    }
    turnLeft();
    turnLeft();
    move();
    while(spaces>40){
      paint("tan");
      move();
      spaces--;
    }
    turnRight();
    move();
    turnRight();
    move();
    while(spaces>32){
      paint("tan");
      move();
      spaces--;
    }
    turnLeft();
    turnLeft();
    move();
    while(spaces>24){
      paint("tan");
      move();
      spaces--;
    }
    turnRight();
    move();
    turnRight();
    move();
    while(spaces>16){
      paint("tan");
      move();
      spaces--;
    }
    turnLeft();
    turnLeft();
    move();
    while(spaces>8){
      paint("tan");
      move();
      spaces--;
    }
    turnRight();
    move();
    turnRight();
    move();
    while(spaces>0){
      paint("tan");
      move();
      spaces--;
    }
  }
/* 
This method is called drawEyes because its function is to
draw the eyes of Steve. This doesn't use methods because
it is only 4 units of paint and it can be easily executed
by using the method paintLine frmo the background painter.
*/
  public void drawEyes(){
    turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    paintLine("white",1);
    paintLine("navy",1);
    move();
    move();
    paintLine("navy",1);
    paintLine("white",1);
  }

  /* 
  Both methods, drawNose and drawBeard have similar funcionality, both using paintLine to draw. drawNose paints the nose
  while drawBeard paints the beard.
  
  */
  public void drawNose(){
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    paintLine("chocolate",2);
  }
  public void drawBeard(){
    turnLeft();
    move();
    paintLine("saddleBrown",2);
    turnLeft();
    move();
    turnLeft();
    move();
    turnRight();
    paintLine("saddleBrown",2);
    turnLeft();
    paintLine("saddleBrown",2);
  }
  /* 
  This method is used for the steve painter to go
  to the finish line which is where the background painter is at 
  the bottom right of the screen
  */
  public void goToEnd(){
    turnRight();
    while (canMove()){
      move();
    }
      turnRight();
      moveFast();
  }
  




  
}
