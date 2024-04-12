package kr.megaptera.assignment.repositories;

import kr.megaptera.assignment.models.Comment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentRepository {
  private final Map<String, Comment> comments;

  public CommentRepository() {
    this.comments = new HashMap<>();
  }
  public List<Comment> findAll(String postId) {
    ArrayList<Comment> commentList = new ArrayList<>(comments.values());
    return commentList.stream().filter(comment -> comment.getPostId().equals(postId)).toList();
  }
  public Comment find(String id){
    return comments.get(id);
  }
  public void save(Comment comment){
    comments.put(comment.getId(),comment);
  }
  public void delete(String id){
    comments.remove(id);
  }
}

