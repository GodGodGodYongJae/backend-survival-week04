package kr.megaptera.assignment.application;

import kr.megaptera.assignment.dtos.PostRequestDto;
import kr.megaptera.assignment.dtos.PostDto;
import kr.megaptera.assignment.models.Post;
import kr.megaptera.assignment.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
  private final PostRepository postRepository;

  public PostService() {
    postRepository = new PostRepository();
  }

  public List<PostDto> getPostList() {
    return postRepository.findAll().stream().map(PostDto::of).toList();
  }

  public PostDto getDetail(String id){
    Post post = postRepository.find(id);
    return PostDto.of(post);
  }
  public PostDto createPost(PostRequestDto request){
    Post post = new Post(request);
    postRepository.save(post);
    return PostDto.of(post);
  }

  public PostDto updatePost(PostRequestDto request){
      Post post = postRepository.find(request.getId());
      post.update(request);
      return PostDto.of(post);
  }
  public PostDto deletePost(String id){
    Post post = postRepository.find(id);
    postRepository.delete(id);
    return PostDto.of(post);
  }
}
