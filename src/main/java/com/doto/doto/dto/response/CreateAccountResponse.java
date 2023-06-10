package com.doto.doto.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateAccountResponse {

    private String id;
}
