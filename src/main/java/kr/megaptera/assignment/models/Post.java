package kr.megaptera.assignment.models;

import kr.megaptera.assignment.dtos.PostRequestDto;

public class Post extends BaseEntity {
  private String title;
  private String author;
  private String content;

  public String getId() {
    return id;
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

  public Post(PostRequestDto request){
    super();
    title = request.getTitle();
    author = request.getAuthor();
    content = request.getContent();
  }

  public void update(PostRequestDto request) {
    title = request.getTitle();
    content = request.getContent();
  }
}
