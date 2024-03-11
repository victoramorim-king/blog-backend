package com.bigchampsolution.blogbackend.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {
  @CrossOrigin(origins = "*")
  @GetMapping("/posts")
  public List<Post> getAll() {
    // Criando uma lista de posts (substitua isso com seus dados reais)
    List<Post> posts = Arrays.asList(
      new Post(1L, "Hello world", "Esse é meu primeiro post!"),
      new Post(2L, "Objetivo desse projeto", "Esse projeto foi criado para expor todo meu potencial como programador para o mudno!!!")
    );

    return posts;
  }

  // Classe de modelo para representar um post
  static class Post {
    private Long id;
    private String title;
    private String content;

    public Post(Long id, String title, String content) {
      this.id = id;
      this.title = title;
      this.content = content;
    }

    public Long getId() {
      return id;
    }

    public String getTitle() {
      return title;
    }

    public String getContent() {
      return content;
    }
  }
}

