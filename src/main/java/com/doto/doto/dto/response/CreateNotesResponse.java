package com.doto.doto.dto.response;

import lombok.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateNotesResponse {

    private String id;
}
