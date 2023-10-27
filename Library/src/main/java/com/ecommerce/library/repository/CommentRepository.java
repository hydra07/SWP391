package com.ecommerce.library.repository;

import com.ecommerce.library.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("select c from Comment c where c.recipe.id = ?1")
    List<Comment> findAllCommentByRecipeId(Long recipeId);


}
