void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍

  //hair
  stroke(0);
  fill(255, 145, 0);
  rect(200, 100, 20, 30);

  //body
  stroke(0);
  fill(83, 206, 228);
  rect(200, 325, 50, 100);

  //head
  stroke(0);
  fill(83, 206, 228);
  ellipse(200, 200, 200, 200);

  //eyes
  fill(0);
  ellipse(185, 200, 20, 20);

  fill(0);
  ellipse(215, 200, 20, 20);

  //pupils
  fill(255);
  ellipse(184, 201, 10, 10);

  fill(255);
  ellipse(215, 200, 10, 10);
  
  //mouth
  stroke(0);
  fill(99, 33, 33);
  ellipse(200, 255, 100, 50);

  //eye brows
  stroke(255, 145, 0);
  line(190, 180, 167, 182);

  stroke(255, 145, 0);
  line(210, 180, 233, 182);
 
  
  
 

  
 
	

}