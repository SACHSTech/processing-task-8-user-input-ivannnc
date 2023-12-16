import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  float r = 32;
  float g = 32;
  float b = 32;

  float circleX = 150;
  float circleY = 150;

  String message = "";

  public void setup() {
    background(r, g, b);
    textSize(30);
  }

  
  public void draw() {
    if(mousePressed){
      fill(0, 255, 255);
      rect(mouseX, mouseY, 50, 30);
      text(message, 25, 150);
    }

    fill(255, 102, 0);
    textSize(50);
    text(key, 100, 100);


  }

  public void mouseClicked() {
    fill(255, 255, 255);
    ellipse(mouseX, mouseY, 50, 50);
    ellipse(mouseX - 15, mouseY, 20, 20);
    ellipse(mouseX + 15, mouseY, 20, 20);
    fill(0, 0, 0);
    ellipse(mouseX - 15, mouseY, 10, 10);
    ellipse(mouseX + 15, mouseY, 10, 10);
  }

  public void mouseWheel() {
    r = 255;
    g = 102;
    b = 0;
  }
  public void keyPressed() {
    if (keyPressed) {
      if (keyCode == UP) {
        circleY--;
      }
      else if (keyCode == DOWN) {
        circleY++;
      }
      else if (keyCode == LEFT) {
        circleX--;
      }
      else if (keyCode == RIGHT) {
        circleX++;
      }
    }
  
    ellipse(circleX, circleY, 100, 100);
    ellipse(circleX, circleY, 20, 20);

  }

  public void keyTyped() {
    message += key;
  }
  }
 
