package com.doto.doto.dto.documents;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class AccountDto {

    private String name;
    private String surname;
    private String userName;
    private String email;
}
