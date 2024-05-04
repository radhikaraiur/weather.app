class Room
{
    int length.breadth;
    Room(int x,int y)
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return(length*breadth);
    }
}
class ClassRoom extends Room
{
    int height;
    ClassRoom(int x,int y,int z)
    {
        super(x,y);
        height=z;
    }
}