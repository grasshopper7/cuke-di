package wrapper.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import wrapper.data.Foo;
import wrapper.data.FooWrapper;

public class FooStepDefinition {

	private FooWrapper fooWrap;
	private Foo foo;

	public FooStepDefinition(FooWrapper fooWrapper) {
		this.fooWrap = fooWrapper;
	}
	
	@Given("Initial value is")
	public void initial_value_is() {
	    System.out.println("Initial value is : " +foo);
	}

	@When("Foo values are {string} and {string}")
	public void foo_values_are_and(String one, String two) {
		foo = new Foo(one,two);
		this.fooWrap.setFoo(foo);
	}
}
