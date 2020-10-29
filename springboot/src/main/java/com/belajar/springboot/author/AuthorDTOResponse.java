package com.belajar.springboot.author;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDTOResponse {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static AuthorDTOResponse parse(Author author) {
        return AuthorDTOResponse.builder().id(author.getId()).name(author.getName()).createdAt(author.getCreatedAt())
                .updatedAt(author.getUpdatedAt()).build();
    }
}
