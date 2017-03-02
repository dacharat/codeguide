#codeguide
##DRY (Don't repeat yourself)
means don't write duplicate code, instead use Abstraction to abstract common things in one place.If you have block of code in more than two place consider making it a separate method, or if you use a hard-coded value more than one time make them public final constant. Benefit of this Object oriented design principle is in maintenance. It's important  not to abuse it, duplication is not for code, but for functionality .It means, if you used common code to validate OrderID and SSN it doesn’t mean they are same or they will remain same in future. By using common code for two different functionality or thing you closely couple them forever and when your OrderID changes its format , your SSN validation code will break. So beware of such coupling and just don’t combine anything which uses similar code but are not related.
*Example

```sh

public String toString(){
		String name = this.name;
		return "My name is "+name;
	}
}

```
*Can rewrite to:
```sh

public String toString(){
		return "My name is "+this.name;
	}
```
Read more: [http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html#ixzz4a5XymuWn]

##Interface Segregation principle (ISP)
Interface Segregation Principle stats that, a client should not implement an interface, if it doesn't use that. This happens mostly when one interface contains more than one functionality, and client only need one functionality and not other.Interface design is tricky job because once you release your interface you can not change it without breaking all implementation. Another benefit of this design principle in Java is, interface has disadvantage to implement all method before any class can use it so having single functionality means less method to implement.

```sh

If you write many class and have same method, you can create interface and implements method in interface to make your code easy to read.
*Example
>public interface Shape {
>	public double findArea();
>	
>	public double findVolumn();
>}
```
Read more: [http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html#ixzz4a5YrePpR]


