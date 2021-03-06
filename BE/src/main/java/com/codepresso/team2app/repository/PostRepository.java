package com.codepresso.team2app.repository;

import ch.qos.logback.core.util.InvocationGate;
import com.codepresso.team2app.vo.HashTag;
import com.codepresso.team2app.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostRepository {
    Integer save(@Param("post") Post post, HashTag hashTag);
    Integer savePost(@Param("post") Post post);
    List<Post> findAllPost(@Param("id") long id);
    Integer updateLike(Post post);
    List<Post> findOnePost(@Param("id") long id);
    Integer updateContent(@Param("post") Post post);
    Integer noVisiblePost(@Param("id") long id);
    Integer updateCountComment(@Param("id") long id);
    List<Post> findByAuthor(@Param("author") long author);
    List<Post> findAllPost();
    Integer updateLike(@Param("postId") long postId, @Param("count") int count);

}
