PImage rainbow;
  PImage unicorn;
void setup(){
  rainbow=loadImage("friend.png");
  unicorn=loadImage("rainbow.png");
  size(512,512);
  rainbow.resize(512,512);
  unicorn.resize(200,200);
}
void draw(){
  background(rainbow);
  image(unicorn,mouseX,mouseY);
  }