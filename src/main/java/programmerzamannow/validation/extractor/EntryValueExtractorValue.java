package programmerzamannow.validation.extractor;

import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;
import programmerzamannow.validation.container.Entry;

public class EntryValueExtractorValue implements ValueExtractor<Entry<?, @ExtractedValue ?>> {

  @Override
  public void extractValues(Entry<?, ?> originalValue, ValueReceiver receiver) {
    receiver.keyedValue(null, "value", originalValue.getValue());
  }
}
