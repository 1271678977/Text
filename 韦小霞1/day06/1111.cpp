#include<iostream>
using namespace std;
class Point
{
private:
	int x,y;
public:
	Point(int,int);
};

Point::Point(int xx,int yy)
{
	x = xx;
	y = yy;
}
class Circle : public Point
{
private:
	int r;
public:
	Circle(int xx,int yy,int rr):Point(xx,yy)
	{
		r = rr;
	}
	void Show();
};
void Circle::Show()
{
	cout<<"(x1,y1)"<<endl;
	cout<<"r:"<<endl;
	cout<<"(x2,y2)"<<endl;
}

int main ()
{
	
	int x1,y1,x2,y2,r;
	
	cin>>x1>>y1>>r>>x2>>y2;

	if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))==r*r)
		
			cout<<"on"<<endl;
		
	else if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))<r*r)
		
			cout<<"in"<<endl;
		
		
    else if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))>r*r)


		cout<<"out"<<endl;
	
	return 0;
	
		
}