package preference.glue;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Then;
import preference.data.Border;
import preference.data.Font;

public class ResultStepDefinition {
	
	@Autowired
	private Font font;
	
	@Autowired
	private Border border;

	@Then("Confirm user selections")
	public void confirm_user_selections() {
		System.out.println();
		System.out.println("Updated Font & Border options are : ");
		System.out.println(font);
		System.out.println(border);
	}
}
