package preference.glue;

import io.cucumber.java.en.Given;
import preference.data.Border;
import preference.data.Font;

public class PreferenceStepDefinition {
	
	private Font font;	
	private Border border;
	
	public PreferenceStepDefinition(Font font, Border border) {
		this.font = font;
		this.border = border;
	}

	@Given("User at preference selection page")
	public void user_at_preference_selection_page() {
		System.out.println("Welcome to user preference setup");
		System.out.println("Default Font & Border options are : ");
		System.out.println(font);
		System.out.println(border);
	}
}
