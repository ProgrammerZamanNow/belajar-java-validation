package programmerzamannow.validation.extractor;

import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.UnwrapByDefault;
import jakarta.validation.valueextraction.ValueExtractor;
import programmerzamannow.validation.container.DataInteger;

@UnwrapByDefault
public class DataIntegerValueExtractor
    implements ValueExtractor<@ExtractedValue(type = Integer.class) DataInteger> {

  @Override
  public void extractValues(DataInteger originalValue, ValueReceiver receiver) {
    receiver.value(null, originalValue.getData());
  }
}
