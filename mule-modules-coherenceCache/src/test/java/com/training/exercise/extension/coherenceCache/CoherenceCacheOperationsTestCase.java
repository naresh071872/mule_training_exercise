package com.training.exercise.extension.coherenceCache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.junit.Test;

public class CoherenceCacheOperationsTestCase extends MuleArtifactFunctionalTestCase {

  /**
   * Specifies the mule config xml with the flows that are going to be executed in the tests, this file lives in the test resources.
   */
  @Override
  protected String getConfigFile() {
    return "test-mule-config.xml";
  }

  @Test
  public void executePutOperation() throws Exception {
    /*String payloadValue = ((String) flowRunner("putFlow").run()
                                      .getMessage()
                                      .getPayload()
                                      .getValue());*/
    //assertThat(payloadValue, is(""));
  }
  @Test
  public void executeGetOperation() throws Exception {
    /*String payloadValue = ((String) flowRunner("getFlow").run()
                                      .getMessage()
                                      .getPayload()
                                      .getValue());
    assertThat(payloadValue, is("test cache1"));*/
  }

  @Test
  public void executeRetrieveInfoOperation() throws Exception {
    String payloadValue = ((String) flowRunner("retrieveInfoFlow")
                                      .run()
                                      .getMessage()
                                      .getPayload()
                                      .getValue());
    assertThat(payloadValue, is("Using Configuration [configId] with Connection id [aValue:100]"));
  }
}
