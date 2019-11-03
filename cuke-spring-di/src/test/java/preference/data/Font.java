package preference.data;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class Font {

	private String style = "arial";
	private String color = "black";
	private String weight = "normal";
}
