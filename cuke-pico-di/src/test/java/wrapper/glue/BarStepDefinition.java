package wrapper.glue;

import io.cucumber.java.en.Then;
import wrapper.data.Foo;
import wrapper.data.FooWrapper;

public class BarStepDefinition {

	private Foo foo;

	public BarStepDefinition(FooWrapper fooWrapper) {
		this.foo = fooWrapper.getFoo();
	}
	
	@Then("Final value is")
	public void final_value_is() {
		System.out.println();
		System.out.println("Final Value : " + foo);
	}
}
