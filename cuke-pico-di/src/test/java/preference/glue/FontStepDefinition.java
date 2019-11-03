package preference.glue;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.When;
import preference.data.Font;

public class FontStepDefinition {

	private Font font;
	
	public FontStepDefinition(Font font) {
		this.font = font;
	}

	@When("User selects font details")
	public void user_selects_below_font_details(@Transpose Font font) {
	    this.font.setStyle(font.getStyle());
	    this.font.setColor(font.getColor());
	    this.font.setWeight(font.getWeight());
	    System.out.println();
		System.out.println("Selected Font options are : ");
		System.out.println(this.font);
	}
}
