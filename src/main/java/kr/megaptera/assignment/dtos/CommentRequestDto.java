package kr.megaptera.assignment.dtos;

public class CommentRequestDto {
  private String id;
  private String postId;
  private String author;
  private String content;

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setPostId(String postId) {
    this.postId = postId;
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
}
