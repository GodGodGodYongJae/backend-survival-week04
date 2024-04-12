package kr.megaptera.assignment.dtos;

public class PostRequestDto {
  private String id;
  private String title;
  private String author;
  private String content;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getContent() {
    return content;
  }
}
