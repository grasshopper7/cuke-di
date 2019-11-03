package preference.glue;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

public class ParameterConfigurer implements TypeRegistryConfigurer {

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {

		JacksonTransformer jacksonTransformer = new JacksonTransformer();
		typeRegistry.setDefaultParameterTransformer(jacksonTransformer);
		typeRegistry.setDefaultDataTableEntryTransformer(jacksonTransformer);
		typeRegistry.setDefaultDataTableCellTransformer(jacksonTransformer);
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	private static final class JacksonTransformer
			implements ParameterByTypeTransformer, TableEntryByTypeTransformer, TableCellByTypeTransformer {

		private final ObjectMapper objectMapper = new ObjectMapper();

		@Override
		public Object transform(String value, Type type) {
			return objectMapper.convertValue(value, objectMapper.constructType(type));
		}

		@Override
		public <T> T transform(Map<String, String> entry, Class<T> type, TableCellByTypeTransformer cellTransformer) {
			return objectMapper.convertValue(entry, type);
		}

		@Override
		public <T> T transform(String value, Class<T> cellType) {
			return objectMapper.convertValue(value, cellType);
		}
	}
}
