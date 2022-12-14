package com.eacuamba.dev.reddit_clone_using_angular_spring.api.data_transfer_object.request.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PostRequest {
    @NotBlank(message = "Name of a post cannot be empty!")
    private String name;
    private String url;
    private String description;
    private Long subredditId;
}
