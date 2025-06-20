package dennler.simple.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

public class SimpleAppTest {

  @Test
  public void testDefaultMessage() throws Exception {
    OutputMock output = new OutputMock();
    SimpleApplication app = new SimpleApplication(output);

    ApplicationArguments args = new DefaultApplicationArguments();

    app.run(args);

    Assertions.assertEquals(2, output.getOutput().size());
    Assertions.assertEquals("Application started", output.getOutput(0).get());
    Assertions.assertEquals("hello world", output.getOutput(1).get());
  }

  @Test
  public void testCustomMessage() throws Exception {
    OutputMock output = new OutputMock();
    SimpleApplication app = new SimpleApplication(output);

    ApplicationArguments args = new DefaultApplicationArguments("--message=test message");

    app.run(args);

    Assertions.assertEquals(2, output.getOutput().size());
    Assertions.assertEquals("Application started", output.getOutput(0).get());
    Assertions.assertEquals("test message", output.getOutput(1).get());
  }

}
