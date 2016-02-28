import java.awt.*;

public class Player
{
public String name;
public int pName;
public int xpos;
public int ypos;
public int dx;
public int dy;
public int speed;
public int acceleration;
public int power;
public Boolean chosen;

public Player(String pName)
{

name = pName;
chosen = false;

if (pName == "Max")
{  
   
   xpos = 50;
   ypos = 50;
   dx = 0;
   dy = 0;
   speed = 8;
   
}

if (pName == "Jonny")
{
   
   xpos = 50;
   ypos = 100;
   dx = 0;
   dy = 0;
   speed = 8;
   
}

if (pName == "Danny")
{
   xpos = 50;
   ypos = 150;
   dx = 0;
   dy = 0;
   speed = 5;
   acceleration = 5;
   power = 10;
   
}

if (pName == "George")
{
   
   xpos = 50;
   ypos = 200;
   dx = 0;
   dy = 0;
   speed = 5;
   acceleration = 7;
   power = 8;
   

}

if (pName == "Jeffrey")
{
   
   xpos = 50;
   ypos = 250;
   dx = 0;
   dy = 0;
   speed = 7;
   acceleration = 6;
   power = 7;
   

}

if (pName == "Lok")
{
   
   xpos = 50;
   ypos = 300;
   dx = 0;
   dy = 0;
   speed = 5;
   acceleration = 8;
   power = 7;
   

}

if (pName == "Jaime")
{
   
   xpos = 50;
   ypos = 350;
   dx = 0;
   dy = 0;
   speed = 4;
   acceleration = 8;
   power = 8;
   

}

if (pName == "Romain")
{
   
   xpos = 50;
   ypos = 400;
   dx = 0;
   dy = 0;
   speed = 5;
   acceleration = 6;
   power = 9;
   

}

if (pName == "Andrew")
{
   
   xpos = 50;
   ypos = 450;
   dx = 0;
   dy = 0;
   speed = 4;
   acceleration = 8;
   power = 8;
   

}

if (pName == "Chuck")
{
   
   xpos = 50;
   ypos = 500;
   dx = 0;
   dy = 0;
   speed = 6;
   acceleration = 6;
   power = 8;
   

}

if (pName == "Jack")
{
   
   xpos = 50;
   ypos = 550;
   dx = 0;
   dy = 0;
   speed = 6;
   acceleration = 5;
   power = 9;
   

}

if (pName == "Nathan")
{
   
   xpos = 50;
   ypos = 600;
   dx = 0;
   dy = 0;
   speed = 6;
   acceleration = 7;
   power = 7;

}

if (pName == "Ivan")
{
   
   xpos = 50;
   ypos = 600;
   dx = 0;
   dy = 0;
   speed = 6;
   acceleration = 7;
   power = 7;

}

if (pName == "Will")
{
   
   xpos = 50;
   ypos = 650;
   dx = 0;
   dy = 0;
   speed = 8;
   acceleration = 6;
   power = 6;

}
}
}