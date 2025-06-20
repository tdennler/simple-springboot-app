package dennler.simple.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class SimpleOutput implements OutputInterface {
  private static final Logger LOGGER = LoggerFactory.getLogger(SimpleApplication.class);

  @Override
  public void send(String message) {
    LOGGER.info(message);
  }
}
