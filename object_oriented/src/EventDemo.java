
class EventImpl implements Event{

	@Override
	public void doSomething() {
		System.out.println("Class level implementation");
		
	}
	
}
public class EventDemo {
	
	class InnerEventImpl implements Event{
		@Override
		public void doSomething() {
			System.out.println("Inner class implemntation");
			
		}
	}
public static class StaticInnerEventImpl implements Event{

	@Override
	public void doSomething() {
		System.out.println("Static Inner Class Implementation");
		// TODO Auto-generated method stub
		
	}
	
}
public void nestedEvent() {
	class NestedEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Nested Event Implementation");
			
		}
		
	};
	new NestedEventImpl().doSomething();
}
public void oneMoreEvent() {
	new Event() {

		@Override
		public void doSomething() {
			System.out.println("Anonymous Event Implementation");
		};
		}.doSomething();

	}
	
public void oneLastEvent() {
	Event e =() -> System.out.println("Lambda Event Implementation");
	e.doSomething();
}
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.doSomething();
		
		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.doSomething();
		
		EventDemo.StaticInnerEventImpl si = new EventDemo.StaticInnerEventImpl();
		si.doSomething();
		
		ed.nestedEvent();
	}


	}
	
	


