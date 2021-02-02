public class Square extends Shape{
    double side;
    public Square(double side,String name){
        super(name);
        this.side=side;
    }

    @Override
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        else if (this.getClass() != obj.getClass())
            return false;
        else {
            Square s = (Square) obj;
            return this.name.equals(s.name) && this.side == s.side;
        }
    }

    @Override
    public String toString() {
        return this.name+":"+this.side;
    }
}