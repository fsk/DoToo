package com.doto.doto.dto.request.createrequest;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateAccountRequest {

    private String name;
    private String surname;
    private String userName;
    private String email;
    private String password;

}
