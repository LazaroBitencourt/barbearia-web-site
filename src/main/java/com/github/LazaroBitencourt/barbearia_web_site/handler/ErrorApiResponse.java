package com.github.LazaroBitencourt.barbearia_web_site.handler;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ErrorApiResponse {
    private String message;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String description;
}
