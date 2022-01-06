package preference.glue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import preference.config.Config;
import preference.data.Border;
import preference.data.Font;

@CucumberContextConfiguration
@ContextConfiguration(classes = { Config.class })
@DirtiesContext
public class PreferenceStepDefinition {

	@Autowired
	private Font font;

	@Autowired
	private Border border;

	@Given("User at preference selection page")
	public void user_at_preference_selection_page() {
		System.out.println("Welcome to user preference setup");
		System.out.println("Default Font & Border options are : ");
		System.out.println(font);
		System.out.println(border);
	}
}
