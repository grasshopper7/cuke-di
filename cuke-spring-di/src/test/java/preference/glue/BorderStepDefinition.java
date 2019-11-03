package preference.glue;

import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.When;
import preference.data.Border;

public class BorderStepDefinition {
	
	@Autowired
	private Border border;

	@When("User selects border details")
	public void user_selects_below_border_details(@Transpose Border border) {	    
		this.border.setStyle(border.getStyle());
		this.border.setColor(border.getColor());
		this.border.setWidth(border.getWidth());
		System.out.println();
		System.out.println("Selected Border options are : ");
		System.out.println(this.border);
	}
}
