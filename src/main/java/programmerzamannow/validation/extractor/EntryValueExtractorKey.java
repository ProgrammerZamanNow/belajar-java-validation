package programmerzamannow.validation.extractor;

import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;
import programmerzamannow.validation.container.Entry;

public class EntryValueExtractorKey implements ValueExtractor<Entry<@ExtractedValue ?, ?>> {

  @Override
  public void extractValues(Entry<?, ?> originalValue, ValueReceiver receiver) {
    receiver.keyedValue(null, "key", originalValue.getKey());
  }
}
