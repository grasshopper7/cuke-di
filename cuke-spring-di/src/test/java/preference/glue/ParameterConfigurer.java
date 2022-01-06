package preference.glue;

import java.lang.reflect.Type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;

public class ParameterConfigurer {

	private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

	@DefaultParameterTransformer
	@DefaultDataTableEntryTransformer
	@DefaultDataTableCellTransformer
	public Object defaultTransformer(Object fromValue, Type toValueType) {
		JavaType javaType = objectMapper.constructType(toValueType);
		return objectMapper.convertValue(fromValue, javaType);
	}
}
