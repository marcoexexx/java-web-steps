package com.chordstack.todo.model;

import java.util.Optional;

// POJO
public class Todo {
  private String title;
  private boolean isCompleted;
  private Optional<String> description;

  public Todo(String title, boolean isCompleted, String description) {
    this.title = title;
    this.isCompleted = isCompleted;
    this.description = description == null ? null : Optional.of(description);
  }

  public String getTitle() {
    return this.title;
  }

  public Optional<String> getDescription() {
    return this.description;
  }

  public boolean getIsCompleted() {
    return this.isCompleted;
  }
}
