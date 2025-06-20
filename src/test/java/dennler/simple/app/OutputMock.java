package dennler.simple.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OutputMock implements OutputInterface {
  List<String> messages = new ArrayList<>();

  @Override
  public void send(String message) {
    messages.add(message);
  }

  public List<String> getOutput() {
    return messages;
  }

  public Optional<String> getOutput(int index) {
    if (index < 0 || index >= messages.size()) {
      return Optional.empty();
    } else {
      return Optional.of(messages.get(index));
    }
  }
}
