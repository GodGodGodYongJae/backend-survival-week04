package kr.megaptera.assignment.models;

import kr.megaptera.assignment.dtos.CommentRequestDto;

public class Comment extends BaseEntity{
  private String postId;
  private String author;
  private String content;

  public Comment(CommentRequestDto request) {
    super();
    postId = request.getPostId();
    author = request.getAuthor();
    content = request.getContent();
  }

  public String getId(){
    return id;
  }
  public String getPostId() {
    return postId;
  }

  public String getAuthor() {
    return author;
  }

  public String getContent() {
    return content;
  }

  public void update(CommentRequestDto request) {
      content = request.getContent();
  }
}
