PImage mustache;
PImage friend;

void setup(){
    friend = loadImage("Clown.jpg");

size(800, 600);

friend.resize(width,height);

 mustache = loadImage("english-mustache.png");
 mustache.resize(200,200);
}

void draw() {
  background(friend);
  if (mousePressed) 
    image(mustache, mouseX,mouseY);
}