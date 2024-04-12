package kr.megaptera.assignment.controllers;

import kr.megaptera.assignment.application.CommentService;
import kr.megaptera.assignment.dtos.CommentDto;
import kr.megaptera.assignment.dtos.CommentRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
  private final CommentService commentService;

  public CommentController() {
    this.commentService = new CommentService();
  }

  @GetMapping
  public List<CommentDto> getCommentList(@RequestParam("postId") String postId) {
    return commentService.getList(postId);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CommentDto createComment(@RequestParam("postId") String postId,
      @RequestBody CommentRequestDto request) {
    request.setPostId(postId);
    return commentService.createComment(request);
  }

  @PatchMapping("/{id}")
  public CommentDto updateComment(@PathVariable String id, @RequestBody CommentRequestDto request){
    request.setId(id);
    return commentService.updateComment(request);
  }

  @DeleteMapping("/{id}")
  public CommentDto deleteComment(@PathVariable String id){
    return commentService.deleteComment(id);
  }

}
