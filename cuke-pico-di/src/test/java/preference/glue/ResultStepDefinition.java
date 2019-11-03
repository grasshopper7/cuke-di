package preference.glue;

import io.cucumber.java.en.Then;
import preference.data.Border;
import preference.data.Font;

public class ResultStepDefinition {
	
	private Font font;	
	private Border border;

	public ResultStepDefinition(Font font, Border border) {
		this.font = font;
		this.border = border;
	}

	@Then("Confirm user selections")
	public void confirm_user_selections() {
		System.out.println();
		System.out.println("Updated Font & Border options are : ");
		System.out.println(font);
		System.out.println(border);
	}
}
