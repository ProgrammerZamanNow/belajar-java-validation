package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.container.Data;
import programmerzamannow.validation.container.DataInteger;
import programmerzamannow.validation.container.Entry;

public class ValueExtractorTest extends AbstractValidatorTest{

  @Test
  void testSampleData() {

    SampleData data = new SampleData();
    data.setData(new Data<>());
    data.getData().setData("   ");

    validate(data);

  }

  @Test
  void testSampleEntry() {

    SampleEntry sampleEntry = new SampleEntry();
    sampleEntry.setEntry(new Entry<>());
    sampleEntry.getEntry().setKey("");
    sampleEntry.getEntry().setValue("");

    validate(sampleEntry);

  }

  @Test
  void testSampleDataInteger() {

    SampleDataInteger sampleDataInteger = new SampleDataInteger();
    sampleDataInteger.setData(new DataInteger());
    sampleDataInteger.getData().setData(0);

    validate(sampleDataInteger);

  }
}
