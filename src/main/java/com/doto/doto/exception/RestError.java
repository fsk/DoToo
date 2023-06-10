package com.doto.doto.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestError {

    private Integer status;

    private String message;

}
