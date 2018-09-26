package yevheniikarlov.analyticaltool.data;

import java.util.Objects;

import yevheniikarlov.analyticaltool.data.parameter.Question;
import yevheniikarlov.analyticaltool.data.parameter.ResponseType;
import yevheniikarlov.analyticaltool.data.parameter.Service;

public class Data {
  private Service service;
  private Question question;
  private ResponseType responseType;

  public Data(Service service, Question question, ResponseType responseType) {
    this.service = service;
    this.question = question;
    this.responseType = responseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Data data = (Data) o;
    return Objects.equals(service, data.service)
        && Objects.equals(question, data.question)
        && responseType == data.responseType;
  }

  public Service getService() {
    return service;
  }

  public Question getQuestion() {
    return question;
  }

  public ResponseType getResponseType() {
    return responseType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, question, responseType);
  }
}
