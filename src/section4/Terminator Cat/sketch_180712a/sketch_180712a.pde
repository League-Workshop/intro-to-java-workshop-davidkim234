PImage catPic;
void setup(){
  size(259,194);
  catPic = loadImage("cat.jpg");
                catPic.resize(259, 194);
background(catPic);
}
void draw(){
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(100,100,100);
ellipse(111, 72, 20, 20);
ellipse(175,71,20,20);
}