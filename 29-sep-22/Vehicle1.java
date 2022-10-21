package sep29lab;
//hierarchical inheritance
class Vehicle1 {//parent class A
void running() {
	System.out.println("running mode on");
}}
class Car1 extends Vehicle1{//child class b
	void run() {
		System.out.println("car run mode on");
	}}
class Bike1 extends Vehicle1{//child case C
	void Speed() {
		System.out.println("Speed is very high");
	}
public class Hirarchicalin{
	public void main(String[] args) {
Bike1 b=new Bike1();
b.running();
b.Speed();
Car1 c=new Car1();
c.running();
c.run();
	}}}
