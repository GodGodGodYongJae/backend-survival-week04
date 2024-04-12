package kr.megaptera.assignment.controllers;

import kr.megaptera.assignment.application.PostService;
import kr.megaptera.assignment.dtos.PostDto;
import kr.megaptera.assignment.dtos.PostRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
  private final PostService postService;
  public PostController(PostService postService) {this.postService = postService;}

  @GetMapping
  public List<PostDto> getList(){
    return postService.getPostList();
  }
  @GetMapping("/{id}")
  public PostDto getDetail(@PathVariable("id")String id){
    return postService.getDetail(id);
  }
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public PostDto create(@RequestBody PostRequestDto request){
    return postService.createPost(request);
  }

  @PatchMapping("/{id}")
  public PostDto update(@PathVariable String id,@RequestBody PostRequestDto request){
    request.setId(id);
    return postService.updatePost(request);
  }

  @DeleteMapping("/{id}")
  public  PostDto delete(@PathVariable String id){
    return postService.deletePost(id);
  }

}
