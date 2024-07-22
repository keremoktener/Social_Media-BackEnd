package com.kerem.socialmediabackend.repository;

import com.kerem.socialmediabackend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostId(Long postId);

    List<Comment> findAllByPostIdIn(List<Long> postIds);
}
