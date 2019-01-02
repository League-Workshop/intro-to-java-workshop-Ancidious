void setup() {
size(800, 800);
background(0);
}
void draw() {
    if(mousePressed){
    fill(int (random(250))); 
   }
   else {
    fill(0);
  }
  noStroke();
  ellipse(400, 400, 400, 400);
}