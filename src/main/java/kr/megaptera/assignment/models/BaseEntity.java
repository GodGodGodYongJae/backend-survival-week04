package kr.megaptera.assignment.models;

import java.util.UUID;

public class BaseEntity {
  protected String id;

  public BaseEntity() {
    this.id = UUID.randomUUID().toString();
  }

}
