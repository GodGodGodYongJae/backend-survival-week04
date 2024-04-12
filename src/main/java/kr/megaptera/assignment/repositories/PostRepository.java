package kr.megaptera.assignment.repositories;

import kr.megaptera.assignment.models.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostRepository {
  private final Map<String, Post> posts;

  public PostRepository() {
    posts = new HashMap<>();
  }

  public List<Post> findAll(){
    return new ArrayList<>(posts.values());
  }

  public Post find(String id) {
    return posts.get(id);
  }
  public void save(Post post){
    posts.put(post.getId(), post);
  }
  public void delete(String id){
    posts.remove(id);
  }
}

