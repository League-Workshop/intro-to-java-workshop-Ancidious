PImage mustache;
PImage friend;

void setup() {
  friend = loadImage("friend.png");
  mustache = loadImage("mustache.jpeg");
  size(800, 800);
  friend.resize(800, 800);
  background(friend);
 
}

void draw() {
  if(mouseButton == RIGHT) {
   image(mustache, 190, 400);
   if(mouseButton == LEFT) {
     mustache.resize( 1, 1);
   }
  }
}