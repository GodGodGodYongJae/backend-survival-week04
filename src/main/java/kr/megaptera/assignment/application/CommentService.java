package kr.megaptera.assignment.application;

import kr.megaptera.assignment.dtos.CommentDto;
import kr.megaptera.assignment.dtos.CommentRequestDto;
import kr.megaptera.assignment.models.Comment;
import kr.megaptera.assignment.repositories.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
  private final CommentRepository commentRepository;

  public CommentService() {
    this.commentRepository = new CommentRepository();
  }

  public List<CommentDto> getList(String postId){
    List<Comment> comments = commentRepository.findAll(postId);
    return comments.stream().map(CommentDto::of).toList();
  }

  public CommentDto createComment(CommentRequestDto request){
    Comment comment = new Comment(request);
    commentRepository.save(comment);
    return CommentDto.of(comment);
  }

  public CommentDto updateComment(CommentRequestDto request){
    Comment comment = commentRepository.find(request.getId());
    comment.update(request);
    return CommentDto.of(comment);
  }
  public CommentDto deleteComment(String id){
    Comment comment = commentRepository.find(id);
    commentRepository.delete(id);
    return CommentDto.of(comment);
  }



}
